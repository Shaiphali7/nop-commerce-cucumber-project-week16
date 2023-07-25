package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

    public ComputerPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/a[1]")
    WebElement computer;



    @CacheLookup
    @FindBy(xpath = " //h1[contains(text(),'Computers')]")
    WebElement computertext;



    public void clickOnComputer() {
        clickOnElement(computer);
        log.info("Clicking on Computer  : " + computer.toString());

    }

    public String getComputerText() {
        String message = getTextFromElement(computertext);
        log.info("Getting text from : " + computertext.toString());
        return message;

    }

}
