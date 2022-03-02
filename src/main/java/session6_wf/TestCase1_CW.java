package session6_wf;

import org.testng.annotations.Test;

public class TestCase1_CW extends GenericWrappers{
	
	@Test
	public void testCase1() {
		invokeApp("chrome", "https://demoqa.com/login");
		enterById("userName", "test");
		enterById("password", "Dheeshi3101*");
		clickById("login");
		scrollToElement(getElementByXpath("//span[contains(text(),'Book Store')]"));
		clickByXpath("//span[contains(text(),'Book Store')]");
		enterByXpath("//input[@id='searchBox']", "Git Pocket Guide");
		clickByXpath("//a[contains(text(),'Git Pocket Guide')]");
		getTextByXpath("//div[@id='title-wrapper']//div[2]//label");
		clickByXpath("//button[@id='submit']");	
		closeBrowser();
	}

}
