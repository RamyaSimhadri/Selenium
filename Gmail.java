package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class Gmail {

	public static void main(String[] args) {

		// initialize Chrome driver
		
		WebDriver driver = new FirefoxDriver();

		// Open gmail
		driver.get("http://www.gmail.com");

		// Enter userid
		WebElement element = driver.findElement(By.id("Email"));
		element.sendKeys("xyz@gmail.com");

		// wait 5 secs for userid to be entered
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Enter Password
		WebElement element1 = driver.findElement(By.id("Passwd"));
		element1.sendKeys("Password");

		// Submit button
		element.submit();

		// press signout button
		driver.findElement(By.id("gb_71")).click();

	}

}
