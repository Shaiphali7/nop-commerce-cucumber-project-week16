package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ComputerSteps {
    @Given("I am in home page")
    public void iAmInHomePage() {
    }

    @When("I clicked on Computer in top menu")
    public void iClickedOnComputerInTopMenu() {
        new ComputerPage().clickOnComputer();
    }

    @Then("verify that I am in computer page")
    public void verifyThatIAmInComputerPage() {
        String actualText=new ComputerPage().getComputerText();
        Assert.assertEquals(actualText,"Computers");
    }

    @And("I clicked on Desktop")
    public void iClickedOnDesktop() {
        new DesktopsPage().clickOnDesktop();
    }

    @Then("verify that I am in Desktop page")
    public void verifyThatIAmInDesktopPage() {
        String actualText=new DesktopsPage().getDesktopText();
        Assert.assertEquals(actualText,"Desktops");
    }

    @And("I clicked on product build your own computer")
    public void iClickedOnProductBuildYourOwnComputer() {
        new DesktopsPage().clickOnProductName();
    }



    @And("I clicked on Add to cart button")
    public void iClickedOnAddToCartButton() {
        new DesktopsPage().clickOnAddToCart();
    }

    @Then("verify that item is added successfully to the cart")
    public void verifyThatItemIsAddedSuccessfullyToTheCart() {
        String actualText=new DesktopsPage().getProductAddedMessage();
        Assert.assertEquals(actualText,"The product has been added to your shopping cart");
    }

    @And("I select ProcessRam {string} {string}")
    public void iSelectProcessRam(String processor, String ram) {
        new DesktopsPage().selectProcessorFromDropDown(processor,ram);
    }

    @And("I select hdd {string}")
    public void iSelectHdd(String hdd) {
        new DesktopsPage().clickOnHDD(hdd);
    }

    @And("I select os{string}")
    public void iSelectOs(String os) {
        new DesktopsPage().clickOnOS(os);
    }

    @And("I select software{string}")
    public void iSelectSoftware(String software) {
        new DesktopsPage().clickOnSoftware(software);
    }
}
