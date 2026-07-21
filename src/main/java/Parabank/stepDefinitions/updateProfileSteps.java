package Parabank.stepDefinitions;

import Parabank.pages.UpdateProfilePage;
import Parabank.utils.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

public class updateProfileSteps extends GWD {

    private static final Logger logger = LoggerFactory.getLogger(updateProfileSteps.class);

    UpdateProfilePage up = new UpdateProfilePage();

    @When("User clicks update contact info")
    public void clickUpdateContactInfo() {
        logger.info("Clicking update contact info");
        up.openAccountButton.click();
    }

    @And("User changes name to {string}")
    public void changeName(String firstName) throws InterruptedException {
        Thread.sleep(2000);
        logger.info("Changing first name to: {}", firstName);
        up.firstName.clear();
        up.firstName.sendKeys(firstName);
    }

    @And("User changes lastname to {string}")
    public void changeLastName(String lastName) {
        logger.info("Changing last name to: {}", lastName);
        up.lastName.clear();
        up.lastName.sendKeys(lastName);
    }

    @And("User changes address to {string}")
    public void changeAddress(String street) {
        logger.info("Changing address to: {}", street);
        up.street.clear();
        up.street.sendKeys(street);
    }

    @And("User changes city to {string}")
    public void changeCity(String city) {
        logger.info("Changing city to: {}", city);
        up.city.clear();
        up.city.sendKeys(city);
    }

    @And("User changes state to {string}")
    public void changeState(String state) {
        logger.info("Changing state to: {}", state);
        up.state.clear();
        up.state.sendKeys(state);
    }

    @And("User changes zipcode to {string}")
    public void changeZipcode(String zipCode) {
        logger.info("Changing zipcode to: {}", zipCode);
        up.zipCode.clear();
        up.zipCode.sendKeys(zipCode);
    }

    @And("User changes phone number to {string}")
    public void changePhone(String phone) {
        logger.info("Changing phone number to: {}", phone);
        up.phone.clear();
        up.phone.sendKeys(phone);
    }

    @And("User clicks update profile")
    public void clickUpdateProfile() throws InterruptedException {
        Thread.sleep(2000);
        logger.info("Clicking update profile");
        up.updateButton.click();
    }

    @Then("User must see profile updated line")
    public void verifyUpdate() {
        logger.info("Waiting for profile updated confirmation");
        WebElement verifyUpdate = GWD.getWait().until(ExpectedConditions.visibilityOf(up.verifyUpdate));
        assert verifyUpdate.isDisplayed();
        logger.info("Profile updated confirmation displayed");
    }

    @Then("Clears all the fields")
    public void clearFields() throws InterruptedException {
        Thread.sleep(2000);
        logger.info("Clearing all profile fields");
        up.firstName.clear();
        up.lastName.clear();
        up.street.clear();
        up.city.clear();
        up.state.clear();
        up.zipCode.clear();
        up.phone.clear();
    }

    @Then("User sees the error messages for mandatory areas")
    public void verifyErrorMessage() {
        logger.info("Checking mandatory field error messages");
        Assert.assertTrue(up.errorMessageName.isDisplayed()
                && up.errorMessagelastName.isDisplayed()
                && up.errorMessageAddress.isDisplayed()
                && up.errorMessageCity.isDisplayed()
                && up.errorMessageZipcode.isDisplayed()
                && up.errorMessageState.isDisplayed());
        logger.info("Mandatory field error messages verified");
    }
}