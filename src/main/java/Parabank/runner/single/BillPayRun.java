package Parabank.runner.single;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/features/Tests/billPay.feature",
        glue = {"Parabank.stepDefinitions", "Parabank.Hooks"})

public class BillPayRun extends AbstractTestNGCucumberTests {
}
