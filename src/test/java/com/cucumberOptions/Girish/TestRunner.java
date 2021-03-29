package com.cucumberOptions.Girish;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(  
	    features = "src/test/java/features",
	    glue="stepDefinations",
	    tags= {"@TC01,@TC02"}
	    )
public class TestRunner extends AbstractTestNGCucumberTests  {

}
