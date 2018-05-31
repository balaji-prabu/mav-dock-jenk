package my.factory;

import my.pages.LandingPage;
import my.pages.MoviesPage;
import my.pages.QuickBookingPage;

public class PageFactory {

	private static LandingPage landingPageObj = null;
	private static MoviesPage moviesPageObj = null;
	private static QuickBookingPage quickBookingPageObj = null;
	
	public void initializePageObjects() {
		landingPageObj = new LandingPage();
		moviesPageObj = new MoviesPage();
		quickBookingPageObj = new QuickBookingPage();
	}
	
	public void initializePageObjectsNowShowing() {
		landingPageObj = new LandingPage();
		moviesPageObj = new MoviesPage();
//		landingPageObj = landingPageObj.LandingPageFactoryInit(DriverFactory.getWebDriver());
	}
	
	public void initializePageObjectsQuickBooking() {
		landingPageObj = new LandingPage();
		quickBookingPageObj = new QuickBookingPage();
//		landingPageObj = landingPageObj.LandingPageFactoryInit(DriverFactory.getWebDriver());
	}
	
	public static LandingPage landingPage() {
		return landingPageObj;
	}
	
	public static MoviesPage moviesPage() {
		return moviesPageObj;
	}
	
	public static QuickBookingPage quickBookingPage() {
		return quickBookingPageObj;
	}
}
