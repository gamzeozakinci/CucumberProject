Feature: Request Loan

  Background:
    Given User navigates to main page
    Given User logged in to website

  @Loan @Accounts @Regression
  Scenario Outline: User successfully request a loan
    When User clicks request loan
    And User enters amount of loan "<loanAmount>"
    And User enters down payment "<downPayment>"
    And User chooses an account "<accountNumber>"
    And User clicks apply now button
    Then User must see Loan Request Processed

    Examples:
      | loanAmount | downPayment | accountNumber |
      | 100        | 10          | 13566         |

  @Loan @Accounts @Regression
  Scenario Outline: Invalid request of loan
    When User clicks request loan
    And User enters amount of loan "<loanAmount>"
    And User enters down payment "<downPayment>"
    And User clicks apply now button
    Then User must see error message on screen

    Examples:
      | loanAmount | downPayment | accountNumber |
      | 1004444    | 104343      | 13455         |