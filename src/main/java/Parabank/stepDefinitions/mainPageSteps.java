package Parabank.stepDefinitions;

import Parabank.pages.LoginPage;
import Parabank.utils.GWD;
import io.cucumber.java.en.Given;

public class mainPageSteps extends GWD {

    LoginPage lp;

    @Given("User navigates to main page")
    public void openPage() {
        GWD.getDriver().get("https://parabank.parasoft.com/");
    }

    @Given("User logged in to website")
    public void login() {
        lp = new LoginPage();

        lp.username.sendKeys("gamze");
        lp.password.sendKeys("gamze");
        lp.loginButton.click();

    }
}
