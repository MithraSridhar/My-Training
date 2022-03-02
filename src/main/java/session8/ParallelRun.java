package session8;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelRun {
	
	@Test
	public void test1(){
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/");
		driver.manage().window().maximize();
		driver.close();
		//driver.quit();
		System.out.println("m1");
	}

	@Test
	public void test2(){
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.close();
		//driver.quit();
		System.out.println("m2");
	}
	
}
