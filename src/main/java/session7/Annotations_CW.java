package session7;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_CW {

	@BeforeSuite
	public void m1() {
		System.out.println("Before Suite");
	}

	@BeforeTest
	public void m2() {
		System.out.println("Before Test");
	}

	@BeforeClass
	public void m3() {
		System.out.println("Before Class");

	}

	@BeforeMethod
	public void m4() {
		System.out.println("Before Method");

	}

	@Test
	public void m5() {
		System.out.println("Testcase1");

	}

	@Test
	public void m6() {
		System.out.println("Testcase2");

	}

	@AfterMethod
	public void m7() {
		System.out.println("After Method");

	}

	@AfterClass
	public void m8() {
		System.out.println("After Class");

	}
	
	@AfterTest
	public void m9() {
		System.out.println("After Test");

	}
	
	@AfterSuite
	public void m10() {
		System.out.println("After Suite");

	}

}
