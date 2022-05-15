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

public class OrangeHRMTest extends BaseTest{


	
	@Test
	public void contactSalesTest()
	{
		driver.get("https://www.orangehrm.com/");
		boolean flag=driver.findElement(By.linkText("CONTACT SALES")).isDisplayed();
		Assert.assertTrue(flag);
	}
	@Test
	public void urlTest()
	{
		String url=driver.getCurrentUrl();
		Assert.assertTrue(url.contains("orangehrm"));
	}
}
