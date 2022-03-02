package session6_sugith;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GenericWrappers implements Wrappers{
	
	RemoteWebDriver driver;

	public void enterById(String Locator, String testData) throws WebDriverException, IOException {
		
		try {
			driver.findElementById(Locator).clear();
			driver.findElementById(Locator).sendKeys(testData);
			System.out.println("Enterted the text "+testData+" to the field with locator "+Locator+" successfully");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Entering the text "+testData+" to the field with locator "+Locator+" is not success");
		}
		finally {
			takeSnap();
		}		
	}

	public void enterByXpath(String Locator, String testData) {
		// TODO Auto-generated method stub
		
	}

	public void enterByClass(String Locator, String testData) {
		// TODO Auto-generated method stub
		
	}

	public void enterByName(String Locator, String testData) {
		// TODO Auto-generated method stub
		
	}
	
	public  long takeSnap() throws WebDriverException, IOException {
		// random file name generator
		long number = (long) Math.floor(Math.random() * 900000000L) + 10000000L;

		FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE), new File("./reports/images/" + number + ".jpg"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return number;
	}

}
