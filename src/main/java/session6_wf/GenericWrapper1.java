package session6_wf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericWrapper1 implements Wrappers{
	
	RemoteWebDriver driver;
	

	public void invokeApp(String browser, String Url) {
		
		try {
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver=new ChromeDriver();
			}
			
			else if(browser.equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.ie.driver", "./drivers/chromedriver.exe");
				driver=new InternetExplorerDriver();
			}
			
			else {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver=new ChromeDriver();
			}
			driver.manage().window().maximize();
			driver.get(Url);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		} 
		
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			takeSnap();
		}
				
	}

	public void enterById(String idValue, String data) {
		
		try {
			driver.findElementById(idValue).clear();
			driver.findElementById(idValue).sendKeys(data);
			System.out.println("The text entered successfully");
		} 
		
		catch (NoSuchElementException e) {
			e.printStackTrace();
			WebDriverWait wait = new WebDriverWait(driver,30);		
			wait.until(ExpectedConditions.visibilityOf(driver.findElementById(idValue)));
			driver.findElementById(idValue).sendKeys(data);	
			System.out.println("The text entered successfully" +e);
		}		
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {			
			takeSnap();
		}
			
	}

	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		
	}

	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		
	}

	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		
	}

	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		
	}

	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		
	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		
	}

	public void clickById(String id) {
		// TODO Auto-generated method stub
		
	}

	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		
	}

	public void clickByName(String name) {
		// TODO Auto-generated method stub
		
	}

	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		
	}

	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		
	}

	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		
	}

	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		
	}

	public WebElement getElementByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		return null;
	}

	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		
	}

	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		
	}

	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		
	}

	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		
	}

	public String acceptAlert() {
		// TODO Auto-generated method stub
		return null;
	}

	public void switchToFrameUsingIdName(String name) {
		// TODO Auto-generated method stub
		
	}

	public void takeSnap() {
		// TODO Auto-generated method stub
		
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		
	}

	public void scrollToElement(WebElement element) {
		// TODO Auto-generated method stub
		
	}
	
	

}
