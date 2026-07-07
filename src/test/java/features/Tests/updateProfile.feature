Feature: Update Profile

  Background:
    Given User navigates to main page
    Given User logged in to website

  @Contact @Accounts
  Scenario Outline: User successfully changes contact info
    When User clicks update contact info
    And User changes name to "<firstName>"
    And User changes lastname to "<lastName>"
    And User changes address to "<street>"
    And User changes city to "<city>"
    And User changes state to "<state>"
    And User changes zipcode to "<zipCode>"
    And User changes phone number to "<phone>"
    And User clicks update profile
    Then User must see profile updated line

    Examples:
      | firstName | lastName | street    | city    | state  | zipCode | phone    |
      | John      | Brown    | Konyaalti | Antalya | Turkey | 07070   | 55324504 |

  @Contact @Accounts
  Scenario: User enters invalid or missing info
    When User clicks update contact info
    And Clears all the fields
    And User clicks update profile
    Then User sees the error messages for mandatory areas