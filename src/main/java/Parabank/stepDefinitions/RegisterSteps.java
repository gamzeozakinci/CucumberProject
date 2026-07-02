package Parabank.stepDefinitions;

import Parabank.pages.RegisterPage;
import Parabank.utils.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterSteps extends GWD {


    RegisterPage rp = new RegisterPage();

    @When("the user clicks register")
    public void clickRegister() {
        rp.registerButtonS.click();
    }

    @And("the user enters name")
    public void enterName() {
        rp.firstName.sendKeys("gamze");
    }

    @And("the user enters surname")
    public void enterlastname() {
        rp.lastName.sendKeys("ozakin");
    }

    @And("the user enters address")
    public void enterAddress() {
        rp.address.sendKeys("Konyaalti");
    }

    @And("the user enters city")
    public void enterCity() {
        rp.city.sendKeys("Antalya");
    }

    @And("the user enters state")
    public void enterState() {
        rp.state.sendKeys("Turkey");
    }

    @And("the user enters zipcode")
    public void enterZipCode() {
        rp.zipcode.sendKeys("07070");
    }

    @And("the user enters ssn")
    public void enterSSN() {
        rp.ssn.sendKeys("2342");
    }

    @And("the user enters username")
    public void enterUsername() {
        rp.username.sendKeys("gamzeo");
    }

    @And("the user enters password")
    public void enterPassword() {
        rp.password.sendKeys("gamzeo");
    }

    @And("the user enters password again")
    public void enterConfirmPassword() {
        rp.repeatedPassword.sendKeys("gamzeo");
    }

    @And("the user clicks register button")
    public void clickRegisterE() {
        rp.registerButtonE.click();
    }

    @Then("the user must see success message")
    public void successRegister() {

        Assert.assertTrue(rp.successRegister.isDisplayed());

    }

}
