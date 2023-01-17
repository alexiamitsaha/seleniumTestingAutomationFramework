package com.herokuapp.seleniumTestingAutomationFramework.pages;

import com.herokuapp.seleniumTestingAutomationFramework.basicClasses.BasicPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AbTestingPage extends BasicPage {

    //Extend BasePages from inherit this function
    public AbTestingPage(WebDriver driver)
    {
        super(driver);
    }
    //http://the-internet.herokuapp.com/abtest
    @FindBy(xpath="//div[@id='content']//h3[.='A/B Test Variation 1']")
    public WebElement AbTestingPagesVariation1;

    public WebElement getAbTestingPagesVariation1(){
        return AbTestingPagesVariation1;
    }
    //public static final String Amit = "dhaka";

    //A/B Test Control
    @FindBy(css = "#content h3 p div")
    public WebElement AbTestControl;

    public WebElement getAbTestControl() {
        return AbTestControl;
    }

    //Paragraph
    @FindBy(xpath="//div[@id='content']//p")
    public WebElement AbTestingParagraph;
    public WebElement getAbTestingParagraph(){
        return  AbTestingParagraph;
    }
//div[@id='content']//h3[.='A/B Test Variation 1']
}
