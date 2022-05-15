package Mytest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCartTest extends BaseTest{

	
	
	@Test
	public void registerLinkTest()
	{
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		boolean flag=driver.findElement(By.linkText("Register")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	
	@Test
	public void urlTest()
	{
		String url=driver.getCurrentUrl();
		Assert.assertTrue(url.contains("account/login"));
	}
	


}
