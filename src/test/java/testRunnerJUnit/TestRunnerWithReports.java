package testRunnerJUnit;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = "src/test/java/features/hook.feature",
			glue = "stepDefinitions",
			stepNotifications = true,
			tags = "@MobileTest or @WebTest",
			plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"},
			monochrome = true
		)

public class TestRunnerWithReports {

}
