package com.integ.test.junit;

import junit.framework.TestCase;

import com.thoughtworks.selenium.webdriven.commands.Open;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cucumberStep extends TestCase {
	int input1, input2, result;
	String operator;
	@Given("^the inputs \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_inputs_and(String arg1, String arg2) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@When("^I select the \"([^\"]*)\" as option$")
	public void I_select_the_as_option(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		operator=arg1;
	}

	@Then("^the Result field should be \"([^\"]*)\"$")
	public void the_Result_field_should_be(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		if(operator.equals("Add"))
		{
			result=input1+input2;
			
		}
		if(operator.equals("Multiply"))
		{
			result=input1*input2;
			
		}
		assertEquals(arg1,result);
	}

@Given("^the number (\\d+) and (\\d+)$")
public void the_number_and(int arg1, int arg2) throws Throwable {
    // Express the Regexp above with the code you wish you had
    //throw new PendingException();
	input1=arg1;
	input2=arg2;
	
}

@Then("^the Result field should be (\\d+)$")
public void the_Result_field_should_be(int arg1) throws Throwable {
    // Express the Regexp above with the code you wish you had
    //throw new PendingException();
	if(operator.equals("Add"))
	{
		result=input1+input2;
		
	}
	if(operator.equals("Multiply"))
	{
		result=input1*input2;
		
	}
	assertEquals(arg1,result);
}



}
