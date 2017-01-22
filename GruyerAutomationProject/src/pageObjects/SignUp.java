package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUp {

	private static WebElement element = null;
	
	 
	 public static WebElement select_UserNameTextbox(WebDriver driver)
	 {
	 
	    element = driver.findElement(By.xpath("/html/body/div[2]/form/table/tbody/tr[1]/td[2]/input"));
	 
	    return element;	 

	 }
	 
	 public static WebElement select_Password(WebDriver driver)
	 {
		 element = driver.findElement(By.xpath("/html/body/div[2]/form/table/tbody/tr[2]/td[2]/input"));
		 return element;
	 }
	 
	 public static WebElement btn_CreateAccount(WebDriver driver)
	 {
		 element = driver.findElement(By.xpath("/html/body/div[2]/form/table/tbody/tr[3]/td[2]/input"));
		 return element;
	 }

}
