package Parabank.pages;

import Parabank.utils.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

    public RegisterPage() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//*[@href = 'register.htm']")
    public WebElement registerButtonS;

    @FindBy(css = "#customer\\.firstName")
    public WebElement firstName;

    @FindBy(css = "#customer\\.lastName")
    public WebElement lastName;

    @FindBy(css = "#customer\\.address\\.street")
    public WebElement address;

    @FindBy(css = "#customer\\.address\\.city")
    public WebElement city;

    @FindBy(css = "#customer\\.address\\.state")
    public WebElement state;

    @FindBy(css = "#customer\\.address\\.zipCode")
    public WebElement zipcode;

    @FindBy(css = "#customer\\.ssn")
    public WebElement ssn;

    @FindBy(css = "#customer\\.username")
    public WebElement username;

    @FindBy(css = "#customer\\.password")
    public WebElement password;

    @FindBy(css = "#repeatedPassword")
    public WebElement repeatedPassword;

    @FindBy(xpath = "//input[@value=\"Register\"]")
    public WebElement registerButtonE;

    @FindBy(xpath = "//*[@id=\"rightPanel\"]/p")
    public WebElement successRegister;

}
