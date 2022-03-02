package session3;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles1 {

	public static void main(String[] args) throws InterruptedException {
		// 1. Launch chrome web browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		// System.setProperty("webdriver.firefox.driver", "./drivers/geckodriver.exe");

		// FirefoxDriver driver = new FirefoxDriver();
		// 2. Synchronization and Maximize
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

		// Load URL
		driver.get("http://the-internet.herokuapp.com/windows");

		driver.findElementByLinkText("Click Here").click();

		System.out.println("Parent window " + driver.getCurrentUrl());
		System.out.println("Parent window " + driver.getTitle());
		Thread.sleep(2000);
		String parentWindow = driver.getWindowHandle();

		Set<String> windowHandles = driver.getWindowHandles();
		int windowCount = windowHandles.size();
		System.out.println("My windows count is " + windowCount);

		for (String eachWindow : windowHandles) {
			driver.switchTo().window(eachWindow);
		}

		System.out.println("Child window " + driver.getCurrentUrl());
		System.out.println("Child window " + driver.getTitle());
		Thread.sleep(2000);
		String ChildWindow = driver.getWindowHandle();

		// driver.close();

		driver.switchTo().window(parentWindow);

		System.out.println("Parent window " + driver.getCurrentUrl());
		System.out.println("Parent window " + driver.getTitle());
		Thread.sleep(2000);

		driver.switchTo().window(ChildWindow);

		System.out.println("Child window " + driver.getCurrentUrl());
		System.out.println("Child window " + driver.getTitle());
		Thread.sleep(2000);

		driver.close();
	}

}
