Feature: Request Loan

  Background:
    Given User navigates to main page
    Given User logged in to website

  Scenario: User successfully request a loan
    When User clicks request loan
    And User enters amount of loan
    And User enters down payment
    And User chooses an account
    And User clicks apply now button
    Then User must see Loan Request Processed



