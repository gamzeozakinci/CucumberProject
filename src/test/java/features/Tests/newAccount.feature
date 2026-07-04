Feature: New Account

  Background:
    Given User navigates to main page
    Given User logged in to website

  @Accounts @Smoke @Regression
  Scenario: User Successfully opens a new account
    When User clicks to Open New Account
    And User chooses account type
    And User clicks open new account button
    Then User sees account opened on the screen