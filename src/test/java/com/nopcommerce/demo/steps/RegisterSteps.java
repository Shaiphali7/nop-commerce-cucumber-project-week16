package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterSteps {
    @When("I click on RegisterLink")
    public void iClickOnRegisterLink() {
        new RegisterPage().clickOnRegisterLink();
    }

    @Then("Verify text {string}")
    public void verifyText(String text) {
        String actualRegisterText=new RegisterPage().getRegisterText();
        Assert.assertEquals(actualRegisterText,text);
    }

    @And("I click on REGISTRATION button")
    public void iClickOnREGISTRATIONButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("Verify the error message for firstName {string}")
    public void verifyTheErrorMessageForFirstName(String errorMessage) {
        String actualMessage=new RegisterPage().getFirstNameError();
        Assert.assertEquals(actualMessage,errorMessage );
    }

    @Then("Verify the error message for lastName {string}")
    public void verifyTheErrorMessageForLastName(String errorMessage) {
        String actualMessage=new RegisterPage().getLastNameError();
        Assert.assertEquals(actualMessage,errorMessage );
    }

    @Then("Verify the error message for email {string}")
    public void verifyTheErrorMessageForEmail(String errorMessage) {
        String actualMessage=new RegisterPage().getEmailError();
        Assert.assertEquals(actualMessage,errorMessage );
    }

    @Then("verify the error message for password  {string}")
    public void verifyTheErrorMessageForPassword(String errorMessage) {
        String actualMessage=new RegisterPage().getPasswordError();
        Assert.assertEquals(actualMessage,errorMessage );
    }

    @Then("Verify the error message for ConfirmPassword{string}")
    public void verifyTheErrorMessageForConfirmPassword(String errorMessage) {
        String actualMessage=new RegisterPage().getConfirmPasswordError();
        Assert.assertEquals(actualMessage,errorMessage );
    }

    @And("I select gender")
    public void iSelectGender() {
        new RegisterPage().clickOnGender();
    }

    @And("I enter firstName {string}")
    public void iEnterFirstName(String firstName) {
        new RegisterPage().setFirstName(firstName);
    }

    @And("I enter lastName {string}")
    public void iEnterLastName(String lastName) {
        new RegisterPage().setFirstName(lastName);
    }

    @And("I select day {string}")
    public void iSelectDay(String day) {
        new RegisterPage().selectFromDropDownDay(day);

    }

    @And("I select month {string}")
    public void iSelectMonth(String month) {
        new RegisterPage().selectFromDropDownMonth(month);
    }

    @And("I select year{string}")
    public void iSelectYear(String year) {
        new RegisterPage().selectFromDropDownYear(year);
    }

    @And("I enter register emailId {string}")
    public void iEnterRegisterEmailId(String email) {
        new RegisterPage().setEmail(email);

    }

    @And("I enter register password {string}")
    public void iEnterRegisterPassword(String password) {
        new RegisterPage().setPassword(password);
    }

    @And("I enter confirmPassword {string}")
    public void iEnterConfirmPassword(String password) {
        new RegisterPage().setConfirmPasswordPassword1(password);
    }

    @And("I click on REGISTER button")
    public void iClickOnREGISTERButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("Verify the message")
    public void verifyTheMessage() {
    }
}
