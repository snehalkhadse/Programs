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

public class GoogleTestI extends BaseTest{

	@Test(priority=1)
	public void searchTest()
	{
		driver.get("https://www.google.com/");
		boolean flag=driver.findElement(By.name("q")).isDisplayed();
		Assert.assertTrue(flag);
		
	}
	@Test(priority=2)
	public void goSearchBtnTest()
	{
		boolean flag=driver.findElement(By.name("btnK")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void urlTest()
	{
		String url=driver.getCurrentUrl();
		Assert.assertTrue(url.contains("google"));
	}
	
}
