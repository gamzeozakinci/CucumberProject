package Parabank.pages;

import Parabank.utils.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenNewAccountPage {

    public OpenNewAccountPage() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//*[@href = 'openaccount.htm']")
    public WebElement openAccountButton;

    @FindBy(css = "#type.input")
    public WebElement selectAccountType;

    @FindBy(css = "input.button")
    public WebElement registerButtonS;

    @FindBy(css = "#openAccountResult h1")
    public WebElement openverify;

    @FindBy(css = "a#newAccountId")
    public WebElement accCode;

    @FindBy(xpath = "//*[@id=\"type\"]/option[1]")
    public WebElement checAccountType;

    @FindBy(xpath = "//*[@id=\"type\"]/option[2]")
    public WebElement saveAccountType;


}
