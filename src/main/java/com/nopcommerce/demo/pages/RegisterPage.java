package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage  extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public  void LoginPage() {
        PageFactory.initElements(driver, this);
    }

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
        log.info("Clicking on login Button" +loginButton.toString() );

    }



    public void enterEmailId(String email) {

        sendTextToElement(emailField, email);
        log.info("Entering emailField" +emailField.toString() );

    }

    public void enterPassword(String password) {

        sendTextToElement(passwordField, password);
        log.info("Entering password Field" +passwordField.toString() );

    }

    public void clickOnLoginLink() {


        clickOnElement(loginLink);
        log.info("Clicking on login link" +loginLink.toString() );

    }


    public WebElement getWelcomeText() {
        return welcomeText;
    }


    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]")
    WebElement getErrorMessage;

    public WebElement getGetErrorMessage() {
        return getErrorMessage;
    }

    public WebElement getLoginOutLink() {
        return loginOutLink;
    }

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement loginOutLink;


    public WebElement getLoginLink() {
        return loginLink;
    }

    public void clickOnLogoutLink(){


        clickOnElement(loginOutLink);
        log.info("Clicking on log out link" +loginOutLink.toString() );

    }
}
