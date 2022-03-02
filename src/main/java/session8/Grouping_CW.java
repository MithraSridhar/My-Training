package session8;

import org.testng.annotations.Test;

public class Grouping_CW {
	
	@Test(groups="smoke")
	public void m1() {
		System.out.println("m1");
		throw new RuntimeException();
	}
	
	@Test(groups="smoke")
	public void m2() {
		System.out.println("m2");
	}
	
	@Test(groups="sanity",dependsOnGroups="smoke")
	public void m3() {
		System.out.println("m3");
	}
	
	@Test(groups="sanity",dependsOnGroups="smoke")
	public void m4() {
		System.out.println("m4");
	}
	
	@Test(groups="regression",dependsOnGroups="sanity")
	public void m5() {
		System.out.println("m5");
	}
	
	@Test(groups="regression",dependsOnGroups="sanity")
	public void m6() {
		System.out.println("m6");
	}

}
