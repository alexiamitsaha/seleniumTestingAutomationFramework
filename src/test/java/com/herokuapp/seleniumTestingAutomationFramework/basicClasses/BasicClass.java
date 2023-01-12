package com.herokuapp.seleniumTestingAutomationFramework.basicClasses;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import java.util.concurrent.TimeUnit;

public class BasicClass {

    public static WebDriver Driver;

    @BeforeClass
    public static void beforeClass(){

        WebDriverManager.chromedriver().setup();
        Driver = new ChromeDriver();

        Driver.manage().window().maximize();
        Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

        @BeforeMethod
        public void beforeMethod() {
            Driver.navigate().to("http://the-internet.herokuapp.com/");
            //driver.navigate().to("https://www.facebook.com/");
            //sleepTest (2000);
        }

        @AfterMethod
        public void afterTest(){
            System.out.println(" ");
        }

        @AfterClass
        public void afterClass(){
            Driver.quit();
        }

        public static void sleepTest(long sleeptime) {
            try {
                Thread.sleep(sleeptime);
            }
            catch (Exception e){

            }
        }
}
