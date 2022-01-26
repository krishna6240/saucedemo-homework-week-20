package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage extends Utility {
    private static final Logger log = LogManager.getLogger(LogOutPage.class.getName());

    public LogOutPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "first-name")
    WebElement nameField;

    @CacheLookup
    @FindBy(id = "last-name")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(id = "postal-code")
    WebElement postCode;

    @CacheLookup
    @FindBy(id = "continue")
    WebElement continueButton;

    @FindBy(id = "finish")
    WebElement finishButton;


    @FindBy(xpath = "//h2[contains(text(),'THANK YOU FOR YOUR ORDER')]")
    WebElement verifyMessage;




    public void clickOnCheckOut(String name,String lastname,String zip){
        sendTextToElement(nameField,name);
        log.info("Enter name :" + name);
        sendTextToElement(lastNameField,lastname);
        log.info("Enter name :" + lastname);
        sendTextToElement(postCode,zip);
        log.info("Enter PostCode / Zip :"+zip);
    }
    public void setContinueButton(){
        clickOnElement(continueButton);
        log.info("Click on Continue Button");
    }

    public void setFinishButton(){
        clickOnElement(finishButton);
        log.info("Click on finish Button");
    }

    public String verifyMessage(){
        return getTextFromElement(verifyMessage);
    }
}

