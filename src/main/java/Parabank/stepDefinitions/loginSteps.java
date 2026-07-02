package Parabank.stepDefinitions;

import Parabank.pages.LoginPage;
import Parabank.utils.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class loginSteps {

    LoginPage lp = new LoginPage();

    @When("User enters username {string}")
    public void enterUsername(String username) {

        lp.username.sendKeys(username);
    }

    @And("User enters password {string}")
    public void enterPassword(String password) {

        lp.password.sendKeys(password);

    }

    @And("User clicks log in")
    public void clickLOGIN() {

        lp.loginButton.click();

    }

    @Then("the URL should contain {string}")
    public void checkLogin(String url) {

        String currentUrl = GWD.getDriver().getCurrentUrl();
        Assert.assertTrue(currentUrl.contains(url));


    }
}
