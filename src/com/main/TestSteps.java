package com.main;
import com.user.UserInfo;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.TestCase;

public class TestSteps extends TestCase {

	String actionButton;
	UserInfo userInfo = new UserInfo();
	@Given("^user entered valid username$")
	public void user_entered_valid_username() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
	}

	@When("^click on \"([^\"]*)\"$")
	public void click_on(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		actionButton = arg1;
	}

	@Then("^application display \"([^\"]*)\"$")
	public void application_display(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		if(actionButton.equals("submit")){
			assertEquals(arg1, "valid username entered");
		}
	}

	@Given("^user entered valid password$")
	public void user_entered_valid_password() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
	}

	@Given("^entered password \"([^\"]*)\"$")
	public void entered_password(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	   //throw new PendingException();
		userInfo.setPassword(arg1);
	}

	@Given("^entered username \"([^\"]*)\"$")
	public void entered_username(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		userInfo.setUserName(arg1);
	}

	@Given("^password$")
	public void password() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
	}

	@Given("^user entered valid username \"([^\"]*)\"$")
	public void user_entered_valid_username(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	   //throw new PendingException();
	}

	@Given("^password \"([^\"]*)\"$")
	public void password(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		userInfo.setPassword(arg1);
	}

}
