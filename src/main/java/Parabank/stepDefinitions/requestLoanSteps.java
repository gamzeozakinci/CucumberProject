package Parabank.stepDefinitions;

import Parabank.pages.RequestLoanPage;
import Parabank.utils.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class requestLoanSteps extends GWD {

    RequestLoanPage rl = new RequestLoanPage();

    @When("User clicks request loan")
    public void clickRequestLoan() {
        rl.requestLoanButton.click();
    }

    @And("User enters amount of loan {string}")
    public void enterAmountOfLoan(String loanAmount) {
        rl.loanAmount.sendKeys(loanAmount);
    }

    @And("User enters down payment {string}")
    public void enterDownPayment(String downPayment) {
        rl.downPayment.sendKeys(downPayment);
    }

    @And("User chooses an account {string}")
    public void chooseAccount(String accountNumber) {
        Select accSelect = new Select(rl.accountSelect);
        accSelect.selectByValue(accountNumber);
    }

    @And("User clicks apply now button")
    public void clickApplyNowButton() throws InterruptedException {
        Thread.sleep(2000);
        rl.applyButton.click();
    }

    @Then("User must see Loan Request Processed")
    public void verifyLoan() {
        WebElement verifyLoanPro = wait.until(ExpectedConditions.visibilityOf(rl.verifyLoan));
        Assert.assertTrue(verifyLoanPro.isDisplayed());
    }

    @Then("User must see error message on screen")
    public void verifyLoanError() {
        WebElement verifyError = wait.until(ExpectedConditions.visibilityOf(rl.errorLoan));
        Assert.assertEquals(verifyError.getText(), "Denied");

    }
}