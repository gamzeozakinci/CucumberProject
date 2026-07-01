package Parabank.stepDefinitions;

import Parabank.pages.RegisterPage;
import Parabank.utils.GWD;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps extends GWD {


    RegisterPage rp = new RegisterPage();

    @When("the user clicks {string}")
    public void clickRegister() {
        rp.registerButtonS.click();
    }

    @And("the user enters {string}")
    public void enterName() {
        rp.firstName.sendKeys("gamze");
    }

    @And("the user enters {string}")
    public void enterlastname() {
        rp.lastName.sendKeys("ozakin");
    }

    @And("the user enters {string}")
    public void enterAddress() {
        rp.address.sendKeys("Konyaalti");
    }

    @And("the user enters {string}")
    public void enterCity() {
        rp.city.sendKeys("Antalya");
    }

    @And("the user enters {string}")
    public void enterState() {
        rp.state.sendKeys("Turkey");
    }

    @And("the user enters {string}")
    public void enterZipCode() {
        rp.zipcode.sendKeys("07070");
    }

    @And("the user enters {string}")
    public void enterSSN() {
        rp.ssn.sendKeys("2342");
    }

    @And("the user enters {string}")
    public void enterUsername() {
        rp.username.sendKeys("gamzeo");
    }

    @And("the user enters {string}")
    public void enterPassword() {
        rp.password.sendKeys("gamzeo");
    }

    @And("the user enters {string}")
    public void enterConfirmPassword() {
        rp.repeatedPassword.sendKeys("gamzeo");
    }

    @Then("the user must see {string}")
    public void successRegister() {
        rp.successRegister.click();
    }

}
