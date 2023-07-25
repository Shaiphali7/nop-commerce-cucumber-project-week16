Feature: LoginPage Test
  As User I want to Login Successfully
  @smoke
  Scenario: user Should Navigate To LoginPage SuccessFully
    Given I am on Login Page
    When I click on Login link
    Then Verify the message display "Welcome, Please Sign In!"

  @sanity
  Scenario:The Error Message With InValid Credentials
    Given I am on Login Page
    When I click on Login link
    And I enter emailId "coco123@gmail.com"
    And I enter password "Coco1234"
    And I click on Login Button
    Then verify The error message "Login was unsuccessful"

  @regression
  Scenario: User Should LogIn SuccessFully With ValidCredentials
    Given I am on Login Page
    When I click on Login link
    And I enter emailId "cocoboe123@gmail.com"
    And I enter password "Coco123#"
    And I click on Login Button
    Then verify that Logout link is display "Log out"

  @regression
  Scenario: User Should LogOut SuccessFully
    Given I am on Login Page
    When I click on Login link
    And I enter emailId "cocojain123@gmail.com"
    And I enter password "Coco123#"
    And I click on Login Button
    And I click on Logout link
    Then verify that Login link is display "Log in"