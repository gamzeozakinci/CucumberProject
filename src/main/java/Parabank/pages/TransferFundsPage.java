package Parabank.pages;

import Parabank.utils.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferFundsPage {
    public TransferFundsPage() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//*[@href='transfer.htm']")
    public WebElement transferFundsButton;

    @FindBy(css = "input#amount")
    public WebElement amount;

    @FindBy(css = "select#fromAccountId")
    public WebElement selectFromAccountId;

    @FindBy(css = "select#toAccountId")
    public WebElement selecttoAccountId;

    @FindBy(css = "input.button")
    public WebElement transferButton;

    @FindBy(css = "#showResult .title")
    public WebElement verifyTransfer;

    @FindBy(xpath = "//*[@href=\"overview.htm\"]")
    public WebElement accOverviewButton;

    @FindBy(css = "#accountTable tbody tr:nth-child(1) td a")
    public WebElement chooseAcc;

    @FindBy(xpath = "//table[@id='transactionTable']/tbody/tr[last()]/td[last()]")
    public WebElement receivedAmount; //kontrol

    @FindBy(xpath = "//table[@id='transactionTable']/tbody/tr[last()]/td[2]")
    public WebElement receivedText; //kontrol

    @FindBy(xpath = "//table//tr[1]/td[2]")
    public WebElement transactionid;

    @FindBy(xpath = "//*[@href=\"transfer.htm\"]")
    public WebElement findTransButton;

    @FindBy(css = "input#transactionId")
    public WebElement transactionIdinput;

    @FindBy(css = "#findbyid")
    public WebElement clickFindtrans;

    @FindBy(css = "div#resultContainer")
    public WebElement verifyTransactionid;

}
