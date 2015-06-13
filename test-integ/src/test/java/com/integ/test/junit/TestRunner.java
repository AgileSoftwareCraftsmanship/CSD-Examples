package com.integ.test.junit;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format = "pretty", features = "src/test/resources/cucumber/resources", monochrome = true)
public class TestRunner {

}