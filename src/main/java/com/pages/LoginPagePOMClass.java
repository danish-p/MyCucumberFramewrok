package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPagePOMClass {
	
	private WebDriver driver;

	@FindBy(id = "username")
	private WebElement userName;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement password;
	
	@FindBy(xpath = "//div[text()=\"Login \"]")
	private WebElement loginBtn;
	
	@FindBy(xpath = "//a[contains(text(),'Robert')]")
	private WebElement userProfile;
	
	public LoginPagePOMClass(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsernamePassword(String username,String pwd) {
		userName.sendKeys(username);
		password.sendKeys(pwd);
		
	}
	
	public void clickLoginBtn() {
		loginBtn.click();
	}
	
	public boolean isProfilePresent() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		return wait.until(ExpectedConditions.visibilityOf(userProfile)).isDisplayed();
	}
}
