package session7;

import org.testng.annotations.Test;

public class DependsOnMethods {

	@Test
	public void testCase1() {
		System.out.println("testCase1");
		throw new RuntimeException();
	}

	@Test(dependsOnMethods = "session7.DependsOnMethods.testCase1", alwaysRun = true)
	public void testCase2() {
		System.out.println("testCase2");
	}

	@Test(dependsOnMethods = {"session7.DependsOnMethods.testCase2","session7.DependsOnMethods.testCase1"})
	public void testCase3() {
		System.out.println("testCase3");
	}

	@Test(enabled = false)
	public void testCase4() {
		System.out.println("testCase4");
	}

}
