package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	private static WebElement element = null;

	public static WebElement lnk_SignUp(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id='menu-right']/a[2]"));

		return element;

	}

	public static WebElement lnk_NewSnippet(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id='menu-left']/a[3]"));

		return element;

	}

	public static WebElement lnk_SignIn(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id='menu-right']/a[1]"));

		return element;

	}
}
