package test;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import pageObjects.HomePage;
import pageObjects.SignUp;


public class DuplicateUserTest {

	public static void main(String[] args) throws InterruptedException 
	{
		
		// Create a new instance of the chrome driver
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
        //Launch Website
		driver.get("https://google-gruyere.appspot.com/152363887280/");
		String Actualtext;
	    HomePage.lnk_SignUp(driver).click();
	    
	    Actualtext = driver.findElement(By.xpath("/html/body/div[2]/h3")).getText();
	    Assert.assertEquals(Actualtext, "Sign up for a new account.");
	    Thread.sleep(3000);
	    
	    //select user name text box and enter a username which alreasy exists, in this case it will be test       
        SignUp.select_UserNameTextbox(driver).click();
	    SignUp.select_UserNameTextbox(driver).sendKeys("test");
	    Thread.sleep(3000);
	    
	    //Enter password
	    SignUp.select_Password(driver).click();
	    SignUp.select_Password(driver).sendKeys("test");
	    Thread.sleep(3000);
	    
	    //Click Create Account
	    SignUp.btn_CreateAccount(driver).click();
	    String ErrorMessage;
	    ErrorMessage = driver.findElement(By.xpath("/html/body/div[2]")).getText();
	    Assert.assertEquals("User already exists.", ErrorMessage);
	    
	    System.out.println("Can not enter Duplicate user - test passed");	    
	    driver.quit();
	}

}
