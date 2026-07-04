package Parabank.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/features/Tests/billPay.feature",
        glue = "Parabank.stepDefinitions")

public class BillPayRun extends AbstractTestNGCucumberTests {
}
