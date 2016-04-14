package myTestPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class ScrollingUpAndDown {
	public void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		// Opens the url
		driver.get("http://www.jqueryui.com/");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		((JavascriptExecutor) driver).executeScript("scroll(0,400)");
		/*
		 * JavaScript executor:an interface which allows us to execute
		 * javascript from selenium webdriver
		 */
	}
}