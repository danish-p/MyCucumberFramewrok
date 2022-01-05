package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = {"src/test/resources/com/features"},
		glue = {"stepdefinations","AppHooks"},
		tags = "@Smoke1",		
		plugin = {"pretty", "json:target/cucumber-reportsJSON/Cucumber.json",
				"junit:target/cucumber-reportsXML/Cucumber.xml",
		"html:target/cucumber-reportsHTML/Cucumber.html"},
		dryRun = false,
		monochrome = true
		)

public class LoginTestRunner {


}
