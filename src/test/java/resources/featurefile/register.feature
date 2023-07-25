Feature: RegisterPage Test
  As user I want to Register successfully

  @smoke
  Scenario: User Should Navigate To RegisterPage Successfully
    Given I am on Login Page
    When I click on RegisterLink
    Then Verify text "Register"


  @sanity
  Scenario:  verify that error message displayed for mandatory field
    Given I am on Login Page
    When I click on RegisterLink
    And I click on REGISTRATION button
    Then Verify the error message for firstName "First name is required."
    Then Verify the error message for lastName "Last name is required."
    Then Verify the error message for email "Email is required."
    Then verify the error message for password  "Password is required."
    Then Verify the error message for ConfirmPassword"Password is required."

  @regression
  Scenario:User Should able to create Account Successfully
    Given I am on Login Page
    When I click on RegisterLink
    And I select gender
    And I enter firstName "Coco"
    And I enter lastName "Jain"
    And I select day "28"
    And I select month "January"
    And I select year"1983"
    And I enter register emailId "cocojain678@gmail.com"
    And I enter register password "Coco123#"
    And I enter confirmPassword "Coco123#"
    And I click on REGISTER button
    Then Verify the message
