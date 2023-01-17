package com.herokuapp.seleniumTestingAutomationFramework.testCases;

import com.herokuapp.seleniumTestingAutomationFramework.basicClasses.BasicClass;
import com.herokuapp.seleniumTestingAutomationFramework.basicClasses.TheInternet;
import org.junit.Test;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.Assert;
import com.herokuapp.seleniumTestingAutomationFramework.pages.AbTestingPage;
import com.herokuapp.seleniumTestingAutomationFramework.utilities.Data;
import com.herokuapp.seleniumTestingAutomationFramework.basicClasses.TheInternet;

public class AbTestingClass extends BasicClass {

    @Test
    public void ABTesting(){
        TheInternet TI = new TheInternet(Driver); //using this class in java we have to create new instance
        AbTestingPage ABT = new AbTestingPage(Driver);
        
        //TestCase 01 : Home URl Validation
        String baseLink = Driver.getCurrentUrl();
        System.out.println("Given" +baseLink);
        Assert.assertEquals(baseLink, Data.BASEURL);
        System.out.println("Home URL is Validate");
        sleepTest(2000);

        //TestCase 02 : Header Validation







    }
}
