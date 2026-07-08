package Parabank.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/java/features/Tests/requestLoan.feature",
        glue = {"Parabank.stepDefinitions", "Parabank.Hooks"}
)
public class RequestLoanRun extends AbstractTestNGCucumberTests {
}
