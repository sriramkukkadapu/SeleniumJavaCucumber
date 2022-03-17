# installation and configs
1. add cucumber eclipse plugin in eclipse by going to market place. <br>
2. create a new project choose maven archetype -> quick start <br>
3. once project created, right click, configure -> convert into a cucumber project. <br>
4. in pom.xml add dependencies of cucumber-java and cucumber-junit

# Plugin to generate step definitions from feature file.
copy feature file contents to the plugin click generate
https://chrome.google.com/webstore/detail/tidy-gherkin/nobemmencanophcnicjhfhnjiimegjeo/related?hl=en-GB

# Example of JUnit TestRunner class
```java 
package testRunnerJUnit;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = "src/test/java/features/login2.feature",
			glue = "stepDefinitions",
			stepNotifications = true
			
		)
public class TestRunner {
}
```

# Example of JUnit TestRunner class
```java
package testRunnerTestNG;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
			features = "src/test/java/features/login.feature",
			glue = "stepDefinitions"
			
		)

public class TestRunner extends AbstractTestNGCucumberTests {

}
```

# Example of passing data from feature file.
```cucumber
Scenario: Home page default login
Given user is on landing page
When user sign up with following details
| jenny | pwd123 | jenny@gmail.com | Australia | 9060109978|
Then Home page is populated
And Cards displayed are "false"
```
You can read them as 

```java
    @When("^user log in to application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_log_in_to_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
        System.out.println(strArg1 +  " " + strArg2);
    }
```
Or you can use Datatable to fetch the data from feature file steps.

```java
 @When("^user sign up with following details$")
    public void user_sign_up_with_following_details(DataTable data) throws Throwable {
        List<List<String>> obj = data.asLists();
        System.out.println(obj.get(0).get(0));
        System.out.println(obj.get(0).get(1));...        
    }    
```

# Example of parameterization feature file.
1. In feature file mention as Scenario Outline
