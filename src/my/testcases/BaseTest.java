package my.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import my.factory.DriverFactory;
import my.factory.PageFactory;


public class BaseTest extends PageFactory{

	WebDriver driver = null;
	PageFactory pageObj = null;
	
	@Parameters({ "app-url" })
	@BeforeMethod()
    public void LaunchApp(@Optional("https://www.spicinemas.in") String appUrl) {
		System.out.println("Base test invoked");
        initialize();
        clearCookies();
        goToHomePage(appUrl);
        pageObj = new PageFactory();
    }
	
	
	
	private void goToHomePage(String appUrl) {
		driver.get(appUrl);
//		initializePageObjects();
	}



	private void clearCookies() {
		driver.manage().deleteAllCookies();
		
	}



	private void initialize() {
		driver = DriverFactory.getWebDriver();
	}



	@AfterMethod()
	public void close() {
		System.out.println("Inside driver close method");
		driver.quit();
		driver = null;
	}
}
