package my.pages;

import org.openqa.selenium.By;

public class QuickBookingPage extends WebUIInteractions{
	private static By dateElement = By.xpath("//li[@data-filter-value='04-06-2018']");
	private static By movieElement = By.xpath("//span[@title='AVENGERS INFINITY WAR']");
//	private static By cinemaElement = By.xpath("//a[@title='Select a Cinema']");
	private static By theatreElement = By.xpath("//a[@title='Select a Cinema']//following::a[text()='The Cinema']");
	private static By ticketElement = By.xpath("//li[@data-filter-display-value='2 Tickets']");
	private static By showElement = By.xpath("//span[@data-filter-value='SCREEN5 - ELITE - 12:30 PM']");
	private static By buyTicketsButton = By.xpath("//a[@class='button buyTicket']");
	
	
	public void selectMovie() {
		click(dateElement);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(movieElement);
		click(theatreElement);
		click(ticketElement);
		click(showElement);
		click(buyTicketsButton);
	}
}
