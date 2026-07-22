package Parabank.stepDefinitions;

import Parabank.pages.TransferFundsPage;
import Parabank.utils.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

public class transferFundsSteps extends GWD {

    private static final Logger logger = LoggerFactory.getLogger(transferFundsSteps.class);

    TransferFundsPage tf = new TransferFundsPage();
    String transactionID;

    @When("User clicks transfer funds")
    public void userClicksTransferFunds() {
        logger.info("Waiting for transfer funds button to be clickable");
        WebElement buttonWait = GWD.getWait().until(ExpectedConditions.elementToBeClickable(tf.transferFundsButton));
        buttonWait.click();
    }

    @And("User enters the amount to transfer")
    public void userEntersTheAmountToTransfer() {
        logger.info("Entering transfer amount: 50");
        tf.amount.sendKeys("50");
    }

    @And("User chooses account to transfer from {string}")
    public void amountFrom(String accountId) {
        logger.info("Selecting from-account: " + accountId);
        Select selectAccount = new Select(tf.selectFromAccountId);
        selectAccount.selectByValue(accountId);
    }

    @And("User chooses account to transfer to {string}")
    public void amountTo(String accountId) {
        logger.info("Selecting to-account: " + accountId);
        Select selectAccount = new Select(tf.selecttoAccountId);
        selectAccount.selectByValue(accountId);
    }

    @And("User clicks transfer button")
    public void userClicksTransferButton() {
        logger.info("Waiting for transfer button to be clickable");
        WebElement buttonWait = GWD.getWait().until(ExpectedConditions.elementToBeClickable(tf.transferButton));
        logger.info("Clicking transfer button");
        tf.transferButton.click();
    }

    @And("User must see transfer complete text")
    public void verifyTransfer() {
        logger.info("Waiting for transfer complete confirmation");
        WebElement verify = GWD.getWait().until(ExpectedConditions.visibilityOf(tf.verifyTransfer));
        Assert.assertTrue(tf.verifyTransfer.isDisplayed());
        logger.info("Transfer complete confirmation displayed");
    }

    @And("User opens account overview to check")
    public void AccountOverview() {
        logger.info("Waiting for account overview button to be clickable");
        WebElement waitAcc = GWD.getWait().until(ExpectedConditions.elementToBeClickable(tf.accOverviewButton));
        logger.info("Clicking account overview button");
        waitAcc.click();
    }

    @And("User checks transferred account")
    public void chooseAccount() {
        logger.info("Clicking transferred account");
        tf.chooseAcc.click();
    }

    @Then("User checks the received amount")
    public void theReceivedAmount() {
        logger.info("Scrolling to services link");
        WebElement element = GWD.getDriver().findElement(By.xpath("//*[@href='services.htm']"));
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        String receivedAmountText = tf.receivedAmount.getText();
        String receivedText = tf.receivedText.getText();
        logger.info("Received amount: [{}], received text: [{}]", receivedAmountText, receivedText);

        Assert.assertTrue(receivedAmountText.equals("50") && receivedText.contains("Received"));
    }

    @And("User chooses transaction to check")
    public void findTransactionsButton() {
        logger.info("Clicking received transaction text");
        tf.receivedText.click();
    }

    @And("User saves transaction id")
    public void transactionidSave() {
        transactionID = tf.transactionid.getText();
        logger.info("Saved transaction id: {}", transactionID);
    }

    @And("User clicks find transactions")
    public void transactionButton() {
        logger.info("Clicking find transactions");
        tf.findTransButton.click();
    }

    @And("User enters transaction id")
    public void entertransactionid() {
        logger.info("Entering transaction id: {}", transactionID);
        tf.transactionIdinput.sendKeys(transactionID);
    }

    @And("User clicks find transactions button")
    public void findButton() {
        logger.info("Clicking find transactions button");
        tf.clickFindtrans.click();
    }

    @Then("User verifies that the transaction is made")
    public void verifyTransaction() {
        String verifyText = tf.verifyTransactionid.getText();
        logger.info("Transaction verification text: {}", verifyText);
        Assert.assertTrue(verifyText.contains("received"));
    }
}