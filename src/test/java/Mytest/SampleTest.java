package Mytest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest {
	
	static WebDriver driver;
	@BeforeTest
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	@Test
	public void searchTest()
	{
		boolean flag=driver.findElement(By.name("q")).isDisplayed();
		Assert.assertTrue(flag);
		
	}
	@Test
	public void goSearchBtnTest()
	{
		boolean flag=driver.findElement(By.name("btnK")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test
	public void urlTest()
	{
		String url=driver.getCurrentUrl();
		Assert.assertTrue(url.contains("google"));
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
	
}
