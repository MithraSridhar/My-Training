package session6_wf;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase1_Recap extends GenericWrappers {

	@Test
	public void m1() {
		invokeApp("chrome", "https://demoqa.com/login");
		enterById("userName", "test");
		enterById("password", "Dheeshi3101*");
		clickById("login");
		WebElement element = getElementByXpath("//span[contains(text(),'Book Store')]");
		scrollToElement(element);
		clickByXpath("//span[contains(text(),'Book Store')]");
		enterByXpath("//input[@id='searchBox']", "Git Pocket Guide");
		clickByXpath("//a[contains(text(),'Git Pocket Guide')]");
		String text = getTextByXpath("//div[@id='title-wrapper']//div[2]//label");
		System.out.println("Title is " + text);
		clickByXpath("//button[@id='submit']");
		closeBrowser();

	}
	
	@Test
	public void m2() {
		invokeApp("chrome", "https://demoqa.com/login");
		enterById("userName", "test");
		enterById("password", "Dheeshi3101*");
		clickById("login");
		WebElement element = getElementByXpath("//span[contains(text(),'Book Store')]");
		scrollToElement(element);
		clickByXpath("//span[contains(text(),'Book Store')]");
		enterByXpath("//input[@id='searchBox']", "Git Pocket Guide");
		clickByXpath("//a[contains(text(),'Git Pocket Guide')]");
		String text = getTextByXpath("//div[@id='title-wrapper']//div[2]//label");
		System.out.println("Title is " + text);
		clickByXpath("//button[@id='submit']");
		closeBrowser();

	}

}
