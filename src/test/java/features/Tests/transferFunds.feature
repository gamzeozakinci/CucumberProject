Feature: Transfer funds

  Background:
    Given User navigates to main page
    Given User logged in to website

  @Payment @Regression
  Scenario: User Successfully transfers money to another account
    When User clicks transfer funds
    And User enters the amount to transfer
    And User chooses account to transfer from
    And User chooses account to transfer to
    And User clicks transfer button
    And User must see transfer complete text
    And User opens account overview to check
    And User checks transferred account
    Then User checks the received amount

  @Payment @Regression
  Scenario: Money transfer verify
    When User clicks transfer funds
    And User enters the amount to transfer
    And User chooses account to transfer from
    And User chooses account to transfer to
    And User clicks transfer button
    And User opens account overview to check
    And User chooses transaction to check
    And User saves transaction id
    And User clicks find transactions
    And User enters transaction id
    And User clicks find transactions button
    Then User verifies that the transaction is made