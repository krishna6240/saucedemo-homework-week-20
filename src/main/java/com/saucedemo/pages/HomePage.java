package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "user-name")
    WebElement userName;

    @CacheLookup
    @FindBy(id = "password")
    WebElement password;

    @CacheLookup
    @FindBy(id = "login-button")
    WebElement loginButton;

    public void enterUserName(String usernm) {
        sendTextToElement(userName,usernm);
        log.info("Enter User Name : " + usernm);
    }
    public void enterPassword(String passWord) {
        sendTextToElement(password,passWord);
        log.info("Enter Password : " + passWord);
    }
    public void Loginbutton() {
        clickOnElement(loginButton);
        log.info("Click on Login button ");
    }


}

