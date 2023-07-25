package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopsPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopsPage.class.getName());

    public DesktopsPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/h2[1]/a[1]")
    WebElement desktopslink;


    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Build your own computer')]")
    WebElement productName;


    // @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processor;


    @CacheLookup
    @FindBy(id = "product_attribute_3_6")
    WebElement hdd320;

    @CacheLookup
    @FindBy(id = "product_attribute_3_7")
    WebElement hdd400;


    @CacheLookup
    @FindBy(id = "product_attribute_2")
    WebElement ram;
    public void selectProcessorFromDropDown(String processor1,String ram1) {
        selectByVisibleTextFromDropDown(processor,processor1);
        selectByVisibleTextFromDropDown(ram,ram1);
        log.info("Select processor type" + processor + "from dropdown " + processor.toString());
    }

    public void clickOnHDD(String hdd) {
        if(hdd.equals("320 GB")){
            clickOnElement(hdd320);
            log.info("Clicking on hdd320  : " + hdd320.toString());
        }else{
            clickOnElement(hdd400);
            log.info("Clicking on hdd400  : " + hdd400.toString());
        }
    }

    @CacheLookup
    @FindBy(id = "product_attribute_4_8")
    WebElement vistaHome;

    @CacheLookup
    @FindBy(id = "product_attribute_4_9")
    WebElement vistaPremium;



    public void clickOnOS(String os) {
        if(os.equals("Vista Home [+$50.00]")){
            clickOnElement(vistaHome);
            log.info("Clicking on VistaHome  : " + vistaHome.toString());
        }else{
            clickOnElement(vistaPremium);
            log.info("Clicking on vistaPremium : " + vistaPremium.toString());
        }
    }
    @CacheLookup
    @FindBy(id = "product_attribute_5_10")
    WebElement microsoftOffice;

    @CacheLookup
    @FindBy(id = "product_attribute_5_11")
    WebElement acrobatReader;
    @CacheLookup
    @FindBy(id = "product_attribute_5_12")
    WebElement totalCommander;


    @CacheLookup
    @FindBy(id = "add-to-cart-button-1")
    WebElement addToCart;


    public void clickOnAddToCart(){
        clickOnElement(addToCart);
        log.info("Clicking on Add to cart: " + addToCart.toString());

    }


    public void clickOnSoftware(String software) {

        if(software.equals("Microsoft Office [+$50.00]")){
            clickOnElement(microsoftOffice);
            log.info("Clicking on microsoftOffice : " + microsoftOffice.toString());
        }else if(software.equals("Acrobat Reader [+$10.00]"))
        {  clickOnElement(microsoftOffice);
            clickOnElement(acrobatReader);
            log.info("Clicking on microsoftOffice and acrobatReader  : " +acrobatReader.toString());
        }
        else{
            clickOnElement(microsoftOffice);
            clickOnElement(totalCommander);
            log.info("Clicking on microSoftOffice and totalCommander : " + totalCommander.toString());
        }
    }
    public void clickOnProductName(){
        clickOnElement(productName);
    }

    @CacheLookup
    @FindBy(xpath= "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement productAdded;
    public String getProductAddedMessage()
    {
        String message = getTextFromElement(productAdded);
        log.info("Getting text from : " + productAdded.toString());
        return message;

    }


    public void clickOnDesktop() {
        clickOnElement(desktopslink);
        log.info("Clicking on desktopLink : " + desktopslink.toString());

    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement desktops;
    public String getDesktopText()
    {
        String message = getTextFromElement(desktops);
        log.info("Getting text from : " + desktops.toString());
        return message;
    }

}
