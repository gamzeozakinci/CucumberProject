package Parabank.stepDefinitions;

import Parabank.pages.RegisterPage;
import Parabank.utils.GWD;
import io.cucumber.java.en.And;

public class RegisterSteps extends GWD {


    RegisterPage rp = new RegisterPage();

    @And("the user enters '<firstname>'")
    public void enterName() {
        rp.firstName.sendKeys("gamze");
    }

    @And("the user enters '<lastname>'")
    public void enterlastname() {
        rp.firstName.sendKeys("ozakin");
    }

    @And("the user enters '<address>'")
    public void enterAdress() {
        rp.firstName.sendKeys("ozakin");
    }


}
