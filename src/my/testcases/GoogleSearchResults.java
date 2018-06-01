package my.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleSearchResults extends TempBaseTestClass {

	@Test
	public void method1(){
		System.out.println("method 1");
	}
	@Test
	public void method2() {
		System.out.println("method 2");
	}
	
	/*@BeforeMethod
	public void beforeTestMethod() {
		System.out.println("before test method overridden");
	}*/
}
