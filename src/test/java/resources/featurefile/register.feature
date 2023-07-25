@regression
Feature: RegisterPage Test
  As user I want to Register myself successfully

  @regression
  Scenario: User Should Navigate To RegisterPage Successfully
    Given I am on Login Page
    When I click on RegisterLink
    Then Verify text "Register"


  @regression
  Scenario:  verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory
    Given I am on Login Page
    When I click on RegisterLink
    And I click on REGISTRATION button
    Then Verify the error message for firstName "First name is required."
    Then Verify the error message for lastName "Last name is required."
    Then Verify the error message for email "Email is required."
    Then verify the error message for password  "Password is required."
    Then Verify the error message for ConfirmPassword"Password is required."

  @regression
  Scenario: outline:User Should Create Account Successfully
    Given I am on Login Page
    When I click on RegisterLink
    And I select gender
    And I enter firstName "yana"
    And I enter lastName "limbani"
    And I select day "30"
    And I select month "September"
    And I select year"2014"
    And I enter register emailId "yana123@gmail.com"
    And I enter register password "yana123456"
    And I enter confirmPassword "yana123456"
    And I click on REGISTER button
    Then Verify the message "RegisterText"