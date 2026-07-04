package Parabank.pages;

import Parabank.utils.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RequestLoanPage {

    public RequestLoanPage() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//*[@href='requestloan.htm']")
    public WebElement requestLoanButton;

    @FindBy(css = "input#amount")
    public WebElement loanAmount;

    @FindBy(css = "input#downPayment")
    public WebElement downPayment;

    @FindBy(css = "#fromAccountId.input")
    public WebElement accountSelect;

    @FindBy(css = "input.button")
    public WebElement applyButton;

    @FindBy(css = "#requestLoanResult .title")
    public WebElement verifyLoan;

}