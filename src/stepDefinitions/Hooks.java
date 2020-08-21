package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;



public class Hooks {
	
	public static WebDriver driver;

	@Before
	public void setup() {
		// Initiate the WebDriver
		System.setProperty("webdriver.chrome.driver", "/Users/johanlindstrom/eclipse-workspace/Johan_Cucumber_testV1/Drivers/chromedriver");
		driver = new ChromeDriver();	
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
}
