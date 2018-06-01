package my.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class TempBaseTestClass {
	@BeforeMethod
	public void beforeTestMethod() {
		System.out.println("Before test method");
	}
}
