package Parabank.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/java/features/Tests",
        glue = "Parabank.stepDefinitions"
)
public class RegisterRun extends AbstractTestNGCucumberTests {
}
