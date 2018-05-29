package my.testcases;

import org.testng.annotations.Test;

public class QuickBookValidation extends BaseTest{

	@Test
	public void selectCityInLandingPage() {
		if(landingPage().checkIfLocationSelectionWindowIsOpen()) {
			landingPage().selectCityAndClickOk("coimbatore");
		}
		else
			System.out.println("Error - location selection window is not present");
	}
}
