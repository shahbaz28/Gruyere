package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn {
	private static WebElement element = null;
		 
	 public static WebElement userNameTextbox(WebDriver driver)
	 {
	 
	    element = driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[1]/td[2]/input"));
	 
	    return element;	 
	 }
	 
	 public static WebElement passwordTextbox(WebDriver driver)
	 {
		 
		    element = driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[2]/td[2]/input"));
		 
		    return element;	 
		 }
	 
	 public static WebElement loginButton(WebDriver driver)
	 {
		 
		    element = driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[3]/td[2]/input"));
		 
		    return element;	 
		 }
	 
	 
}
