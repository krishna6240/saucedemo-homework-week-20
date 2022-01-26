package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage extends Utility {

 private static final Logger log = LogManager.getLogger(BasePage.class.getName());

    public BasePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(className = "product_sort_container")
    WebElement dropDownBox;

    @CacheLookup
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addItemToBox;

    @CacheLookup
    @FindBy(className= "shopping_cart_link")
    WebElement shoppingCart;

    public void selectOptionFromDropDown(String txt) throws InterruptedException {
        selectFromDropDownByVisibleText(dropDownBox,txt);
        log.info("Select" + txt + " Option from DropDown List.");
    }

    public void clickOnAddCart(){
        clickOnElement(addItemToBox);
        log.info("Click on Add to Cart");
    }
    public void clickOnShoppingCart(){
        clickOnElement(shoppingCart);
        log.info("Go to Shopping Cart");
    }



}
