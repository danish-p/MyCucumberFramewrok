package com.utils;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactoryManagerClass {

	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>();

	public static synchronized WebDriver getDriver() {
		if(tlDriver.get()==null) {
			System.out.println("Driver is null");
		}
		return tlDriver.get();
	}

	public WebDriver initDriver(String browserName) {

		System.out.println("Browser Name = "+browserName);
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","G:\\DanishTesting\\CocumberMavenProject\\MyCucumberFramewrok\\BrowserDrivers\\chromedriver.exe");
			tlDriver.set(new ChromeDriver());
		}else if(browserName.equals("firefox")){
			System.setProperty("webdriver.geckodriver.driver","G:\\DanishTesting\\CocumberMavenProject\\MyCucumberFramewrok\\BrowserDrivers\\geckodriver.exe");
			tlDriver.set(new FirefoxDriver());
		}else if(browserName.equals("IE")) {
			System.setProperty("webdriver.ie.driver","G:\\DanishTesting\\CocumberMavenProject\\MyCucumberFramewrok\\BrowserDrivers\\IEDriverServer.exe");
			tlDriver.set(new InternetExplorerDriver());
		}

		getDriver().manage().deleteAllCookies();
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		getDriver().manage().window().maximize();
		
		return getDriver();
	}
}
