package Parabank.stepDefinitions;

import Parabank.pages.BillPayPage;
import Parabank.utils.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static Parabank.utils.GWD.wait;
import static org.testng.Assert.assertTrue;

public class billPay {

    BillPayPage bp = new BillPayPage();

    @When("User clicks bill pay")
    public void clickBillPay() {
        bp.billpayButton.click();
    }

    @And("User enters payee name {string}")
    public void entersPayee(String string) {
        bp.payeeName.sendKeys(string);
    }

    @And("User enters address {string}")
    public void entersAddress(String string) {
        bp.payeeStreet.sendKeys(string);
    }

    @And("User enters city {string}")
    public void entersCity(String string) {
        bp.payeeCity.sendKeys(string);
    }

    @And("User enters state {string}")
    public void entersState(String string) {
        bp.payeeState.sendKeys(string);
    }

    @And("User enters zipcode {string}")
    public void entersZipcode(String string) {
        bp.payeeZipCode.sendKeys(string);
    }

    @And("User enters phone number {string}")
    public void entersPhone(String string) {
        bp.payeePhone.sendKeys(string);
    }

    @And("User enters account number {string}")
    public void entersAccount(String string) {
        bp.payeeAccount.sendKeys(string);
    }

    @And("User verifies account number {string}")
    public void entersAccountV(String string) {
        bp.payeeVerifyAccount.sendKeys(string);
    }

    @And("User enters amount {string}")
    public void entersAmount(String string) {
        bp.payeeAmount.sendKeys(string);
    }

    @And("User clicks send payment")
    public void clickSend() {
        bp.sendPaymentButton.click();
    }

    @Then("User verifies that the payment is complete")
    public void verifyPaymentComplete() {

        WebElement verify = wait.until(ExpectedConditions.visibilityOf(bp.verifyBillPay));
        assertTrue(verify.isDisplayed());

    }
}
