Feature: Login User

  Background:
    Given User navigates to main page

  @Accounts @Smoke @Regression
  Scenario Outline: Successful Login with Credentials
    When User enters username "<username>"
    And User enters password "<password>"
    And User clicks log in
    Then the URL should contain "<url>"


    Examples:
      | username | password | url      |
      | gamze    | gamze    | overview |

  @Accounts @Smoke @Regression
  Scenario Outline: Login with invalid credentials
    When User enters username "<usernamev>"
    And User enters password "<passwordv>"
    And User clicks log in
    Then error text appears on the screen

    Examples:
      | usernamev | passwordv |
      | user      | pass      |
      |           |           |


