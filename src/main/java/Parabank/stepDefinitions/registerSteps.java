package Parabank.stepDefinitions;

import Parabank.pages.RegisterPage;
import Parabank.utils.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

public class registerSteps extends GWD {

    private static final Logger logger = LoggerFactory.getLogger(registerSteps.class);

    RegisterPage rp = new RegisterPage();

    @When("the user clicks register")
    public void clickRegister() {
        logger.info("Clicking register");
        rp.registerButtonS.click();
    }

    @And("the user enters name")
    public void enterName() {
        logger.info("Entering first name: gamze");
        rp.firstName.sendKeys("gamze");
    }

    @And("the user enters surname")
    public void enterlastname() {
        logger.info("Entering last name: ozakin");
        rp.lastName.sendKeys("ozakin");
    }

    @And("the user enters address")
    public void enterAddress() {
        logger.info("Entering address: Konyaalti");
        rp.address.sendKeys("Konyaalti");
    }

    @And("the user enters city")
    public void enterCity() {
        logger.info("Entering city: Antalya");
        rp.city.sendKeys("Antalya");
    }

    @And("the user enters state")
    public void enterState() {
        logger.info("Entering state: Turkey");
        rp.state.sendKeys("Turkey");
    }

    @And("the user enters zipcode")
    public void enterZipCode() {
        logger.info("Entering zipcode: 07070");
        rp.zipcode.sendKeys("07070");
    }

    @And("the user enters ssn")
    public void enterSSN() {
        logger.info("Entering SSN");
        rp.ssn.sendKeys("2342");
    }

    @And("the user enters username")
    public void enterUsername() {
        logger.info("Entering username: gamze");
        rp.username.sendKeys("gamze");
    }

    @And("the user enters password")
    public void enterPassword() {
        logger.info("Entering password");
        rp.password.sendKeys("gamze");
    }

    @And("the user enters password again")
    public void enterConfirmPassword() {
        logger.info("Entering password confirmation");
        rp.repeatedPassword.sendKeys("gamze");
    }

    @And("the user clicks register button")
    public void clickRegisterE() {
        logger.info("Clicking register submit button");
        rp.registerButtonE.click();
    }

    @Then("the user must see success message")
    public void successRegister() {
        logger.info("Checking for registration success message");
        Assert.assertTrue(rp.successRegister.isDisplayed());
        logger.info("Registration success message displayed");
    }
}