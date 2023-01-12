package com.herokuapp.seleniumTestingAutomationFramework.basicClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

//all pages are gave in the base page
public class BasicPage {

    //Initialize The  webDriver & reference variable 'driver'.
    public WebDriver Driver;

    // Creating the constructor & it will be the same name of the class name.
    // This part is for Driver
    public BasicPage(WebDriver driver) {
        this.Driver = driver; // For calling the constructor as a global declaration.
        this.inItPage(); // Also called the below methode , because we use the constructor other pages
    }

    private void inItPage() {
        PageFactory.initElements(Driver, this);     // every page have webElements. so we have to globally declare
                                                        // webElement.That's why we use initElement() methode.Which came from PageFactory package.
                                                        //Also called the Driver from above
    }
}
