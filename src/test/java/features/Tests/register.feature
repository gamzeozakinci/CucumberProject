Feature: Register User

  Background:
    Given User navigates to main page

  @accounts @smoke @regression
  Scenario: Successful register with credentials
    When the user clicks register
    And the user enters name
    And the user enters surname
    And the user enters address
    And the user enters city
    And the user enters state
    And the user enters zipcode
    And the user enters ssn
    And the user enters username
    And the user enters password
    And the user enters password again
    And the user clicks register button
    Then the user must see success message







