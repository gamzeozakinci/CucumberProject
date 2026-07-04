package Parabank.stepDefinitions;

import Parabank.pages.TransferFundsPage;
import Parabank.utils.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class transferFundsSteps extends GWD {

    TransferFundsPage tf = new TransferFundsPage();

    @When("User clicks transfer funds")
    public void userClicksTransferFunds() {
        tf.transferFundsButton.click();

    }

    @And("User enters the amount to transfer")
    public void userEntersTheAmountToTransfer() {
        tf.amount.sendKeys("400");

    }

    @And("User chooses account to transfer from")
    public void amountFrom() {
        Select selectAccount = new Select(tf.selectFromAccountId);
        selectAccount.selectByValue("13677");

    }

    @And("User chooses account to transfer to")
    public void amountTo() {
        Select selectAccount = new Select(tf.selecttoAccountId);
        selectAccount.selectByValue("15009");

    }

    @And("User clicks transfer button")
    public void userClicksTransferButton() {
        tf.transferButton.click();
    }

    @Then("User must see transfer complete text")
    public void verifyTransfer() {
        Assert.assertTrue(tf.verifyTransfer.isDisplayed());
    }


}
