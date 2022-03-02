package session2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerMethods {

	public static void main(String[] args) {
		// Step1: Launch Chrome
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
				
//Step2: Load URL
		driver.get("https://www.linkedin.com/login");
		
//Step3: Maximize window
		driver.manage().window().maximize();
		
	String title =	driver.getTitle();
	
	System.out.println(title);
	
String url=	driver.getCurrentUrl();
	System.out.println(url);
	
String pagesource=	driver.getPageSource();
System.out.println(pagesource);

String attribute =driver.findElementById("username").getAttribute("name");
System.out.println(attribute);


String style =driver.findElementById("username").getCssValue("style");
System.out.println(style);

String text=driver.findElementByXPath("//label[@class='form__label--floating']").getText();
System.out.println(text);
WebElement element =driver.findElementByXPath("//label[@class='form__label--floating']");

Dimension size=	element.getSize();
System.out.println(size);

Point location =element.getLocation();

System.out.println(location);

	String tagName=element.getTagName();
	System.out.println(tagName);


	}

}
