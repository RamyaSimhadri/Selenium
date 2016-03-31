package myTestPack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultipleWindows {
	public static void main(String[] args) {
		// Intialize firefox driver
		WebDriver driver = new FirefoxDriver();

		// Open the url
		driver.get("http://www.seleniummaster.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Locating element using Xpath
		WebElement element = driver
				.findElement(By.xpath("/html/body/div[2]/div/header/div/a/table/tbody/tr/td[1]/p/img"));
		element.click();

		// Storing parent window reference into a String Variable
		String Parent_Window = driver.getWindowHandle();

		// Switching from parent window to child window
		for (String Child_Window : driver.getWindowHandles()) {
			driver.switchTo().window(Child_Window);
			// Performing actions on child window
			driver.findElement(By.id("dropdown_txt")).click();
			List dropdownitems = driver.findElements(By.xpath("//div[@id='DropDownitems']//div"));
			int dropdownitems_Size = dropdownitems.size();
			System.out.println("Dropdown item size is:" + dropdownitems_Size);
			((WebElement) dropdownitems.get(1)).click();
			driver.findElement(By.xpath("//*[@id='anotherItemDiv']")).click();
		}

		// Switching back to Parent Window
		driver.switchTo().window(Parent_Window);

		// Performing some actions on Parent Window
		driver.findElement(By.className("btn_style")).click();
	}

}
