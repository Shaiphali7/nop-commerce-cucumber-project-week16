package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }
    //@CacheLookup
    @FindBy(xpath= "//a[contains(text(),'Log in')]")
    WebElement loginLink;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;


    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;


    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;


    public void clickOnLoginButton() {

        clickOnElement(loginButton);
        log.info("Clicking on login button  : " + loginButton.toString());

    }


    public void enterEmailId(String email) {

        sendTextToElement(emailField, email);
        log.info("write in  email field" + emailField + "from email " + email.toString());
    }

    public void enterPassword(String password) {

        sendTextToElement(passwordField, password);
        log.info("enter in password" + passwordField + "in password field" + password.toString());
    }

    public void clickOnLoginLink() {

        clickOnElement(loginLink);
        log.info("Clicking on loginlink  : " + loginLink.toString());

    }

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]")
    WebElement getErrorMessage;

    public String getGetErrorMessage() {
        String message = getTextFromElement(getErrorMessage);
        log.info("Getting text from : " + getErrorMessage.toString());
        return message;

    }


    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement loginOutLink;

    public void clickOnLogoutLink(){

        clickOnElement(loginOutLink);
        log.info("Clicking on logOutLink : " + loginOutLink.toString());

    }
    public String getLogOutMessage()
    {
        String message = getTextFromElement(loginOutLink);
        log.info("Getting text from : " + loginOutLink.toString());
        return message;

    }
    public WebElement getWelcomeText() {
        return welcomeText;
    }





}
