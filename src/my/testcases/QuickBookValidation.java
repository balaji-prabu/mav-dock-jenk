package my.testcases;

import org.testng.annotations.Test;

public class QuickBookValidation extends BaseTest{

	@Test
	public void selectCityInLandingPage() {
		System.out.println("now showing start.");
		if(landingPage().checkIfLocationSelectionWindowIsOpen()) {
			landingPage().selectCityAndClickOk("coimbatore");
			landingPage().clickMoviesButton();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(moviesPage().checkIfNowShowingIsSelected()) {
				System.out.println(moviesPage().getListOfNowShowingMovies());
			} else {
				System.out.println("Not at now-showing");
			}
			
			
		}
		else
			System.out.println("Error - location selection window is not present");
		System.out.println("now showing end");
	}
	
	@Test(dependsOnMethods= {"selectCityInLandingPage"})
	public void quickBooking() {
		System.out.println("movei selection start");
		landingPage().selectCityAndClickOk("coimbatore");
		landingPage().clickQuickBooking();
		
		quickBookingPage().selectMovie();
		System.out.println("movei selection end");
	}
	
	
	
}
