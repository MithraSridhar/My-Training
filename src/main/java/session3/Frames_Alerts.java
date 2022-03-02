package session3;

import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Alerts {

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
				
				driver.switchTo().alert().sendKeys("Mithra");
				driver.switchTo().alert().accept();
				
			String text=driver.findElementByXPath("//p[@id='demo']").getText();
			
			if(text.contains("Mithra")) {
				System.out.println("Verification is success "+text);
			}
			else {
				System.out.println("Verification is not success "+text);
			}
			driver.switchTo().defaultContent();
			
			driver.close();
			
	}

}
