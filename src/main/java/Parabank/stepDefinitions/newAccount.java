package Parabank.stepDefinitions;

import Parabank.pages.OpenNewAccount;
import Parabank.utils.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class newAccount extends GWD {

    OpenNewAccount ona = new OpenNewAccount();

    @When("User clicks to Open New Account")
    public void newAccClick() {
        ona.openAccountButton.click();
    }

    @And("User chooses account type")
    public void chooseAccountType() {
        ona.selectAccountType.selectByValue("0");
    }

    @And("User clicks open new account button")
    public void openNewAccountButton() {
        ona.registerButtonS.click();
    }

    @Then("User sees account opened on the screen")
    public void accountVerify() {
        Assert.assertTrue(ona.openverify.isDisplayed());
    }


}
