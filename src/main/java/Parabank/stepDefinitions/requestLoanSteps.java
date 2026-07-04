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

    @And("User enters amount of loan")
    public void enterAmountOfLoan() {
        rl.loanAmount.sendKeys("100");

    }

    @And("User enters down payment")
    public void enterDownPayment() {
        rl.downPayment.sendKeys("10");
    }

    @And("User chooses an account")
    public void chooseAccount() {
        Select accSelect = new Select(rl.accountSelect);
        accSelect.selectByValue("13455");

    }

    @And("User clicks apply now button")
    public void clickApplyNowButton() throws InterruptedException {
        Thread.sleep(4000);
        rl.applyButton.click();
    }

    @Then("User must see Loan Request Processed")
    public void verifyLoan() {
        WebElement verifyLoanPro = wait.until(ExpectedConditions.visibilityOf(rl.verifyLoan));
        Assert.assertTrue(verifyLoanPro.isDisplayed());
    }

}
