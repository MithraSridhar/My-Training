package session2;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VMethods_CW {

	public static void main(String[] args) {
		// Step1: Launch Chrome
		
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
				ChromeDriver driver = new ChromeDriver();
						
		//Step2: Load URL
				driver.get("https://www.linkedin.com/login");
				
		//Step3: Maximize window
				driver.manage().window().maximize();
				
				
			String Title=driver.getTitle();
			System.out.println("Title is "+Title);
			
		String currentURL =	driver.getCurrentUrl();
			
		System.out.println("Current URL is "+currentURL);
		
	String pageSource=	driver.getPageSource();
	System.out.println("Page source is "+pageSource);
	
	
	WebElement username=driver.findElementByXPath("//input[@id='username']");
	
	String attributeName=username.getAttribute("name");
	
	System.out.println("Attribute name is "+attributeName);
	
	String CSSValue=driver.findElementByXPath("//code[@id='i18nOtpSuccessMessage']").getCssValue("style");
	System.out.println("CSS value is "+CSSValue);
	
	String Text =driver.findElementByXPath("//label[@for='username']").getText();
	System.out.println("Text value is "+Text);
	
	Point location=	username.getLocation();
	System.out.println("Location value is "+location);
	
	String tagName  = username.getTagName();
	System.out.println("Tag Name  is "+tagName);
	
	driver.close();
	
	}

}
