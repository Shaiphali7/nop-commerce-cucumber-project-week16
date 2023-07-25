package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement RegisterLInk;


    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement RegisterButton;



    @CacheLookup
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement FirstNameError;
public String getFirstNameError()
{
    String message = getTextFromElement(FirstNameError);
    log.info("Getting text from : " + FirstNameError.toString());
    return message;

}
    public String getLastNameError()
    {
        String message = getTextFromElement(LastNameError);
        log.info("Getting text from : " + LastNameError.toString());
        return message;

    }
    public String getEmailError()
    {
        String message = getTextFromElement(EmailError);
        log.info("Getting text from : " + EmailError.toString());
        return message;

    }



    @CacheLookup
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement LastNameError;


    @CacheLookup
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement EmailError;


    @CacheLookup
    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement genderFemale;


    public void clickOnGender(){

        clickOnElement(genderFemale);
        log.info("Clicking on gender female : " + genderFemale.toString());
    }


    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstName;


    public void setFirstName(String name)
    {
        sendTextToElement(firstName, name);
        log.info("Enter first name" +firstName+ "in field " + firstName.toString());


    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastName;

    public void setLastName(String name)
    {
        sendTextToElement(lastName, name);

        log.info("Enter last name" +lastName+ "in field " + lastName.toString());
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]")
    WebElement day;

    public void selectFromDropDownDay(String day1)
    {
        selectByVisibleTextFromDropDown(day,day1);
        log.info("Select day " + day + "from dropdown " + day1.toString());
    }
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]")
    WebElement month;


    public void selectFromDropDownMonth(String month1)
    {

        selectByVisibleTextFromDropDown(month,month1);
        log.info("Select month" + month + "from dropdown " + month1.toString());
    }


    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]")
    WebElement year;


    public void selectFromDropDownYear(String year1)
    {
        selectByVisibleTextFromDropDown(year,year1);
        log.info("Select year" + year+ "from dropdown " + year1.toString());
    }


    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;

    public void setEmail(String email)
    {

        sendTextToElement(this.email, email);
        log.info("Enter email" +firstName+ "in field " + email.toString());

    }


    public WebElement getPasswordRequired() {
        return passwordrequired;
    }


    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;


    public void setPassword(String Password)

    {
        sendTextToElement(this.password, Password);
        log.info("Enter password" +password+ "in field " + Password.toString());

    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPassword;


    public void setConfirmPasswordPassword1(String confirmPassword1)

    {
        sendTextToElement(confirmPassword, confirmPassword1);
        log.info("Enter confirmPassword" +confirmPassword+ "in field " + confirmPassword1.toString());

    }

    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;


    public void clickOnregister()

    {
        clickOnElement(registerButton);
        log.info("Clicking on register button : " + registerButton.toString());

    }

    @CacheLookup
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordrequired;



    @CacheLookup
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement confirmPasswordrequired;



    public void clickOnRegisterButton() {

        clickOnElement(RegisterButton);
        log.info("Clicking on register button : " + registerButton.toString());

    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement RegisterText;
    public String getRegisterText()
    {
        String message = getTextFromElement(RegisterText);
        log.info("Getting text from : " + RegisterText.toString());
        return message;

    }


    public void clickOnRegisterLink(){
        clickOnElement(RegisterLInk);
        log.info("Clicking on register link : " + RegisterLInk.toString());

    }

    // @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement verifyregistration;
    public String getPasswordError()
    {
        String message = getTextFromElement(passwordrequired);
        log.info("Getting text from : " + passwordrequired.toString());
        return message;

    }
    public String getConfirmPasswordError()
    {
        String message = getTextFromElement(confirmPasswordrequired);
        log.info("Getting text from : " + confirmPasswordrequired.toString());
        return message;


    }
}
