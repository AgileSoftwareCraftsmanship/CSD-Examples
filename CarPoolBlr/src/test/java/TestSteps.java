package test.java;

import main.java.PostRide;
import main.java.Ride;
import junit.framework.TestCase;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps extends TestCase {
	Ride ride = new Ride();
	String operator;
	@Given("^Car owner enter Fname as \"([^\"]*)\" and Lname as \"([^\"]*)\" and Location as \"([^\"]*)\" and time as \"([^\"]*)\" an email as \"([^\"]*)\" and phone as \"([^\"]*)\"$")
	public void CarOwner_entry(String fname, String lname, String location, String time, String email, String phone) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		ride.setFname(fname);
		ride.setLname(lname);
		ride.setLocation(location);
		ride.setTime(time);
		ride.setEmail(email);
		ride.setPhone(phone);
	}
	
	@Given("^Car owner enter Location as \"([^\"]*)\" and time as \"([^\"]*)\"$")
	public void Car_owner_enter_Location_as_and_time_as(String arg1, String arg2) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@When("^click on \"([^\"]*)\"$")
	public void click_on(String operation) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		operator = operation;
	}

	@Then("^System should show a message \"([^\"]*)\"$")
	public void System_should_show_a_message(String message) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		PostRide posting = new PostRide();
		assertEquals(message, posting.post(ride));
	}
	
	@Then("^Send a mail to email id \"([^\"]*)\"$")
	public void Send_a_mail_to_email_id(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

}
