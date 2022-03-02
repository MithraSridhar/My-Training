package session7;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationCount {

	@Test(invocationCount = 1, threadPoolSize = 1,priority=3)
	public void test1() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login");
		driver.manage().window().maximize();
		System.out.println("Invocation Count");
		driver.close();
	}

	@Test(invocationCount = 1, invocationTimeOut = 10000, timeOut = 7000,priority=2)
	public void test2() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login");
		driver.manage().window().maximize();
		System.out.println("Invocation Timout");
		driver.close();
	}

	@Test(invocationCount = 1, timeOut = 4000, invocationTimeOut = 10000,priority =1)
	public void test3() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login");
		driver.manage().window().maximize();
		System.out.println("Time out");
		driver.close();
	}

}
