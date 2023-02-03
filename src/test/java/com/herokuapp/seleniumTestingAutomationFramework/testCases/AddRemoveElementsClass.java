package com.herokuapp.seleniumTestingAutomationFramework.testCases;

import com.herokuapp.seleniumTestingAutomationFramework.basicClasses.BasicClass;
import com.herokuapp.seleniumTestingAutomationFramework.basicClasses.TheInternet;
import com.herokuapp.seleniumTestingAutomationFramework.pages.Add_Remove_Elements_Pages;
import com.herokuapp.seleniumTestingAutomationFramework.utilities.Data;
import org.testng.Assert;
import org.testng.annotations.Test;
//import java.sql.driver;

public class AddRemoveElementsClass extends BasicClass {

    @Test
    public void addRemoveElements(){

        TheInternet ti = new TheInternet(driver);
        Add_Remove_Elements_Pages are =new Add_Remove_Elements_Pages(driver);

        //TestClass 01:Validation form Home URL
        String baseLink = driver.getCurrentUrl();
        System.out.println("Given" +baseLink);
        Assert.assertEquals(baseLink, Data.BASEURL);
        System.out.println("Home URL is Vaild");
        sleepTest(2000);

        //TestClass 02: page Header Validation
        sleepTest(2000);
        if (ti.getAddRemoveElements().isDisplayed()){
            String addRemoveElementsText =ti.getAddRemoveElements().getText();
            Assert.assertEquals(true,addRemoveElementsText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        ti.getAddRemoveElements().click();

        //Testcase 03: Corresponding Page URL Validation
        String baselink = driver.getCurrentUrl();
        System.out.println("Given"+baselink);
        Assert.assertEquals(baselink,Data.BASEURL+Data.ADD_REMOVE_ELEMENTS_LINK);
        System.out.println("TestLink is Validate");
        sleepTest(2000);

        //Testcase 04: header validation
        sleepTest(2000);
        if (are.getAddRemoveElementsHeader().isDisplayed()){
            String addRmvHeader= are.getAddRemoveElementsHeader().getText();
            Assert.assertTrue(true,addRmvHeader);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        sleepTest(2000);
        are.getAddElement().click();

        sleepTest(2000);
        are.getAddElement().click();

        sleepTest(2000);
        are.getDelete1().click();

        sleepTest(2000);
        are.getdelete2().click();

        sleepTest(2000);
        driver.navigate().back();

        sleepTest(2000);







    }

}
