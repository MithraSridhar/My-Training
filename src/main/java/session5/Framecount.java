package session5;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framecount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	List<WebElement> parentFrames=	driver.findElementsByTagName("frame");
	
	System.out.println("Parent frame count is "+parentFrames.size());
	
	driver.switchTo().frame("frame-top");
	
	List<WebElement> nestedFrames=	driver.findElementsByTagName("frame");
	
	System.out.println("Nested frame count is "+nestedFrames.size());
	
	
	driver.close();

	}

}
