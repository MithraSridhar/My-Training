package session9;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase1 extends ProjectWrappers {
	
	@BeforeClass
	public void setData() {
		testCaseName="TestCase1";
		testDescription="Book search for Git Pocket Guide";
		browserName="chrome";
		dataSheetName="TC001";
		category="Smoke";
		authors="Mithra";
	}
		
	//@Test
	@Test(dataProvider="fetchData")
	public void testCase1(String UN,String PW) throws InterruptedException {
		//invokeApp("Chrome");
		enterById("Login.UserName.Id",UN);
		enterById("Login.Password.Id", PW);
		clickById("login");
		Thread.sleep(2000);
		WebElement element = driver.findElementByXPath("//span[contains(text(),'Book Store')]");
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(2000);
		clickByXpath("//span[contains(text(),'Book Store')]");
		enterByXpath("//input[@id='searchBox']", "Git Pocket Guide");
		clickByXpath("//a[contains(text(),'Git Pocket Guide')]");
		String bookTitle = getTextByXpath("//div[@id='title-wrapper']//div[2]//label");
		System.out.println("Book title is " + bookTitle);
		clickByXpath("//button[@id='submit']");
		//closeBrowser();
	}

		
}
