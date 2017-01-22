package test;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pageObjects.HomePage;
import pageObjects.NewSnippet;
import pageObjects.SignIn;

public class CreateNewSnippet {

	public static void main(String[] args) throws InterruptedException {

		// Create a new instance of the chrome driver
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Launch the Website
		driver.get("https://google-gruyere.appspot.com/152363887280/");
		String Actualtext;
		HomePage.lnk_SignUp(driver).click();

		Actualtext = driver.findElement(By.xpath("/html/body/div[2]/h3")).getText();
		Assert.assertEquals(Actualtext, "Sign up for a new account.");
		Thread.sleep(3000);

		// Sign in
		HomePage.lnk_SignIn(driver).click();
		SignIn.userNameTextbox(driver).sendKeys("test");
		SignIn.passwordTextbox(driver).sendKeys("test");
		SignIn.loginButton(driver).click();

		// Select New Snippet
		HomePage.lnk_NewSnippet(driver).click();

		// Enter New Snippet
		NewSnippet.select_SnippetTextbox(driver).sendKeys("This is a new test Snippet");
		NewSnippet.select_Submit(driver).click();

		// Assert Snippet has been added.
		String snippetText;
		snippetText = driver.findElement(By.xpath("//*[@id='0']")).getText();
		Assert.assertEquals(snippetText, "This is a new test Snippet");

		// Print a successful message
		System.out.println("Successfully added snippet");
		driver.quit();

	}
}
