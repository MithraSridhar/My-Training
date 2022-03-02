package session16challenges;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload_sendkeys_CW {

	public static void main(String[] args) throws InterruptedException {
		 	ChromeDriver driver = new ChromeDriver();
		   driver.manage().window().maximize(); 
		   driver.get("https://www.monsterindia.com/seeker/registration"); 
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		 Thread.sleep(3000);
		 
	WebElement upload=	 driver.findElementByXPath("//input[@id='file-upload']");
	
	upload.sendKeys("/Users/cb-mithra/Downloads/fileupload.txt");
	 Thread.sleep(4000);
	 driver.close();

	}

}
