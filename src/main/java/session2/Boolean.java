package session2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Boolean {

	public static void main(String[] args) {
		// Step1: Launch Chrome
		
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
				ChromeDriver driver = new ChromeDriver();
								
		//Step2: Load URL
				driver.get("https://the-internet.herokuapp.com/checkboxes");
				
		//Step3: Maximize window
				driver.manage().window().maximize();
				
WebElement element = driver.findElementByTagName("h3");
boolean display = element.isDisplayed();

System.out.println(display);

WebElement element1 =driver.findElementByXPath("(//input[@type='checkbox'])[1]");
boolean selected1 = element1.isSelected();
System.out.println(selected1);


WebElement element2 =driver.findElementByXPath("(//input[@type='checkbox'])[2]");
boolean selected2 = element2.isSelected();
System.out.println(selected2);

driver.get("https://demoqa.com/radio-button");

WebElement element3=driver.findElementByXPath("//input[@id='impressiveRadio']");
boolean eneabled1=element3.isEnabled();
System.out.println(eneabled1);

WebElement element4=driver.findElementByXPath("//input[@id='noRadio']");
boolean eneabled2=element4.isEnabled();
System.out.println(eneabled2);

driver.close();

	}

}
