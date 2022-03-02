package session8_wf;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class DataProviderTestCase2 extends GenericWrappers {
	
	@Test(dataProvider="fetchData")
	public void testCase1(String username, String password) throws InterruptedException {
		invokeApp("Chrome", "https://demoqa.com/login");
		enterById("userName", username);
		enterById("password", password);
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
		closeBrowser();
		closeAllBrowsers();
	}
	
	/*
	 * //@DataProvider(name="fetchData",parallel=true)
	 * 
	 * @DataProvider(name="fetchData") public String[][] getData() { String[][] data
	 * = new String[2][2]; data[0][0]="test"; data[0][1]="Dheeshi3101*";
	 * 
	 * data[1][0]="test"; data[1][1]="Dheeshi3101*";
	 * 
	 * return data; }
	 */
	
	@DataProvider(name="fetchData",parallel=true)
	public String[][] getData() {
		String [][] data = new String [2][2];
		data[0][0]="test";
		data[0][1]="Dheeshi3101*";
		
		data[1][0]="sugith";
		data[1][1]="Books@1234";		
		return data;		
	}
	
}
