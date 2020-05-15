package DefaultPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	
//
//	@BeforeTest
//	public void DriverConfiguration()
//	{
//	} 
//	
//	@BeforeMethod
//	public void DeleteCookies()
//	{
//	}

	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver", "C:/EclipseWorkspace/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();

		driver.get("https://www.flipkart.com/");
		
	//	System.out.println("This is Login.java - Login Method");
	}
}
