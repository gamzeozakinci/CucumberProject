package Parabank.runner.group;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/features/Tests",
        glue = {"Parabank.stepDefinitions", "Parabank.Hooks"},
        tags = "@Contact"
)

public class contactRun extends AbstractTestNGCucumberTests {
}
