package my.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage extends WebUIInteractions {
	
	
	private static By downArrowButton = By.xpath("//form[@id='cityForm']//b[@class='dropdown-arrow']");
	private static By cityDropDown = By.xpath("//div[@class='selectric-scroll']");
//	@FindBy(id="selectCity")
	private static By okButton = By.id("selectCity");
	private static By quickBookingButton = By.id("quickbook__handle");
	private static By moviesPageButton = By.xpath("//a[text()='Movies']");
//	WebDriver driver = null;
//	WebDriverWait wait = new WebDriverWait(driver, 10);
	
	public LandingPage LandingPageFactoryInit(WebDriver webDriver) {
		return PageFactory.initElements(webDriver, LandingPage.class);
	}

	public boolean checkIfLocationSelectionWindowIsOpen() {
		return isElementDisplayed(downArrowButton);
	}
	
	public void selectCityAndClickOk(String cityName) {
		click(downArrowButton);
		selectOptionInDropDown(cityDropDown, cityName);
		click(okButton);
	}
	public void clickQuickBooking() {
		click(quickBookingButton);
	}
	public void clickMoviesButton() {
		click(moviesPageButton);
	}
	
	/*public static void main(String [] args ) {
		
		
		driver.get("https://www.spicinemas.in/");
		
		
//		WebDriverWait wait = new WebDriverWait(driver, 10); 
//		String userInputCitySelection = "coimbatore";
//		WebElement currentCitySelectedElement = driver.findElement(By.xpath("//span[@class = 'app-icon current-city']//following-sibling::span"));
//		
//		if(userInputCitySelection.equals(currentCitySelectedElement.getText()))
		WebElement downArrowButton = ifPresentReturnElementElseNull("//form[@id='cityForm']//b[@class='dropdown-arrow']",driver);
		if(downArrowButton!= null) {
		
			downArrowButton.click();

			ByXPath cbeElement = new ByXPath("");
			driver.findElement(cbeElement).click();

			

			//		WebElement okButton = wait.until(ExpectedConditions.visibilityOf(driver.findElement(new ById("selectCity"))));
			WebElement okButton = driver.findElement(new ById("selectCity"));
			okButton.click();
		}
		
		
	}
	*/
	
	
}
