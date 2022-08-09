package stepDefinitions;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DBS_StepDefinitions {

	WebDriver driver;
	
	@Given("^Start the browser$")
    public void start_the_browser() throws Throwable {
		System.out.println("=========> starting browser");
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
    }
	
	@Given("Navigate to {string}")
	public void navigate_to(String url) {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(url);
	}
	
	@When("User is on Awards page")
	public void user_is_on_awards_page() {
	    // Write code here that turns the phrase above into concrete actions
	    String expectedTitle = "Banking Awards & Accolades | DBS Bank";
	    Assert.assertEquals(expectedTitle, driver.getTitle());		
	}
	@Then("Validate the total number of awards displayed on the page is {int}.")
	public void validate_the_total_number_of_awards_displayed_on_the_page_is(int expectedAwards) {
	    // Write code here that turns the phrase above into concrete actions
		int actualAwards = driver.findElements(By.xpath("//h2[text()=\"Banking\"]/..//h3")).size();
		
		Assert.assertEquals(expectedAwards, actualAwards);
	}
	
	@And("^Validate all the (.+) and (.+) of the awards mentioned in the below table and print in the cucumber report in the form of a table.$")
	public void validate_all_the_and_of_the_awards_mentioned_in_the_below_table_and_print_in_the_cucumber_report_in_the_form_of_a_table(String awardname, String caption) {
	    // Write code here that turns the phrase above into concrete actions
	    List<WebElement> headingsEle = driver.findElements(By.xpath("//h2[text()=\"Banking\"]/..//h3/strong"));
	    List<String> headingsText = new ArrayList<String>();
	    for(WebElement ele:headingsEle) {
	    	headingsText.add(ele.getText());
	    }
	    System.out.println(headingsText);
	    boolean valid = headingsText.contains(awardname);
	    if(valid == true)
	    	{
	    		System.out.println("Valid: "+awardname);
	    		System.out.println("Checking caption: "+caption);
	    		List<WebElement> matchingCaptions = driver.findElements(By.xpath("//h2[text()=\"Banking\"]/..//h3/strong[text()='"+awardname+"']/../..//ul/li"));
	    		boolean captionCheck = false;
	    		for(WebElement ele: matchingCaptions) {
	    			if(ele.getText().contains(caption)) {
	    				System.out.println("Caption: Valid");
	    				captionCheck = true;
	    				break;
	    			}
	    		}
	    		if(captionCheck ==false)
	    			System.out.println("Caption: Invalid");
	    	}
	    
	    else
	    	System.out.println("Invalid Award name: "+awardname +" So skipping checking caption part");
		
		driver.quit();
		System.out.println("=========> Ending Test");
	}



}
