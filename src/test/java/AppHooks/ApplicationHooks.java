package AppHooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.utils.ConfigReaderClass;
import com.utils.DriverFactoryManagerClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks {

	private ConfigReaderClass configReader;
	private DriverFactoryManagerClass driverFactory;
	private WebDriver driver;
	private Properties prop;
	
	@Before(order=1)
	public void initBrowser() {
		System.out.println("ApplicationHooks");
		configReader = new ConfigReaderClass();
		driverFactory = new DriverFactoryManagerClass();
		prop = configReader.readConfigFile();
		System.out.println(prop.getProperty("browserName"));
		driver = driverFactory.initDriver(prop.getProperty("browserName"));
	}
	
	@After(order=2)
	public void screenshotFailedScenario(Scenario sc) {
		if(sc.isFailed()) {
			String ssName = sc.getName().replaceAll(" ", "_");
 			byte[] sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			sc.attach(sourcePath, "image/png", ssName);	
		}
	}
	
	@After(order=1)
	public void tearDown() {
		driver.quit();
	}
}
