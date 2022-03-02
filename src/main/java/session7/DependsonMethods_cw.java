package session7;

import org.testng.annotations.Test;



public class DependsonMethods_cw {

	@Test(dependsOnMethods="session7.DependsonMethods_cw.test2",alwaysRun=true)
	public void test1() {
		System.out.println("test1");		
	}
	
	@Test(expectedExceptions = RuntimeException.class)
	public void test2() {
		System.out.println("test2");
		throw new RuntimeException();
	}
	
	@Test(successPercentage = 100)
	public void test3() {
		System.out.println("test3");		
	}
	
	@Test(enabled=false)
	public void test4() {
		System.out.println("test4");
	}
}
