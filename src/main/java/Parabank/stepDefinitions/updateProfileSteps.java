package Parabank.stepDefinitions;

import Parabank.pages.UpdateProfilePage;
import Parabank.utils.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class updateProfileSteps extends GWD {

    UpdateProfilePage up = new UpdateProfilePage();

    @When("User clicks update contact info")
    public void clickUpdateContactInfo() {
        up.openAccountButton.click();

    }

    @And("User changes name")
    public void changeName() {
        up.firstName.clear();
        up.firstName.sendKeys("John");
    }

    @And("User changes lastname")
    public void changeLastName() {
        up.lastName.clear();
        up.lastName.sendKeys("Brown");
    }

    @And("User changes address")
    public void changeAddress() {
        up.street.clear();
        up.street.sendKeys("Konyaalti");
    }

    @And("User changes city")
    public void changeCity() {
        up.city.clear();
        up.city.sendKeys("Antalya");
    }

    @And("User changes state")
    public void changeState() {
        up.state.clear();
        up.state.sendKeys("Turkey");
    }

    @And("User changes zipcode")
    public void changeZipcode() {
        up.zipCode.clear();
        up.zipCode.sendKeys("07070");
    }

    @And("User changes phone number")
    public void changePhone() {
        up.phone.clear();
        up.phone.sendKeys("07070");
    }

    @And("User clicks update profile")
    public void clickUpdateProfile() {
        up.updateButton.click();
    }

    @Then("User must see profile updated line")
    public void verifyUpdate() {
        WebElement verifyUpdate = wait.until(ExpectedConditions.visibilityOf(up.verifyUpdate));

    }

}
