package session4;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SnapShot {

	static ChromeDriver driver;

	@Test
	public void snap() throws IOException {
		// Step1: Launch chrome

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");

		driver = new ChromeDriver();
		// Step2: Load URL
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");

		// Step3: Window maximize
		driver.manage().window().maximize();
	

		
		  // Step4: Take screen shot
			/*
			 * // Take screen shot and save it to file name src File src = File src = File
			 * src= driver.getScreenshotAs(OutputType.FILE);
			 * 
			 * // create new file dest in the project folder to copy the screen shot taken
			 * File destFile = new File("./reports/images/snap.jpg");
			 * 
			 * // Copy file from src to dest file created inside project folder
			 * FileUtils.copyFile(src, destFile);
			 */

		 takeSnap();

		// Step5: Close browser
		driver.close();
		//driver.quit();

	}

	public static long takeSnap() throws WebDriverException, IOException {
		// random file name generator
		long number = (long) Math.floor(Math.random() * 900000000L) + 10000000L;

		FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE), new File("./reports/images/" + number + ".jpg"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return number;
	}

}
