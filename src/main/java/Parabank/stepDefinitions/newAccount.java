package Parabank.stepDefinitions;

import Parabank.pages.OpenNewAccount;
import Parabank.utils.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class newAccount extends GWD {

    OpenNewAccount ona = new OpenNewAccount();

    @When("User clicks to Open New Account")
    public void newAccClick() {
        ona.openAccountButton.click();
    }

    @And("User chooses account type")
    public void chooseAccountType() {
        Select select = new Select(ona.selectAccountType);
        select.selectByValue("0");
        ;
    }

    @And("User clicks open new account button")
    public void openNewAccountButton() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(ona.registerButtonS)).click();
        Thread.sleep(4000);
        ona.registerButtonS.click();

    }

    @Then("User sees account opened on the screen")
    public void accountVerify() {

        WebElement verify = wait.until(ExpectedConditions.visibilityOf(ona.openverify));
        Assert.assertTrue(verify.isDisplayed());
    }


}
