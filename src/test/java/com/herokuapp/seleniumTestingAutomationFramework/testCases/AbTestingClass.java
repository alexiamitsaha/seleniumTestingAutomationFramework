package com.herokuapp.seleniumTestingAutomationFramework.testCases;

import com.herokuapp.seleniumTestingAutomationFramework.basicClasses.BasicClass;
import com.herokuapp.seleniumTestingAutomationFramework.basicClasses.TheInternet;
import org.testng.Assert;
import com.herokuapp.seleniumTestingAutomationFramework.pages.AbTestingPage;
import com.herokuapp.seleniumTestingAutomationFramework.utilities.Data;
import org.testng.annotations.Test;

public class AbTestingClass extends BasicClass {
    @Test
    public void ABTesting(){
        TheInternet TI = new TheInternet(driver); //using this class in java we have to create new instance
        AbTestingPage ABT = new AbTestingPage(driver);
        
        //TestCase 01 : Home URl Validation
        String baseLink = driver.getCurrentUrl();
        System.out.println("Given" +baseLink);
        Assert.assertEquals(baseLink, Data.BASEURL);
        System.out.println("Home URL is Validate");
        //sleepTest(2000);

        //TestCase 02 : Header Validation
        if (TI.getAbTesting().isDisplayed())
        {
            String abTesting= TI.getAbTesting().getText();
            Assert.assertEquals(Data.AB_TESTING,abTesting);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        TI.abTesting.click();
        sleepTest(2000);

        //Testcase 03: Corresponding page URL Validation

        String link = driver.getCurrentUrl();
        System.out.println("Given "+link);
        Assert.assertEquals(link, Data.BASEURL+Data.AB_Test_LINK);
        System.out.println("Link is Validate");
        sleepTest(2000);

        //TestCase 04: Paragraph Validation

        if (ABT.getAbTestingPagesVariation1().isDisplayed())

        {
            String header1= ABT.getAbTestingPagesVariation1().getText();
            Assert.assertEquals(Data.AB_TEST_VARIATION1,header1);
        }
        else if(ABT.getAbTestControl().isDisplayed()){
            String header2= ABT.AbTestControl.getText();
            Assert.assertEquals(Data.AB_TEST_VARIATION1,header2);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        sleepTest(2000);
        driver.navigate().back();
        sleepTest(5000);

    }
}
