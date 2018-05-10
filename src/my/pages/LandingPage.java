package my.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {
	
	public static void main(String [] args ) {
		System.setProperty("webdriver.gecko.driver", "resources/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.spicinemas.in/");
		
		
//		WebDriverWait wait = new WebDriverWait(driver, 10); 
//		String userInputCitySelection = "coimbatore";
//		WebElement currentCitySelectedElement = driver.findElement(By.xpath("//span[@class = 'app-icon current-city']//following-sibling::span"));
//		
//		if(userInputCitySelection.equals(currentCitySelectedElement.getText()))
		WebElement downArrowButton = ifPresentReturnElementElseNull("//form[@id='cityForm']//b[@class='dropdown-arrow']",driver);
		if(downArrowButton!= null) {
		
			downArrowButton.click();

			ByXPath cbeElement = new ByXPath("//li[text()='coimbatore']");
			driver.findElement(cbeElement).click();

			

			//		WebElement okButton = wait.until(ExpectedConditions.visibilityOf(driver.findElement(new ById("selectCity"))));
			WebElement okButton = driver.findElement(new ById("selectCity"));
			okButton.click();
		}
		
		
	}
	
	public static WebElement ifPresentReturnElementElseNull(String xpath, WebDriver driver) {
		WebElement element = null;
		try {
			element = driver.findElement(By.xpath(xpath));
		} catch(NoSuchElementException e) {
			System.out.println("element not found");
		}
		return element;
	}
	
}
