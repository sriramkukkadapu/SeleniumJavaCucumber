package stepDefinitions;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinitions {
	
	@Given("^user is on landing page$")
    public void user_is_on_landing_page() throws Throwable {
        System.out.println("User on landing page");
    }

    @When("^user log in to application with username and pwd$")
    public void user_log_in_to_application_with_username_and_pwd() throws Throwable {
    	System.out.println("User login to app with username and pwd");
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("home page populated");
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
    	System.out.println("cards are displayed");
    }
    
    @When("^user log in to application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_log_in_to_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
        System.out.println(strArg1 +  " " + strArg2);
    }

    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String strArg1) throws Throwable {
    	System.out.println(strArg1 );
    }
    
    
    @When("^user sign up with following details$")
    public void user_sign_up_with_following_details(DataTable data) throws Throwable {
        List<List<String>> obj = data.asLists();
        System.out.println("=======> Data table example");
        System.out.println(obj.get(0).get(0));
        System.out.println(obj.get(0).get(1));
        System.out.println(obj.get(0).get(2));
        System.out.println(obj.get(0).get(3));
        System.out.println(obj.get(0).get(4));
        
    }
    
    @When("^user log in to application with multiple (.+) and (.+)$")
    public void user_log_in_to_application_with_and(String username, String password) throws Throwable {
    	System.out.println("=======>Parameterization example");
        System.out.println(username + " " + password);
    }

}
