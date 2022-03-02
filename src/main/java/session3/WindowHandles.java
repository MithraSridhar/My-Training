package session3;

import java.util.Set;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		// 1. Launch chrome web browser
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
				ChromeDriver driver = new ChromeDriver();
				//System.setProperty("webdriver.firefox.driver", "./drivers/geckodriver.exe");

		        //FirefoxDriver driver = new FirefoxDriver();
				// 2. Synchronization and Maximize
				driver.manage().window().maximize();
				//driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

				// Load URL
				driver.get("http://the-internet.herokuapp.com/windows");
				
				driver.findElementByLinkText("Click Here").click();
				String ParentWindow=driver.getWindowHandle();
			
				Thread.sleep(2000);
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				
				Set<String>	windows = driver.getWindowHandles();
			
				for (String eachwindow : windows) {
					driver.switchTo().window(eachwindow);
					/*
					 * if(driver.getTitle().equals("C")) break;
					 */
				}
			   String childWindow = driver.getWindowHandle();
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				
				driver.close();
				//driver.switchTo().window(ParentWindow);
				windows = driver.getWindowHandles();
				for (String eachwindow : windows) {
					driver.switchTo().window(eachwindow);				
				}
				Thread.sleep(2000);
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				
				driver.close();
				//driver.quit();
	}


}
