package session16challenges;


import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTML_driver_CW {

	public static void main(String[] args) {

		HtmlUnitDriver driver = new HtmlUnitDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// load the browser with url
		driver.get("https://www.linkedin.com/login");

		String title = driver.getTitle();
		System.out.println(title);
		driver.close();

	}

}
