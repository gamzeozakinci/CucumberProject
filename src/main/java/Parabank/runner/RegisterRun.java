package Parabank.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/java/features/Tests",
        glue = "stepDefinitions",
        tags = "@accounts"
)

public class RegisterRun extends AbstractTestNGCucumberTests {




}
