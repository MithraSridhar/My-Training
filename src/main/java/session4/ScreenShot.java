package session4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	
	static ChromeDriver driver;

	public static void main(String[] args) throws IOException {
		// Step1: Launch chrome

				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");

				 driver = new ChromeDriver();
				// Step2: Load URL
				driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");

				// Step3: Window maximize
				driver.manage().window().maximize();
				
				
				/*
				 * File source=driver.getScreenshotAs(OutputType.FILE);
				 * 
				 * File destination = new File("./reports/images/screenshot.jpg");
				 * 
				 * FileUtils.copyFile(source, destination);
				 */
				screenShot();
			
			driver.close();

	}
	
	public static long screenShot() throws WebDriverException, IOException {
		
		long number = (long) Math.floor(Math.random() * 900000000L) + 10000000L;
		
		FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE), new File("./reports/images/"+number+".jpg"));
		
		return number;
	}

}
