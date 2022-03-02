package session5;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exception_Runtime {
	
	static ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException, WebDriverException, IOException {
		//Step 1: Launch Chrome
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");

		 driver = new ChromeDriver(); 
		
		//Step 2: Maximize window
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Step 3: Load URL
		driver.get("https://www.linkedin.com/login");
		Thread.sleep(3000);
		
		//Step 4: Enter Username
		try {
			driver.findElementById("username").sendKeys("test");
			
		} 
		
		catch (NoSuchElementException e) {
			e.printStackTrace();
			//driver.findElementById("username").sendKeys("test");			
		}
		
		catch (Exception e) {			
			e.printStackTrace();
		}
		
		finally {
			takeSnap();
		}

		Thread.sleep(3000);
		
		//Step 5: Enter password
		driver.findElementById("password").sendKeys("test");
		Thread.sleep(3000);
		
		//Step 6: Click submit
		driver.findElementByXPath("//button[@type='submit']").click();
		Thread.sleep(3000);
		
		//Step 7: Close browser
		driver.quit();
		
		System.out.println("Success");
	}
	
	public static long takeSnap() throws WebDriverException, IOException {
		// random file name generator
		long number = (long) Math.floor(Math.random() * 900000000L) + 10000000L;

		FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE), new File("./reports/images/" + number + ".jpg"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return number;
	}

}
