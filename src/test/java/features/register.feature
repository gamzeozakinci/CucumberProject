Feature: Register User

  Background:
  Given User navigates to main page

  @accounts @smoke @regression
  Scenario Outline: Successful register with credentials
    When the user clicks "<register>"
    And the user enters "<firstname>"
    And the user enters "<lastname>"
    And the user enters "<address>"
    And the user enters "<city>"
    And the user enters "<state>"
    And the user enters "<zipcode>"
    And the user enters "<ssn>"
    And the user enters "<username>"
    And the user enters "<password>"
    And the user enters "<confirm>"
    And the user clicks "<registerButton>"
    Then the user must see "<successRegister>"



    Examples:
      | register        |
      | firstname       |
      | lastname        |
      | address         |
      | city            |
      | state           |
      | zipcode         |
      | ssn             |
      | username        |
      | password        |
      | confirm         |
      | registerButton  |
      | successRegister |








