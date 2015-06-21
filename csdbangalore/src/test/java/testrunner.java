package test.java;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(tags="@testing", glue ="test/java", features = "src/test/resource")
public class testrunner
{
	
}