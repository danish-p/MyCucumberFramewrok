package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineExample {
	@Given("User is on registration Page")
	public void user_is_on_registration_page() {
	   System.out.println("user_is_on_registration_page");
	}

	@When("user enters {string} in first name field")
	public void user_enters_in_first_name_field(String fname) {
		   System.out.println("first name = "+fname);

	}

	@When("user enter {string} in last name field")
	public void user_enter_in_last_name_field(String lname) {
		   System.out.println("last name = "+lname);

	}

	@When("user clicks on register button")
	public void user_clicks_on_register_button() {
		   System.out.println("user_clicks_on_register_button");

	}

	@Then("registration is successfully")
	public void registration_is_successfully() {
		   System.out.println("registration_is_successfully");

	}
	
	@Given("User is on amount")
	public void user_is_on_amount() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user enters {int} in first name field")
	public void user_enters_in_first_name_field(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user enter {int} in last name field")
	public void user_enter_in_last_name_field(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on submit")
	public void user_clicks_on_submit() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("check amount")
	public void check_amount() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user enters {double} in first name field")
	public void user_enters_in_first_name_field(Double double1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user enter {double} in last name field")
	public void user_enter_in_last_name_field(Double double1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
