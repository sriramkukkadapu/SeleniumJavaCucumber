package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before("@MobileTest")
	public void beforeValidationMobile() {
		System.out.println("=========== Mobile before hook ===========");
	}
	
	@After("@MobileTest")
	public void afterValidationMobile() {
		System.out.println("=========== Mobile after hook ===========");
		System.out.println("");
	}

	@Before("@WebTest")
	public void beforeValidationWeb() {
		System.out.println("=========== Web before hook ===========");
	}
	
	@After("@WebTest")
	public void afterValidationWeb() {
		System.out.println("=========== Web after hook ===========");
		System.out.println("");
	}
}
