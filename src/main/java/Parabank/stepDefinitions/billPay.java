package Parabank.stepDefinitions;

import Parabank.pages.BillPayPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class billPay {

    BillPayPage bp = new BillPayPage();

    @When("User clicks bill pay")
    public void clickBillPay() {
        bp.billpayButton.click();
    }

    @Then("User enters payee name {string}")
    public void entersPayee(String string) {
        bp.payeeName.sendKeys(string);
    }

    @Then("User enters address {string}")
    public void entersAddress(String string) {
        bp.payeeStreet.sendKeys(string);
    }

    @Then("User enters city {string}")
    public void entersCity(String string) {
        bp.payeeCity.sendKeys(string);
    }

    @Then("User enters state {string}")
    public void entersState(String string) {
        bp.payeeState.sendKeys(string);
    }

    @Then("User enters zipcode {string}")
    public void entersZipcode(String string) {
        bp.payeeZipCode.sendKeys(string);
    }

    @Then("User enters phone number {string}")
    public void entersPhone(String string) {
        bp.payeePhone.sendKeys(string);
    }

    @Then("User enters account number {string}")
    public void entersAccount(String string) {
        bp.payeeAccount.sendKeys(string);
    }

    @Then("User verifies account number {string}")
    public void entersAccountV(String string) {
        bp.payeeVerifyAccount.sendKeys(string);
    }




}
