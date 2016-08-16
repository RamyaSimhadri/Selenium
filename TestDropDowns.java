package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDropDowns {

	public static void main(String[] args) {
		// Intialize the firefox driver
		WebDriver driver = new FirefoxDriver();

		// Open wikipedia page
		driver.get("https://www.Wikipedia.org");
		// WebElement element= driver.findElement
		// (By.xpath("/html/body/div[2]/form/fieldset/div/input"));
		// element.sendKeys("Eesti");

		// Maximize the window
		driver.manage().window().maximize();

		// selecting the dropdown list by "select by visible text"
		Select select = new Select(driver.findElement(By.id("searchLanguage")));
		select.selectByVisibleText("Eesti");

		// Getting the size of all the options provided in the list
		List<WebElement> options = select.getOptions();
		System.out.println(options.size());

		for (int i = 0; i < options.size(); i++) {
			System.out.println(options.get(i).getText());// Getting the names of
															// the all the
															// options
		}
	}

}
