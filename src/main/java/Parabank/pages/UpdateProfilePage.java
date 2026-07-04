package Parabank.pages;

import Parabank.utils.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateProfilePage {
    public UpdateProfilePage() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//*[@href='updateprofile.htm']")
    public WebElement openAccountButton;

    @FindBy(css = "#customer\\.firstName")
    public WebElement firstName;

    @FindBy(css = "#customer\\.lastName")
    public WebElement lastName;

    @FindBy(css = "#customer\\.address\\.street")
    public WebElement street;

    @FindBy(css = "#customer\\.address\\.city")
    public WebElement city;

    @FindBy(css = "#customer\\.address\\.state")
    public WebElement state;

    @FindBy(css = "#customer\\.address\\.zipCode")
    public WebElement zipCode;

    @FindBy(css = "#customer\\.phoneNumber")
    public WebElement phone;

    @FindBy(css = "input.button")
    public WebElement updateButton;

    @FindBy(css = "#updateProfileResult .title")
    public WebElement verifyUpdate;

}