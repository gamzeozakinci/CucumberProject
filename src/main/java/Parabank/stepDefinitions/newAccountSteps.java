package Parabank.stepDefinitions;

import Parabank.pages.OpenNewAccountPage;
import Parabank.utils.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import java.time.Duration;

public class newAccountSteps extends GWD {

    private static final Logger logger = LoggerFactory.getLogger(newAccountSteps.class);

    public static String checkingAccno;
    public static String savingAccno;
    public static String accType;


    OpenNewAccountPage ona = new OpenNewAccountPage();

    @When("User clicks to Open New Account")
    public void newAccClick() {
        logger.info("Clicking Open New Account");
        ona.openAccountButton.click();
    }

    @And("User chooses account type as checking")
    public void checkingType() {
        logger.info("Selecting account type: checking");
        Select select = new Select(ona.selectAccountType);
        select.selectByValue("0");
        accType = ona.checAccountType.getText();
    }

    @And("User chooses account type as saving")
    public void savingType() {
        logger.info("Selecting account type: saving");
        Select select = new Select(ona.selectAccountType);
        select.selectByValue("1");
        accType = ona.saveAccountType.getText();
    }

    @And("User clicks open new account button")
    public void openNewAccountButton() throws InterruptedException {
        logger.info("Waiting for register button to be clickable");
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(ona.registerButtonS));
        Thread.sleep(4000);
        logger.info("Clicking open new account button");
        ona.registerButtonS.click();
    }

    @Then("User sees account opened on the screen")
    public void accountVerify() {
        logger.info("Waiting for account-opened confirmation to be visible");
        WebElement verify = GWD.getWait().until(ExpectedConditions.visibilityOf(ona.openverify));
        Assert.assertTrue(verify.isDisplayed());

        if (accType.equalsIgnoreCase("CHECKING")) {
            checkingAccno = ona.accCode.getText();
            System.out.println("Checking accno: " + checkingAccno);
        } else {
            savingAccno = ona.accCode.getText();
            System.out.println("Saving accno: " + savingAccno);
        }

        logger.info("Account opened confirmation displayed: {}", verify.getText());

        System.out.println("Bulunan degerler: " + checkingAccno + savingAccno);
    }
}