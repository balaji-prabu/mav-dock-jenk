package my.factory;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

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

	public static RemoteWebDriver getWebDriver(){
		RemoteWebDriver driver = null;
		try {
			driver = new RemoteWebDriver(new URL("http://172.18.0.2:4444/wd/hub"), DesiredCapabilities.chrome()); 
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;
	}

}
