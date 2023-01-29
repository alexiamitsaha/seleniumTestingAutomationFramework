package com.herokuapp.seleniumTestingAutomationFramework.pages;

import com.herokuapp.seleniumTestingAutomationFramework.basicClasses.BasicPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.sql.Driver;

public class Add_Remove_Elements_Pages extends BasicPage {
    public Add_Remove_Elements_Pages(WebDriver driver){
        super (driver);
    }

    //Header
    @FindBy(css= "div#content > h3")
    public WebElement addRemoveElementsHeader;
    public WebElement getAddRemoveElementsHeader() {
        return addRemoveElementsHeader;
    }

    //WebElement addElement= driver.findElement(By.xpath("//div[@id='content']//button[.='Add Element']"))
    @FindBy(xpath= "//div[@id='content']//button[.='Add Element']")
    public WebElement addElement;
    public WebElement getAddElement(){
        return addElement;
    }

    //WebElement delete1=driver.findElement(By.xpath("//div[@id='elements']/button[1]"));
    @FindBy(xpath = "//div[@id='elements']/button[2]")
    public WebElement delete1;

    public WebElement getDelete1() {
        return delete1;
    }

    //WebElement delete2=driver.findElement(By.xpath("//div[@id='elements']/button[2]"));
    @FindBy(xpath= "//div[@id='elements']/button[1]")
    public WebElement delete2;
    public WebElement getdelete2(){
        return delete2;
    }
}
