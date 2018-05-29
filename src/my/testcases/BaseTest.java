package my.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import my.factory.DriverFactory;
import my.factory.PageFactory;

public class BaseTest extends PageFactory{

	WebDriver driver = null;
	
	@Parameters({ "app-url" })
	@BeforeTest(alwaysRun = true)
    public void LaunchApp(@Optional("https://www.spicinemas.in") String appUrl) {
        initialize();
        clearCookies();
        goToHomePage(appUrl);
    }
	
	
	
	private void goToHomePage(String appUrl) {
		driver.get(appUrl);
		initializePageObjects();
	}



	private void clearCookies() {
		driver.manage().deleteAllCookies();
		
	}



	private void initialize() {
		driver = DriverFactory.getWebDriver();
	}



	@AfterTest
	public void close() {
		driver.close();
	}
}
