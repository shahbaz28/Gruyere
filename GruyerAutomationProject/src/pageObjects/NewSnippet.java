package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class NewSnippet {
	private static WebElement element = null;
	
	 public static WebElement select_SnippetTextbox(WebDriver driver)
	 {
		 
		    element = driver.findElement(By.xpath("/html/body/div[2]/div/form/textarea"));
		 
		    return element;	 

		}

	 public static WebElement select_Submit(WebDriver driver)
	 {
		 
		    element = driver.findElement(By.xpath("/html/body/div[2]/div/form/table/tbody/tr/td[2]/input"));
		 
		    return element;	 

		}
}
