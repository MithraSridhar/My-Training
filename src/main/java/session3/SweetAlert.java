package session3;


import org.openqa.selenium.chrome.ChromeDriver;

public class SweetAlert {

	public static void main(String[] args) throws InterruptedException {
		// 1. Launch chrome web browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();

		// 2. Synchronization and Maximize
		driver.manage().window().maximize();

		// Load URL
		driver.get("https://sweetalert.js.org/guides/#getting-started");
		// Click preview
		driver.findElementByClassName("preview").click();

		Thread.sleep(3000);
		// Click OK on sweet alert
		driver.findElementByXPath("//button[contains(text(),'OK')]").click();

		driver.close();
	}

}
