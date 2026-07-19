package Parabank.runner.single;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/java/features/Tests/register.feature",
        glue = {"Parabank.stepDefinitions", "Parabank.Hooks"}
)
public class RegisterRun extends AbstractTestNGCucumberTests {
}
