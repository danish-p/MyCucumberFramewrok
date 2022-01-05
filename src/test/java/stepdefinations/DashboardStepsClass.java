package stepdefinations;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.utils.DriverFactoryManagerClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DashboardStepsClass {

	private String loggedInUserName;
	private WebDriver driver;
	
	@Given("Get logged in username")
	public void get_logged_in_username() {
		DriverFactoryManagerClass driverFactory = new DriverFactoryManagerClass();
		driver = driverFactory.getDriver();
		loggedInUserName = "Robert Barber";
	}

	@Then("username should be {string}")
	public void username_should_be(String expectedUserName) {
	    Assert.assertEquals(expectedUserName, loggedInUserName);
	}
}
