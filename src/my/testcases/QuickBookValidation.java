package my.testcases;

import org.testng.annotations.Test;


public class QuickBookValidation extends BaseTest{

	@Test
	public void selectCityInLandingPage() {
		System.out.println("now showing start.");
		
		pageObj.initializePageObjectsNowShowing();
		if(pageObj.landingPage().checkIfLocationSelectionWindowIsOpen()) {
			pageObj.landingPage().selectCityAndClickOk("coimbatore");
			pageObj.landingPage().clickMoviesButton();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(pageObj.moviesPage().checkIfNowShowingIsSelected()) {
				System.out.println(pageObj.moviesPage().getListOfNowShowingMovies());
			} else {
				System.out.println("Not at now-showing");
			}
			
			
		}
		else
			System.out.println("Error - location selection window is not present");
		System.out.println("now showing end");
	}
	
	@Test(dependsOnMethods= {})
	public void quickBooking() {
		pageObj.initializePageObjectsQuickBooking();
		System.out.println("movei selection start");
		pageObj.landingPage().selectCityAndClickOk("coimbatore");
		pageObj.landingPage().clickQuickBooking();
		
		pageObj.quickBookingPage().selectMovie();
		System.out.println("movei selection end");
	}
	
	
	
}
