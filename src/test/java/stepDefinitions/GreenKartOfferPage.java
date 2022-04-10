package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GreenKartOfferPage {
	WebDriver driver = null;
	

    @Then("^User goes and search for same shortname \\\"([^\\\"]*)\\\" in offers page to check if product exist$")
    public void user_goes_and_search_for_same_shortname_in_offers_page_to_check_if_product_exist(String arg1) throws Throwable {
    	driver.findElement(By.xpath("//a[normalize-space()='Top Deals']")).click();
    	Set<String> s1 = driver.getWindowHandles();
    	Iterator itr=s1.iterator();
    	String parentWindow = itr.next().toString();
    	String childWindow = itr.next().toString();
    	
    	driver.switchTo().window(childWindow);
    	driver.findElement(By.xpath("//input[@id=\"search-field\"]")).sendKeys(arg1);
    	String productName = driver.findElement(By.xpath("//table/tbody/tr/td[1]")).getText();
    	
    	Assert.assertEquals(productName, arg1);
    	driver.close();
    }
}
