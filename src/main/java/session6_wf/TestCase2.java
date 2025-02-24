package session6_wf;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase2 extends GenericWrappers {
	@Test
	public void testCase2() throws InterruptedException {
		invokeApp("Chrome", "https://demoqa.com/login");
		enterById("userName", "test");
		enterById("password", "Dheeshi3101*");
		clickById("login");
		Thread.sleep(2000);
		WebElement element = driver.findElementByXPath("//span[contains(text(),'Book Store')]");
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(2000);
		clickByXpath("//span[contains(text(),'Book Store')]");
		enterByXpath("//input[@id='searchBox']", "Learning JavaScript Design Patterns");
		clickByXpath("//a[contains(text(),'Learning JavaScript Design Patterns')]");
		String bookTitle = getTextByXpath("//div[@id='title-wrapper']//div[2]//label");
		System.out.println("Book title is " + bookTitle);
		clickByXpath("//button[@id='submit']");
		closeBrowser();
		closeAllBrowsers();
	}
}
