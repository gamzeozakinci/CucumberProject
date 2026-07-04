Feature: Update Profile

  Background:
    Given User navigates to main page
    Given User logged in to website

    Scenario: User successfully changes contact info
      When User clicks update contact info
      And User changes name
      And User changes lastname
      And User changes address
      And User changes city
      And User changes city
      And User changes state
      And User changes zipcode
      And User changes phone number
      And User
      Then
