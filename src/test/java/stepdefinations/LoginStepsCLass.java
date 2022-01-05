package stepdefinations;

import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import com.pages.LoginPagePOMClass;
import com.utils.ConfigReaderClass;
import com.utils.DriverFactoryManagerClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepsCLass {

	
	private LoginPagePOMClass loginPagePOMClass = new LoginPagePOMClass(DriverFactoryManagerClass.getDriver());
	private ConfigReaderClass configReader = new ConfigReaderClass();
	private WebDriver driver;
	private String loginPageTitle,homePageTitle;
	
	@Given("User Should Be On Login Page")
	public void User_Should_Be_On_Login_Page() {
	    System.out.println("Step1 : Login page loads");
		Properties prop = configReader.readConfigFile();
		System.out.println(prop.getProperty("Url"));
		
	    driver = DriverFactoryManagerClass.getDriver();
		driver.get(prop.getProperty("Url"));
	}

	@When("verify page title")
	public void verify_page_title() {
		System.out.println("Step2 : verify page loads");
		loginPageTitle = driver.getTitle();
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitle) {
	    System.out.println("Step 3: page title should be = "+expectedTitle);
	    Assert.assertEquals(expectedTitle, loginPageTitle);
	}

	@When("Enter valid username & password")
	public void enter_valid_username_password() {
		System.out.println("Step2 : Enter valid username & password");
		loginPagePOMClass.enterUsernamePassword("admin", "manager");
	}
	
	@And("Click login button")
	public void Click_login_button() {
		System.out.println("Step3 : Click login button");
		loginPagePOMClass.clickLoginBtn();
	}
	
	@Then("User should login successfully and navigate to dashboard page and title of dashboard should be {string}")
	public void user_should_login_successfully_and_navigate_to_dashboard_page_and_title_of_dashboard_should_be(String expectedTitle) {
		if(loginPagePOMClass.isProfilePresent()) {
			homePageTitle = driver.getTitle();
			System.out.println("Step4 : expected user should visit dashboard page = "+homePageTitle);
		}
		Assert.assertEquals(expectedTitle, homePageTitle);
	}

}
