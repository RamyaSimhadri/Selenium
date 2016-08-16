package Selenium;

import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyApplicationTitle {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		// Opens the url
		driver.get("http://learn-automation.com/");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// Actual title
		String my_title = driver.getTitle();
		System.out.println("title is:" + my_title);
		String expected_title = "Selenium Webdriver Tutorials-Free Selenium Tutorials";
		/*
		 * Assert.assertEquals() methods checks that the two objects are equals
		 * or not
		 */
		Assert.assertEquals(my_title, expected_title);
		System.out.println("Test Completed");

	}

}
