package my.factory;

import my.pages.LandingPage;

public class PageFactory {

	private static LandingPage landingPageObj = null;
	
	public void initializePageObjects() {
		landingPageObj = new LandingPage();
	}
	
	public static LandingPage landingPage() {
		return landingPageObj;
	}
}
