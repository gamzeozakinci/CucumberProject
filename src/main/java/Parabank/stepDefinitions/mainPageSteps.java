package Parabank.stepDefinitions;

import Parabank.pages.LoginPage;
import Parabank.utils.GWD;
import io.cucumber.java.en.Given;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class mainPageSteps extends GWD {

    private static final Logger logger = LoggerFactory.getLogger(mainPageSteps.class);

    LoginPage lp;

    @Given("User navigates to main page")
    public void openPage() {
        logger.info("Navigating to main page");
        GWD.getDriver().get("https://parabank.parasoft.com/");
    }

    @Given("User logged in to website")
    public void login() {
        logger.info("Logging in to website with default credentials");
        lp = new LoginPage();

        lp.username.sendKeys("gamze");
        lp.password.sendKeys("gamze");
        lp.loginButton.click();
    }
}