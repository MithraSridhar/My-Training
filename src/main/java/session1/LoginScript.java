package session1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScript {

	public static void main(String[] args) throws InterruptedException {

		//Step 1: Launch the browser		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		//Step 2 : Load URL
		driver.get("https://www.linkedin.com/login");
		driver.manage().window().maximize();
		
		//Step 3: Enter username
		driver.findElementById("username").sendKeys("test");
		Thread.sleep(2000);
		
		//Step 4: Enter password
		driver.findElementById("password").sendKeys("test");
		Thread.sleep(2000);
		
		//step 5: Click sign in
		driver.findElementByXPath("//button[@type='submit']").click();
		Thread.sleep(2000);
		
		//step 6: close the browser
		driver.close();
		
		System.out.println("Success");
				
	}

}
