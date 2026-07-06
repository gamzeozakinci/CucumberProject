package Parabank.pages;

import Parabank.utils.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name=\"username\"]")
    public WebElement username;

    @FindBy(xpath = "//input[@name=\"password\"]")
    public WebElement password;

    @FindBy(xpath = "//input[@value=\"Log In\"]")
    public WebElement loginButton;

    @FindBy(css = "p.error")
    public WebElement invalidText;



}
