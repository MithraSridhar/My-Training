package session9;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DataProvider_CW extends ProjectWrappers{
	
	@BeforeClass
	public void setData() {
		testCaseName="TestCase1";
		testDescription="Book search for Git Pocket Guide";
		browserName="chrome";
		dataSheetName="TC001";
		category="Smoke";
		authors="Mithra";
	}

	
	@Test(dataProvider="fetchData")
	public void testCase1(String username,String password) throws InterruptedException {

		//Step 1: Launch the browser		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		//Step 2 : Load URL
		driver.get("https://www.linkedin.com/login");
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
