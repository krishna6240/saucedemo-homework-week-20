package com.saucedemo.cucumber.steps;

import com.saucedemo.pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    @Given("^I am on saucedemo page$")
    public void iAmOnSaucedemoPage() {
        System.out.println("I am on home Page");
    }

    @When("^I login with credential username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iLoginWithCredentialUsernameAndPassword(String userName, String pass) {
        new HomePage().enterUserName(userName);
        new HomePage().enterPassword(pass);
    }

    @And("^I click on Login button$")
    public void iClickOnLoginButton() {
        new HomePage().Loginbutton();
    }

    @And("^I filter the products by Price \"([^\"]*)\"$")
    public void iFilterTheProductsByPrice(String arg0) throws InterruptedException {
        new BasePage().selectOptionFromDropDown(arg0);
    }

    @And("^I select cheapest & costliest products and add to basket$")
    public void iSelectCheapestCostliestProductsAndAddToBasket() {
        new BasePage().clickOnAddCart();
    }

    @And("^I open shopping cart$")
    public void iOpenShoppingCart() {
        new BasePage().clickOnShoppingCart();
    }

    @And("^I go to checkout$")
    public void iGoToCheckout() {
        new CheckOutPage().clickOnCheckOut();
    }

    @And("^I enter details firstname \"([^\"]*)\", lastName \"([^\"]*)\" and zipPostalCode \"([^\"]*)\"$")
    public void iEnterDetailsFirstnameLastNameAndZipPostalCode(String arg0, String arg1, String arg2)  {
        new LogOutPage().clickOnCheckOut(arg0,arg1,arg2);
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new LogOutPage().setContinueButton();
    }

    @And("^I click on finish button$")
    public void iClickOnFinishButton() {
        new LogOutPage().setFinishButton();
    }


    @Then("^I should be able to see message \"([^\"]*)\"$")
    public void iShouldBeAbleToSeeMessage(String msg)  {
        String actualText = new LogOutPage().verifyMessage();
        Assert.assertEquals(actualText,msg);
    }
}