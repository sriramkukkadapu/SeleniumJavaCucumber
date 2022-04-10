package testRunnerJUnit;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = "src/test/java/features/dbs.feature",
			//glue = "DBS_StepDefinitions",
			glue = "stepDefinitions",
			stepNotifications = true,
			plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"},
			monochrome = true
		)

public class TestRunnerDBS {

}
