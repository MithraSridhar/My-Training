package session16challenges;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile_Mac {

	// For Mac
	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();

		driver.get("https://www.grammarly.com/plagiarism-checker");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElementByXPath("//div[@class='_3255a-uploadButton']").click();

		Thread.sleep(6000);

		// Store the copied text in the clipboard
		StringSelection stringSelection = new StringSelection("/Users/cb-mithra/Downloads/fileupload.txt");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

		// Paste it using Robot class
		
		Robot robot = new Robot();
		

		// Cmd + Tab is needed since it launches a Java app and the browser looses focus

		robot.keyPress(KeyEvent.VK_META);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.delay(1000);
		robot.keyRelease(KeyEvent.VK_META);
		robot.delay(1000);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.delay(1000);

		robot.keyPress(KeyEvent.VK_META);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.delay(1000);
		robot.keyRelease(KeyEvent.VK_META);
		robot.delay(1000);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.delay(1000);

		robot.keyPress(KeyEvent.VK_META);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.delay(1000);
		robot.keyRelease(KeyEvent.VK_META);
		robot.delay(1000);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.delay(1000);
		
		robot.keyPress(KeyEvent.VK_META);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.delay(1000);
		robot.keyRelease(KeyEvent.VK_META);
		robot.delay(1000);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.delay(1000);

		// Open Goto window
		robot.keyPress(KeyEvent.VK_META);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_G);
		robot.delay(1000);
		robot.keyRelease(KeyEvent.VK_META);
		robot.delay(1000);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.delay(1000);
		robot.keyRelease(KeyEvent.VK_G);
		robot.delay(1000);

		// Paste the clipboard value
		robot.keyPress(KeyEvent.VK_META);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_V);
		robot.delay(1000);
		robot.keyRelease(KeyEvent.VK_META);
		robot.delay(1000);
		robot.keyRelease(KeyEvent.VK_V);
		robot.delay(1000);

		// Press Enter key to close the Goto window and Upload window
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(1000);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(1000);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);
		driver.close();
	}

}
