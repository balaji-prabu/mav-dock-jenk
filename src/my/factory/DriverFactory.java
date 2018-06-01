package my.factory;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	protected static WebDriver driver = null;
	private static final String FIREFOX = "firefox";
	private static final String CHROME = "chrome";

	public static WebDriver getWebDriver(final String browser){
		if (browser.isEmpty()) {
			//throw exception
		}
		if(driver != null){
			return driver;
		}
		synchronized (WebDriver.class) {
			if (driver == null) {
				String browserLowerCase = browser.toLowerCase();
				switch(browserLowerCase) {
				case FIREFOX:
					driver = new FirefoxDriver();
					break;
				case CHROME:
					System.setProperty("webdriver.chrome.driver", "chromedriver");
					driver = new ChromeDriver();
					break;
				}
			}
		}
		return driver;
	}

	public static WebDriver getWebDriver(){
		/*if(driver != null)
			return driver;
		else*/
			System.setProperty("webdriver.gecko.driver", "resources/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}

}
