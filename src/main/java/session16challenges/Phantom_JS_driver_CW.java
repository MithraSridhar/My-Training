package session16challenges;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class Phantom_JS_driver_CW {

	public static void main(String[] args) throws WebDriverException, IOException {
		System.setProperty("phantomjs.binary.path", "/Users/cb-mithra/Downloads/phantomjs-2.1.1-macosx/bin/phantomjs");
		PhantomJSDriver driver = new PhantomJSDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// load the browser with url
		driver.get("https://www.google.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement search = driver.findElementByName("q");
		search.sendKeys("guru99");
		search.submit();
		System.out.println(driver.getTitle());
		FileUtils.copyFile(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE),
				new File("./reports/images/phantomjsscreenshot.jpg"));
		driver.close();

	}

}
