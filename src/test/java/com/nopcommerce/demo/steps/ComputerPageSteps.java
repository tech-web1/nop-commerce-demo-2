package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ComputerPageSteps {
    @When("I am on ComputerPage")
    public void iAmOnComputerPage() {


    }


    @And("I click on Computer Tab")
    public void iClickOnComputerTab() {
        new ComputerPage().clickOnComputer();

    }

    @Then("Verify the Computer Text {string}")
    public void verifyTheComputerText(String computer) {

        Assert.assertEquals(new ComputerPage().getComputerText().getText(), computer);
    }


    @And("I click on Desktops link")
    public void iClickOnDesktopsLink() {

        new DesktopsPage().clickOnDesktop();
    }

    @Then("Verify the Desktops text {string}")
    public void verifyTheDesktopsText(String desktops) {

        Assert.assertEquals(new DesktopsPage().getDesktops().getText(), desktops);

    }


    @And("I select os{string}")
    public void iSelectOs(String os) {
        new DesktopsPage().clickOnOS(os);
    }

    @And("I select software{string}")
    public void iSelectSoftware(String software) {
        new DesktopsPage().clickOnSoftware(software);
    }


    @Then("Verify message {string}")
    public void verifyMessage(String arg0) {
    }


    @And("I click on Product")
    public void iClickOnProduct() {
        new DesktopsPage().clickOnProductName();
    }


    @And("I select ProcessRam {string} {string}")
    public void iSelectProcessRam(String processor, String ram) {

        new DesktopsPage().selectProcessorFromDropDown(processor, ram);
    }


    @And("I click on addToCart Button")
    public void iClickOnAddToCartButton() {
        new DesktopsPage().clickOnAddToCart();
    }

    @And("I select hdd {string}")
    public void iSelectHdd(String hdd) {
        new DesktopsPage().clickOnHDD(hdd);


    }

    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I Click on login link")
    public void iClickOnLoginLink() {
    }

    @Then("I should navigate to login page successfully")
    public void iShouldNavigateToLoginPageSuccessfully() {
    }

    @When("I click on login link")
    public void iClickOnLoginLink() {
    }

    @And("I enter email {string}")
    public void iEnterEmail(String arg0) {
    }

    @And("I enter password {string}")
    public void iEnterPassword(String arg0) {
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
    }

    @Then("I should login successfully")
    public void iShouldLoginSuccessfully() {
    }
}