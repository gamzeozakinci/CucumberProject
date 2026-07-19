package Parabank.stepDefinitions;

import Parabank.pages.UpdateProfilePage;
import Parabank.utils.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class updateProfileSteps extends GWD {

    UpdateProfilePage up = new UpdateProfilePage();

    @When("User clicks update contact info")
    public void clickUpdateContactInfo() {
        up.openAccountButton.click();
    }

    @And("User changes name to {string}")
    public void changeName(String firstName) throws InterruptedException {
        Thread.sleep(2000);
        up.firstName.clear();
        up.firstName.sendKeys(firstName);
    }

    @And("User changes lastname to {string}")
    public void changeLastName(String lastName) {
        up.lastName.clear();
        up.lastName.sendKeys(lastName);
    }

    @And("User changes address to {string}")
    public void changeAddress(String street) {
        up.street.clear();
        up.street.sendKeys(street);
    }

    @And("User changes city to {string}")
    public void changeCity(String city) {
        up.city.clear();
        up.city.sendKeys(city);
    }

    @And("User changes state to {string}")
    public void changeState(String state) {
        up.state.clear();
        up.state.sendKeys(state);
    }

    @And("User changes zipcode to {string}")
    public void changeZipcode(String zipCode) {
        up.zipCode.clear();
        up.zipCode.sendKeys(zipCode);
    }

    @And("User changes phone number to {string}")
    public void changePhone(String phone) {
        up.phone.clear();
        up.phone.sendKeys(phone);
    }

    @And("User clicks update profile")
    public void clickUpdateProfile() throws InterruptedException {
        Thread.sleep(2000);
        up.updateButton.click();
    }

    @Then("User must see profile updated line")
    public void verifyUpdate() {
        WebElement verifyUpdate = GWD.getWait().until(ExpectedConditions.visibilityOf(up.verifyUpdate));
        assert verifyUpdate.isDisplayed();
    }

    @Then("Clears all the fields")
    public void clearFields() throws InterruptedException {
        Thread.sleep(2000);
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
        Assert.assertTrue(up.errorMessageName.isDisplayed()
                && up.errorMessagelastName.isDisplayed()
                && up.errorMessageAddress.isDisplayed()
                && up.errorMessageCity.isDisplayed()
                && up.errorMessageZipcode.isDisplayed()
                && up.errorMessageState.isDisplayed());
    }
}