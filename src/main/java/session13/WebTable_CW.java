package session13;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_CW {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/table.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	WebElement table=driver.findElementByTagName("table");
	
	List<WebElement> rows = table.findElements(By.tagName("tr"));
	
	System.out.println("Rows count "+rows.size());
	
	//List<WebElement> cols= 	rows.get(0).findElements(By.tagName("td"));
	//System.out.println(cols.get(0).getText());
	
	for(int i=0;i<rows.size();i++) {
		List<WebElement> cols= rows.get(i).findElements(By.tagName("td"));
		
		for (int j=0;j<cols.size();j++) {
			System.out.println(cols.get(j).getText());
		}
	}
	
	driver.close();
	
	}

}
