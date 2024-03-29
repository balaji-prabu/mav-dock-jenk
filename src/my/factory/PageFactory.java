package my.factory;

import my.pages.LandingPage;
import my.pages.MoviesPage;
import my.pages.QuickBookingPage;

public class PageFactory {

	private LandingPage landingPageObj = null;
	private MoviesPage moviesPageObj = null;
	private QuickBookingPage quickBookingPageObj = null;
	
	public void initializePageObjects() {
		landingPageObj = new LandingPage();
		moviesPageObj = new MoviesPage();
		quickBookingPageObj = new QuickBookingPage();
	}
	
	public PageFactory initializePageObjectsNowShowing() {
		
		this.landingPageObj = new LandingPage();
		this.moviesPageObj = new MoviesPage();
		return this;
//		landingPageObj = landingPageObj.LandingPageFactoryInit(DriverFactory.getWebDriver());
	}
	
	public PageFactory initializePageObjectsQuickBooking() {
		landingPageObj = new LandingPage();
		quickBookingPageObj = new QuickBookingPage();
		return this;
//		landingPageObj = landingPageObj.LandingPageFactoryInit(DriverFactory.getWebDriver());
	}
	
	public LandingPage landingPage() {
		return landingPageObj;
	}
	
	public MoviesPage moviesPage() {
		return moviesPageObj;
	}
	
	public QuickBookingPage quickBookingPage() {
		return quickBookingPageObj;
	}
}
