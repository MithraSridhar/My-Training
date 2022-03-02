package session3;

import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAlerts_CW {

	public static void main(String[] args) {
		// 1. Launch chrome web browser
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
				ChromeDriver driver = new ChromeDriver();

				// 2. Synchronization and Maximize
				driver.manage().window().maximize();

				// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

				// Load URL
				driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
				
				driver.switchTo().frame("iframeResult");
				
				driver.findElementByXPath("//button[contains(text(),'Try it')]").click();
				
			String alertText=driver.switchTo().alert().getText();
			System.out.println(alertText);
			
			driver.switchTo().alert().sendKeys("Mithra");
			
			driver.switchTo().alert().accept();
			
		String FinalText=	driver.findElementByXPath("//p[@id='demo']").getText();
		
		System.out.println(FinalText);
		
		driver.switchTo().defaultContent();
		
		driver.close();

	}

}
