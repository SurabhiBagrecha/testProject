package com.main;

import java.util.concurrent.TimeUnit;

import junit.framework.TestCase;

import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StartupSteps extends TestCase {

	String path;
	

@Given("^check \"([^\"]*)\" link$")
public void check_link(String arg1) throws Throwable {
	 path=arg1;
	 FirefoxDriver driver = new FirefoxDriver();
	 String baseUrl = "http://localhost:8080/";
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    // Express the Regexp above with the code you wish you had
 //   throw new PendingException();
}

@Then("^Application will redirect to \"([^\"]*)\"$")
public void Application_will_redirect_to(String arg1) throws Throwable {
	if(path.equalsIgnoreCase("login"))
	{
		assertEquals(arg1, "login page");
	}else if(path.equalsIgnoreCase("singup"))
	{
		assertEquals(arg1, "signup page");
	}
    // Express the Regexp above with the code you wish you had
   // throw new PendingException();
}
}
