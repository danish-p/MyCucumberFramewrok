package stepdefinations;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableStepClass {

	
	@Given("user is on registration page")
	public void user_is_on_registration_page() {
	   System.out.println("User is on register Page");
	}

	@When("user enters following user details")
	public void user_enters_following_user_details(DataTable dataTable) {
	   List<List<String>> newUser =  dataTable.asLists(String.class);
	   
	   for (List<String> user: newUser) {
		   System.out.println(user);
		   System.out.println(user.get(0));
	   }
	}

	@Then("user register successully")
	public void user_register_successully() {
		System.out.println("User registered successfully");
	}
	
	@Given("user is on registration page with different data and column")
	public void user_is_on_registration_page_with_different_data_and_column() {
		System.out.println("User is on register Page with Maps");
	}

	@When("user enters following user details with columns")
	public void user_enters_following_user_details_with_columns(DataTable dataTable) {
	    
		List<Map<String, String>> userList = dataTable.asMaps(String.class,String.class);
		
		System.out.println(userList.get(0).keySet());
		for (Map<String, String> userMap : userList) {
			System.out.println(userMap);
		}
	}
}
