package Parabank.stepDefinitions;

import Parabank.pages.LoginPage;
import Parabank.utils.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

public class loginSteps {

    private static final Logger logger = LoggerFactory.getLogger(loginSteps.class);

    LoginPage lp = new LoginPage();

    @When("User enters username {string}")
    public void enterUsername(String username) {
        logger.info("Entering username: {}", username);
        lp.username.sendKeys(username);
    }

    @And("User enters password {string}")
    public void enterPassword(String password) {
        logger.info("Entering password");
        lp.password.sendKeys(password);
    }

    @And("User clicks log in")
    public void clickLOGIN() {
        logger.info("Clicking login button");
        lp.loginButton.click();
    }

    @Then("the URL should contain {string}")
    public void checkLogin(String url) throws InterruptedException {
        Thread.sleep(2000);
        String currentUrl = GWD.getDriver().getCurrentUrl();
        logger.info("Expected URL to contain [{}], actual URL: [{}]",
                url, currentUrl);
        Assert.assertTrue(currentUrl.contains(url));
    }

    @Then("error text appears on the screen")
    public void errorText() throws InterruptedException {
        Thread.sleep(2000);
        logger.info("Waiting for error text to be visible");
        WebElement error = GWD.getWait().until(ExpectedConditions.visibilityOf(lp.invalidText));
        Assert.assertTrue(error.isDisplayed());
        logger.info("Error text displayed: {}", error.getText());
    }
}