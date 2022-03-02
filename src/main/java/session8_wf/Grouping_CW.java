package session8_wf;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Grouping_CW {

	@Test(groups = "smoke")
	public void m1() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login");
		driver.manage().window().maximize();
		driver.close();
		System.out.println("m1");
		//throw new RuntimeException();
	}

	@Test(groups = "smoke")
	public void m2() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login");
		driver.manage().window().maximize();
		driver.close();
		System.out.println("m2");
	}

	@Test(groups = "sanity")
	public void m3() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login");
		driver.manage().window().maximize();
		driver.close();
		System.out.println("m3");
	}

	@Test(groups = "sanity")
	public void m4() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login");
		driver.manage().window().maximize();
		driver.close();
		System.out.println("m4");
	}

	@Test(groups = "regression")
	public void m5() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login");
		driver.manage().window().maximize();
		driver.close();
		System.out.println("m5");
	}

	@Test(groups = "regression")
	public void m6() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login");
		driver.manage().window().maximize();
		driver.close();
		System.out.println("m6");
	}

}
