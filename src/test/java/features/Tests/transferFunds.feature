Feature: Transfer funds

  Background:
    Given User navigates to main page
    Given User logged in to website

  @Payment @Regression
  Scenario: User Succesfully transfers money to another account
    When User clicks transfer funds
    And User enters the amount to transfer
    And User chooses account to transfer from
    And User chooses account to transfer to
    And User clicks transfer button
    Then User must see transfer complete text