package myTestPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestDynamicXpath {

	public static void main(String args[]) {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://yahoo.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement element = driver.findElement(
				By.xpath("/html/body/div[2]/div/div/div/div/div/div/div[2]/div/form/table/tbody/tr/td[1]/input[1]"));
		element.sendKeys("selenium");

	}

}
