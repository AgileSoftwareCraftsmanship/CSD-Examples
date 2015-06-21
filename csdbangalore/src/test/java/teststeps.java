package test.java;

import main.java.calculator;
import junit.framework.TestCase;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class teststeps extends TestCase{

	int firstValue, lastValue, result;
	String operator;
	calculator calc = new calculator();
	
	@Given("^the inputs (\\d+) and (\\d+)$")
	public void the_inputs_and(int arg1, int arg2) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		firstValue=arg1;
		lastValue=arg2;
	}

	@When("^I select the \"([^\"]*)\" as option$")
	public void I_select_the_as_option(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		if(arg1.equals("Ad"))
			result=calc.add(firstValue, lastValue);
	}

	@Then("^the Result field should be (\\d+)$")
	public void the_Result_field_should_be(int arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		assertEquals(arg1, result);
	}

	@Given("^user inputs number (\\d+) and (\\d+)$")
	public void user_inputs_number_and(int arg1, int arg2) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		firstValue=arg1;
		lastValue=arg2;
	}
}
