package Parabank.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/java/features/Tests/transferFunds.feature",
        glue = {"Parabank.stepDefinitions", "Parabank.Hooks"}
)

public class TransferFundsRun extends AbstractTestNGCucumberTests {
}
