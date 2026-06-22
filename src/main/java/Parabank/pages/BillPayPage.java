package Parabank.pages;

import Parabank.utils.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillPayPage {

    public BillPayPage() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Bill Pay']")
    public WebElement billpayButton;

    @FindBy(xpath = "//*[@name='payee.name']")
    public WebElement payeeName;

    @FindBy(xpath = "//*[@name='payee.address.street']")
    public WebElement payeeStreet;

    @FindBy(xpath = "//*[@name='payee.address.city']")
    public WebElement payeeAddress;

    @FindBy(xpath = "//*[@name='payee.address.state']")
    public WebElement payeeState;

    @FindBy(xpath = "//*[@name='payee.address.zipCode']")
    public WebElement payeeZipCode;

    @FindBy(xpath = "//*[@name='payee.phoneNumber']")
    public WebElement payeePhone;

    @FindBy(xpath = "//*[@name='payee.accountNumber']")
    public WebElement payeeAccount;

    @FindBy(xpath = "//*[@name='verifyAccount']")
    public WebElement payeeVerifyAccount;

    @FindBy(xpath = "//*[@name='amount']")
    public WebElement payeeAmount;

    @FindBy(xpath = "//*[@value='Send Payment']")
    public WebElement sendPaymentButton;


}
