Feature: New Account

  Background:
    Given User navigates to main page
    Given User logged in to website

  @Accounts @Smoke @Regression
  Scenario: User Successfully opens new "Checking account"
    When User clicks to Open New Account
    And User chooses account type as checking
    And User clicks open new account button
    Then User sees account opened on the screen

  @Accounts @Smoke @Regression
  Scenario: User Successfully opens new "Saving account"
    When User clicks to Open New Account
    And User chooses account type as saving
    And User clicks open new account button
    Then User sees account opened on the screen