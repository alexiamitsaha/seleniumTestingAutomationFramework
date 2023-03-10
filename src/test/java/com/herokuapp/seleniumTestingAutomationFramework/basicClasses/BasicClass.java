package com.herokuapp.seleniumTestingAutomationFramework.basicClasses;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


import java.util.concurrent.TimeUnit;

public class BasicClass {

    public static WebDriver driver;

    @BeforeClass
    public static void beforeClass(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

        @BeforeMethod
        public void beforeMethod() {
            driver.navigate().to("http://the-internet.herokuapp.com/");
            //driver.navigate().to("https://www.facebook.com/");
            sleepTest (2000);
        }

        @AfterMethod
        public void afterTest(){
            System.out.println(" ");
        }

        @AfterClass
        public void afterClass(){
            driver.quit();
        }

        public static void sleepTest(long sleeptime) {
            try {
                Thread.sleep(sleeptime);
            }
            catch (Exception e){

            }
        }
}
