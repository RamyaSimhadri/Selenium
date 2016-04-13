package myTestPack;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandleExample {

	public static void main(String[] args) {
		// intialize the firefox driver
		WebDriver driver = new FirefoxDriver();
		// Open google
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// gets the window handle of the main window
		String strmainwindowhnd = driver.getWindowHandle();// return a string of
															// alphanumeric
															// window handle
		System.out.println("window title" + driver.getTitle());
		driver.findElement(By.linkText("Privacy")).click();
		// To get the window handle of all the current windows.
		Set<String> strhandles = driver.getWindowHandles();// Return a set of
															// window handle
		for (String handle : strhandles) {

			driver.switchTo().window(handle);// WebDriver supports moving
												// between named windows using
												// the “switchTo” method.
			String strTitle = driver.getTitle();
			if (strTitle.equalsIgnoreCase("privacy"))
				;
			{

				System.out.println(driver.getTitle());
				driver.findElement(By.linkText("My Account")).click();
				driver.close();
				driver.switchTo().window(strmainwindowhnd);
				System.out.println(driver.getTitle());
				driver.close();
			}
		}

	}
}
