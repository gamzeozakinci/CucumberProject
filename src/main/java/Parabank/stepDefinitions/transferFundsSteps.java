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
import org.testng.Assert;

public class transferFundsSteps extends GWD {

    TransferFundsPage tf = new TransferFundsPage();
    String transactionID;

    @When("User clicks transfer funds")
    public void userClicksTransferFunds() {
        tf.transferFundsButton.click();

    }

    @And("User enters the amount to transfer")
    public void userEntersTheAmountToTransfer() {
        tf.amount.sendKeys("50");

    }

    @And("User chooses account to transfer from")
    public void amountFrom() {
        Select selectAccount = new Select(tf.selectFromAccountId);
        selectAccount.selectByValue("18339");

    }

    @And("User chooses account to transfer to")
    public void amountTo() {
        Select selectAccount = new Select(tf.selecttoAccountId);
        selectAccount.selectByValue("19449");

    }

    @And("User clicks transfer button")
    public void userClicksTransferButton() {
        tf.transferButton.click();
    }

    @And("User must see transfer complete text")
    public void verifyTransfer() {
        WebElement verify = wait.until(ExpectedConditions.visibilityOf(tf.verifyTransfer));
        Assert.assertTrue(tf.verifyTransfer.isDisplayed());
    }

    @And("User opens account overview to check")
    public void AccountOverview() throws InterruptedException {
        WebElement waitAcc = wait.until(ExpectedConditions.elementToBeClickable(tf.accOverviewButton));
        Thread.sleep(2000);
        waitAcc.click();
    }

    @And("User checks transferred account")
    public void chooseAccount() {
        tf.chooseAcc.click();
    }

    @Then("User checks the received amount")
    public void theReceivedAmount() throws InterruptedException {

        WebElement element = GWD.getDriver().findElement(By.xpath("//*[@href='services.htm']"));
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        Assert.assertTrue(tf.receivedAmount.getText().equals("50") && tf.receivedText.getText().contains("Received"));
        System.out.println(tf.receivedText.getText()); // kontrol

    }

    @And("User chooses transaction to check")
    public void findTransactionsButton() {
        tf.receivedText.click();

    }

    @And("User saves transaction id")
    public void transactionidSave() {
        transactionID = tf.transactionid.getText();
    }

    @And("User clicks find transactions")
    public void transactionButton() {
        tf.findTransButton.click();
    }

    @And("User enters transaction id")
    public void entertransactionid() {
        tf.transactionIdinput.sendKeys(transactionID);
    }

    @And("User clicks find transactions")
    public void findButton() {
        tf.findTransButton.click();
    }

    @Then("User verifies that the transaction is made")
    public void verifyTransaction() {

    }










}
