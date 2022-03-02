package session8;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_CW {
	
	@Test
	@Parameters({"URL","UserName","Password"})
	public void testCase1(String url,String username,String password) throws InterruptedException {

		//Step 1: Launch the browser		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		//Step 2 : Load URL
		driver.get(url);
		driver.manage().window().maximize();
		
		//Step 3: Enter username
		driver.findElementById("username").sendKeys(username);
		Thread.sleep(2000);
		
		//Step 4: Enter password
		driver.findElementById("password").sendKeys(password);
		Thread.sleep(2000);
		
		//step 5: Click sign in
		driver.findElementByXPath("//button[@type='submit']").click();
		Thread.sleep(2000);
		
		//step 6: close the browser
		driver.close();
		
		System.out.println("Success");
	}

}
