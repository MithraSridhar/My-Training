package session7;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationCount_CW {
	
	/*
	 * @Test(invocationCount=3,threadPoolSize=2) public void test1() {
	 * System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
	 * ChromeDriver driver = new ChromeDriver();
	 * driver.get("https://www.linkedin.com/login");
	 * driver.manage().window().maximize(); System.out.println("Invocation Count1");
	 * driver.close(); }
	 */
	@Test(invocationCount=3,invocationTimeOut=3000)
	public void test2() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login");
		driver.manage().window().maximize();
		System.out.println("Invocation timeout");
		driver.close();
	}

	@Test(invocationCount=3,timeOut=3000)
	public void test3() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login");
		driver.manage().window().maximize();
		System.out.println("Timeout");
		driver.close();
	}

}
