package myTestPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDropDownsAndLinks {

	public static void main(String[] args) {
		// Intialize the firefox driver
		WebDriver driver = new FirefoxDriver();

		// Open wikipedia page
		driver.get("https://www.Wikipedia.org");

		// Maximize the window
		driver.manage().window().maximize();

		// selecting the dropdown list
		Select select = new Select(driver.findElement(By.id("searchLanguage")));
		select.selectByVisibleText("Eesti");

		System.out.println("-------------Printing all the dropdown values-------");

		List<WebElement> options = driver.findElements(By.tagName("option"));
		System.out.println(options.size());

		for (int i = 0; i < options.size(); i++) {
			System.out.println(options.get(i).getText());
		}
		System.out.println("-------------Printing all the links-------");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());

		for (int i = 0; i < links.size(); i++) {
			System.out.println(links.get(i).getAttribute("href"));
		}

		System.out.println("total links:" + links.size());

	}
}
