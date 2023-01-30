package com.herokuapp.seleniumTestingAutomationFramework.testCases;

import com.herokuapp.seleniumTestingAutomationFramework.basicClasses.BasicClass;
import com.herokuapp.seleniumTestingAutomationFramework.basicClasses.TheInternet;
import com.herokuapp.seleniumTestingAutomationFramework.pages.Add_Remove_Elements_Pages;
import com.herokuapp.seleniumTestingAutomationFramework.utilities.Data;
import org.testng.Assert;
import org.testng.annotations.Test;
//import sun.jvm.hotspot.debugger.cdbg.BaseClass;

import java.sql.Driver;

public class AddRemoveElementsClass extends BasicClass {

    @Test
    public void addRemoveElements(){

        TheInternet TI = new TheInternet(driver);
        Add_Remove_Elements_Pages ARE =new Add_Remove_Elements_Pages(driver);

        //TestClass 01:Validation form Home URL
        String baseLink = driver.getCurrentUrl();
        System.out.println("Given" +baseLink);
        Assert.assertEquals(baseLink, Data.BASEURL);
        System.out.println("Home URL is Vaild");
        sleepTest(2000);

        //TestClass 02: page Header Validation
        sleepTest(2000);
        if (TI.getAddRemoveElements().isDisplayed()){
            String addRemoveElementsText =TI.getAddRemoveElements().getText();
            Assert.assertEquals("Add/Remove Elements",addRemoveElementsText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        TI.getAddRemoveElements().click();

        //Testcase 03: Corresponding Page URL Validation
        String baselink = driver.getCurrentUrl();
        System.out.println("Given"+baselink);
        Assert.assertEquals(baselink,Data.BASEURL+Data.ADD_REMOVE_ELEMENTS_LINK);
        System.out.println("TestLink is Validate");
        sleepTest(2000);

        //Testcase 04: header validation
        sleepTest(2000);
        if (ARE.getAddRemoveElementsHeader().isDisplayed()){
            String addRmvHeader= ARE.getAddRemoveElementsHeader().getText();
            Assert.assertTrue(true,addRmvHeader);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        sleepTest(2000);
        ARE.getAddElement().click();

        sleepTest(2000);
        ARE.getAddElement().click();

        sleepTest(2000);
        ARE.getDelete1().click();

        sleepTest(2000);
        ARE.getdelete2().click();

        sleepTest(2000);
        driver.navigate().back();

        sleepTest(2000);







    }

}
