package session3;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles_CW {

	public static void main(String[] args) {
		// 1. Launch chrome web browser
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
				ChromeDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				// driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

				// Load URL
				driver.get("http://the-internet.herokuapp.com/windows");
				
				driver.findElementByLinkText("Click Here").click();
				
				System.out.println("Current title is "+driver.getTitle());
				
			
				String ParentWindow=driver.getWindowHandle();
				
			Set<String> windowHandles =	driver.getWindowHandles();
			
			for (String eachWindow : windowHandles) {
				driver.switchTo().window(eachWindow);				
			}
			
			System.out.println("Current title is "+driver.getTitle());
			
			String ChildWindow=	driver.getWindowHandle();
			
			driver.switchTo().window(ParentWindow);
		
			System.out.println("Current title is "+driver.getTitle());
			
			
			driver.switchTo().window(ChildWindow);
			
			System.out.println("Current title is "+driver.getTitle());
			
			driver.quit();
				
	}

}
