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

public class GreenKartLandingPage {
	WebDriver driver = null;
	
	@Given("^User is on Greencart landing page$")
    public void user_is_on_greencart_landing_page() throws Throwable {
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise");
    }

    @When("^User searched with short name \"([^\"]*)\" and extracted actual name of product$")
    public void user_searched_with_short_name_something_and_extracted_actual_name_of_product(String strArg1) throws Throwable {
        driver.findElement(By.xpath("//input[@type=\"search\"]")).sendKeys("Tom");
        driver.findElement(By.xpath("//button[@class=\"search-button\"]")).click();
        String vegName = driver.findElement(By.xpath("//h4[@class=\"product-name\"]")).getText().split("-")[0].trim();
        //vegName.equals("Tomato");
        Thread.sleep(2000);
        System.out.println(vegName);
    }


}
