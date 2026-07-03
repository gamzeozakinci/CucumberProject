package Parabank.pages;

import Parabank.utils.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OpenNewAccount {

    public OpenNewAccount() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//*[@href = 'openaccount.htm']")
    public WebElement openAccountButton;

    @FindBy(css = "#type.input")
    public Select selectAccountType;

    @FindBy(css = "input.button")
    public WebElement registerButtonS;

    @FindBy(css = "#openAccountResult h1")
    public WebElement openverify;

}
