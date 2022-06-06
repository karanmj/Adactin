package runner;

import org.junit.*;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import base.classes.BaseClass;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/java/featureFile/adactin.feature", glue = "stepDefinition",
                 monochrome = true, dryRun = true 
                 )
public class Runner  {
	
}
