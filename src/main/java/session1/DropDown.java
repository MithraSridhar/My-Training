package session1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {

		// Step 1: Launch Chrome
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();

		// Step 2: Maximize window
		driver.manage().window().maximize();
		
		//Get window size		 
		System.out.println(driver.manage().window().getSize());
		
		//Set window size
		Dimension dm = new Dimension(450,630);
		driver.manage().window().setSize(dm);

		// Step 3: Load URL
		driver.get("http://the-internet.herokuapp.com/dropdown");
		Thread.sleep(2000);

		//Step 4: Identifying and saving drop down web element
		WebElement dropdown = driver.findElementByXPath("//select[@id='dropdown']");

		//Step 5: Creating object for select class using drop down web element
		Select option = new Select(dropdown);

		//Step 6: Choosing drop down options in 3 ways
		//Step 7a: Choosing drop down using index
		option.selectByIndex(1);
		Thread.sleep(3000);
		
		//Step 7b: Choosing drop down using value
		option.selectByValue("2");
		Thread.sleep(3000);
		
		//Step 7c: Choosing drop down using visible text		
		option.selectByVisibleText("Option 1");
		Thread.sleep(3000);
		
		//To deselect all the preselected options
		/*
		 * option.deselectByVisibleText("Option 1"); Thread.sleep(3000);
		 */
		
		//Step 8: Printing success
		System.out.println("Success");

		//Step 9: Closing the browser
		driver.close();

	}

}

