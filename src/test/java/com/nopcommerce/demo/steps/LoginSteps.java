package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    @Given("I am on Login Page")
    public void iAmOnLoginPage() {

    }

    @When("I click on Login link")
    public void iClickOnLoginLink() {
        new LoginPage().clickOnLoginLink();
    }

    @Then("Verify the message display {string}")
    public void verifyTheMessageDisplay(String welcome) {
        Assert.assertEquals(new LoginPage().getWelcomeText().getText(),welcome);
    }

    @And("I enter emailId {string}")
    public void iEnterEmailId(String email) {
        new LoginPage().enterEmailId(email);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("I click on Login Button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("verify The error message {string}")
    public void verifyTheErrorMessage(String errorMsg) {
        Assert.assertTrue(new LoginPage().getGetErrorMessage().contains(errorMsg));
    }

    @Then("verify that Logout link is display {string}")
    public void verifyThatLogoutLinkIsDisplay(String logout) {
        Assert.assertEquals(new LoginPage().getLogOutMessage(),logout);
    }

    @And("I click on Logout link")
    public void iClickOnLogoutLink() {
        new LoginPage().clickOnLogoutLink();
    }

    @Then("verify that Login link is display {string}")
    public void verifyThatLoginLinkIsDisplay(String arg0) {
    }
}
