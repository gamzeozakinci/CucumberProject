Feature: Login User

  Background:
    Given User navigates to main page

  @Accounts @Smoke @Regression
  Scenario Outline: Succesful Login with Credentials
    When User enters username "<username>"
    And User enters password "<password>"
    And User clicks log in
    Then the URL should contain "<url>"


    Examples:
      | username | password | url      |
      | gamze    | gamze    | overview |