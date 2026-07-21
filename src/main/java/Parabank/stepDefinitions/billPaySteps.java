package Parabank.stepDefinitions;

import Parabank.pages.BillPayPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Parabank.utils.GWD;

import static org.testng.Assert.assertTrue;

public class billPaySteps {

    private static final Logger logger = LoggerFactory.getLogger(billPaySteps.class);

    BillPayPage bp = new BillPayPage();

    @When("User clicks bill pay")
    public void clickBillPay() {
        logger.info("Clicking bill pay");
        bp.billpayButton.click();
    }

    @And("User enters payee name {string}")
    public void entersPayee(String string) {
        logger.info("Entering payee name: {}", string);
        bp.payeeName.sendKeys(string);
    }

    @And("User enters address {string}")
    public void entersAddress(String string) {
        logger.info("Entering payee address: {}", string);
        bp.payeeStreet.sendKeys(string);
    }

    @And("User enters city {string}")
    public void entersCity(String string) {
        logger.info("Entering payee city: {}", string);
        bp.payeeCity.sendKeys(string);
    }

    @And("User enters state {string}")
    public void entersState(String string) {
        logger.info("Entering payee state: {}", string);
        bp.payeeState.sendKeys(string);
    }

    @And("User enters zipcode {string}")
    public void entersZipcode(String string) {
        logger.info("Entering payee zipcode: {}", string);
        bp.payeeZipCode.sendKeys(string);
    }

    @And("User enters phone number {string}")
    public void entersPhone(String string) {
        logger.info("Entering payee phone number: {}", string);
        bp.payeePhone.sendKeys(string);
    }

    @And("User enters account number {string}")
    public void entersAccount(String string) {
        logger.info("Entering payee account number: {}", string);
        bp.payeeAccount.sendKeys(string);
    }

    @And("User verifies account number {string}")
    public void entersAccountV(String string) {
        logger.info("Verifying payee account number: {}", string);
        bp.payeeVerifyAccount.sendKeys(string);
    }

    @And("User enters amount {string}")
    public void entersAmount(String string) {
        logger.info("Entering payment amount: {}", string);
        bp.payeeAmount.sendKeys(string);
    }

    @And("User clicks send payment")
    public void clickSend() {
        logger.info("Clicking send payment");
        bp.sendPaymentButton.click();
    }

    @Then("User verifies that the payment is complete")
    public void verifyPaymentComplete() {
        logger.info("Waiting for payment confirmation to be visible");
        WebElement verify = GWD.getWait().until(ExpectedConditions.visibilityOf(bp.verifyBillPay));
        assertTrue(verify.isDisplayed());
        logger.info("Payment confirmation displayed: {}", verify.getText());
    }
}