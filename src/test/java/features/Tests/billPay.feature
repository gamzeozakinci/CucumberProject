Feature: Pay Bill

  Background:
    Given User navigates to main page
    Given User logged in to website

  @Account @Smoke @Regression
  Scenario Outline: User successfully pays the bills
    When User clicks bill pay
    And User enters payee name "<payee>"
    And User enters address "<address>"
    And User enters city "<city>"
    And User enters state "<state>"
    And User enters zipcode "<zipcode>"
    And User enters phone number "<phone>"
    And User enters account number "<account>"
    And User verifies account number "<vaccount>"
    And User enters amount "<amount>"
    And User clicks send payment
    Then User verifies that the payment is complete


    Examples:
      | payee       | address    | city    | state  | zipcode | phone      | account | vaccount | amount |
      | Electricity | Konyaalti  | Antalya | Turkey | 32312   | 0553314212 | 154532  | 154532   | 85     |
      | Water       | Karsiyaka  | izmir   | Turkey | 666755  | 0554414212 | 121212  | 121212   | 45     |
      | Natural gas | Manchester | Spain   | Turkey | 112211  | 0523332332 | 187874  | 187874   | 120    |
