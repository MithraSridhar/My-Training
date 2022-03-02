package session6_wf;

import java.awt.AWTException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// opening Firefox browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// load the browser with url
		driver.get("https://dribbble.com/tags/scroll_down");
		Thread.sleep(2000);

		// ((JavascriptExecutor)driver).executeScript("scroll(0,1050);");
		
		/*
		 * WebElement element= driver.findElementByXPath(
		 * "//a[@href='https://shortcut.com/?utm_source=dribbble&utm_medium=display&utm_campaign=prospecting&utm_content=design']"
		 * ); ((JavascriptExecutor)driver).executeScript(
		 * "arguments[0].scrollIntoView(true);", element); Thread.sleep(2000);
		 */
		  
		  // ((JavascriptExecutor) driver).executeScript("scroll(0,1050);"); //
		 // Thread.sleep(2000); 
		  WebElement element =driver.findElementByXPath("(//div[@class='shot-thumbnail-extras'])[9]"); 
		 
		  ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element); 
		  Thread.sleep(2000);
		  
		  
		  // To scroll till end of the page
		  
		//  ((JavascriptExecutor) driver)
		 // .executeScript("window.scrollTo(0, document.body.scrollHeight)");
		  //driver.close();
		 
	}

}
