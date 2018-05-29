package my.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import my.factory.DriverFactory;

public class WebUIInteractions extends DriverFactory{

	protected boolean isElementDisplayed(By locator) {
        if (driver.findElements(locator).size() > 0) {
            return true;
        } else {
            return false;
        }
    }
	
	public void selectOptionInDropDown(By locator, String optionToBeSelected) {
		By selectionLocator = By.xpath("//li[text()='"+optionToBeSelected+"']");
		driver.findElement(locator).findElement(selectionLocator).click();
	}
	
	public void click(By locator) {
		driver.findElement(locator).click();
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
	
	 private static WebElement findElementWithWait(By by, int defaultWait) {
	        WebDriverWait wait = new WebDriverWait(driver, defaultWait);
	        wait.until(ExpectedConditions.presenceOfElementLocated(by));
	        return driver.findElement(by);

	    }
}
