package session3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;



public class Hw {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// 1: Launch Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
	
		// 2. Maximize window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// 3. Load URL
		driver.get("https://www.simplesite.com/pages/service-login.aspx");
		
		// 4. Enter Username
		driver.findElementByXPath("//input[@id='loginBox_username']").sendKeys("username");

		// 5. Enter Password
		driver.findElementByXPath("//input[@id='loginBox_password']").sendKeys("password");
		
		// 6. Click Login
		driver.findElementByXPath("//a[@id='loginBox_loginbtn']").click(); 
		
		System.out.println("Completed");

	}


}
