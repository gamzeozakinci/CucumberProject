package Parabank.stepDefinitions;

import Parabank.pages.RequestLoanPage;
import Parabank.utils.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import static Parabank.stepDefinitions.newAccountSteps.checkingAccno;
import static Parabank.stepDefinitions.newAccountSteps.savingAccno;

public class requestLoanSteps extends GWD {

    private static final Logger logger = LoggerFactory.getLogger(requestLoanSteps.class);

    RequestLoanPage rl = new RequestLoanPage();

    @When("User clicks request loan")
    public void clickRequestLoan() {
        logger.info("Clicking request loan");
        rl.requestLoanButton.click();
    }

    @And("User enters amount of loan {string}")
    public void enterAmountOfLoan(String loanAmount) {
        logger.info("Entering loan amount: {}", loanAmount);
        rl.loanAmount.sendKeys(loanAmount);
    }

    @And("User enters down payment {string}")
    public void enterDownPayment(String downPayment) {
        logger.info("Entering down payment: {}", downPayment);
        rl.downPayment.sendKeys(downPayment);
    }

    @And("User chooses an account {string}")
    public void chooseAccount(String accountNumber) {
        logger.info("Selecting account: {}", accountNumber);
        Select accSelect = new Select(rl.accountSelect);
        accSelect.selectByValue(accountNumber);
    }

    @And("User clicks apply now button")
    public void clickApplyNowButton() {
        logger.info("Clicking apply now button");
        rl.applyButton.click();
    }

    @Then("User must see Loan Request Processed")
    public void verifyLoan() {
        logger.info("Waiting for loan processed confirmation");
        WebElement verifyLoanPro = GWD.getWait().until(ExpectedConditions.visibilityOf(rl.verifyLoan));
        Assert.assertTrue(verifyLoanPro.isDisplayed());
        logger.info("Loan processed confirmation displayed");
        System.out.println("Bulunan degerler: " + checkingAccno + " " + savingAccno);
    }

    @Then("User must see error message on screen")
    public void verifyLoanError() {
        logger.info("Waiting for loan error message");
        WebElement verifyError = GWD.getWait().until(ExpectedConditions.visibilityOf(rl.errorLoan));
        String errorText = verifyError.getText();
        logger.info("Loan error message displayed: {}", errorText);
        Assert.assertEquals(errorText, "Denied");
    }
}