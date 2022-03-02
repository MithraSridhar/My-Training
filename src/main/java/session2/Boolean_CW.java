package session2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Boolean_CW {

	public static void main(String[] args) {
		// Step1: Launch Chrome
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
						
//Step2: Load URL
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		
//Step3: Maximize window
		driver.manage().window().maximize();
		
		WebElement display=driver.findElementByTagName("h3");
		boolean displayVerfication=	display.isDisplayed();
		System.out.println("Display is "+displayVerfication);
		
	boolean selected1=	driver.findElementByXPath("(//input[@type='checkbox'])[1]").isSelected();
	boolean selected2=	driver.findElementByXPath("(//input[@type='checkbox'])[2]").isSelected();
	System.out.println("Selected1 is "+selected1);
	System.out.println("Selected2 is "+selected2);
	
	driver.get("https://demoqa.com/radio-button");
	
	boolean enabled1=driver.findElementByXPath("//input[@id='yesRadio']").isEnabled();
	boolean enabled2=driver.findElementByXPath("//input[@id='noRadio']").isEnabled();
	
	System.out.println("Enabled1 is "+enabled1);
	System.out.println("Enabled2 is "+enabled2);
	
	driver.close();
	
		
	}

}
