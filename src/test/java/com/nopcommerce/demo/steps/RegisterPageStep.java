package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RegisterPageStep {
    @When("I click on RegisterLink")
    public void iClickOnRegisterLink() {
    }

    @Then("Verify text {string}")
    public void verifyText(String register) {
        Assert.assertEquals(new RegisterPage().getregisterText().getText(),register);
    }

    @Then("Verify the error message for firstName {string}")
    public void verifyTheErrorMessageForFirstName(String firstName) {
        Assert.assertEquals(new RegisterPage().getFirstNameError().getText(),firstName);
    }

    @Then("Verify the error message for lastName {string}")
    public void verifyTheErrorMessageForLastName(String lastName) {
        Assert.assertEquals(new RegisterPage().getLastNameError().getText(),lastName);
    }

    @Then("Verify the error message for email {string}")
    public void verifyTheErrorMessageForEmail(String email) {
        Assert.assertEquals(new RegisterPage().getEmailError().getText(),email);
    }

    @Then("verify the error message for password  {string}")
    public void verifyTheErrorMessageForPassword(String password) {
        Assert.assertEquals(new RegisterPage().getPasswordRequired().getText(),password);
    }

    @Then("Verify the error message for ConfirmPassword{string}")
    public void verifyTheErrorMessageForConfirmPassword(String confirmPassword) {
        Assert.assertEquals(new RegisterPage().getConfirmPasswordRequired().getText(),confirmPassword);
    }




    @And("I select gender")
    public void iSelectGender() {
        new RegisterPage().clickOnGender();
    }




    @And("I click on REGISTER button")
    public void iClickOnREGISTERButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("Verify the message {string}")
    public void verifyTheMessage(String arg0) {
    }






    @When("I click on RegisterLink")
    public void iClickOnRegisterLink() {
        new RegisterPage().clickOnRegisterLink();
    }

    @Given("I am on RegisterPage")
    public void iAmOnRegisterPage() {
    }

    @And("I enter firstName {string}")
    public void iEnterFirstName(String firstName) {
        new RegisterPage().setFirstName(firstName);
    }

    @And("I enter lastName {string}")
    public void iEnterLastName(String lastName) {
        new RegisterPage().setLastName(lastName);
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
    public void iEnterRegisterEmailIdString(String email) {
        new RegisterPage().setEmail(email);
    }

    @And("I enter register password {string}")
    public void iEnterRegisterPasswordString(String password) {
        new RegisterPage().setPassword(password);
    }

    @And("I enter confirmPassword {string}")
    public void iEnterConfirmPassword(String password1) {
        new RegisterPage().setConfirmPasswordPassword1(password1);
    }



}
