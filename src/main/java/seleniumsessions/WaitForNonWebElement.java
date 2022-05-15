package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForNonWebElement {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.linkText("Contact us")).click();
		//Thread.sleep(5000);
		//wait for url
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		
		//wait.until(ExpectedConditions.urlContains("controller=contact"));
		
		if(waitForUrlContain("controller=contact",5))
		{
			System.out.println("url is correct");
		}
		//Thread.sleep(5000);
		//wait for url
		String title=doGetTitle("Contact us",5);
		System.out.println(title);
		
	}
	public static boolean waitForUrlContain(String urlFraction,int timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		
		return wait.until(ExpectedConditions.urlContains(urlFraction));
	}
	public static boolean waitForUrlToBe(String url,int timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		
		return wait.until(ExpectedConditions.urlContains(url));
	}
	
	public static boolean waitForTitleContains(String titleFraction,int timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		
		return wait.until(ExpectedConditions.urlContains(titleFraction));
	}
	
	public static boolean waitForTitleToBe(String title,int timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		
		return wait.until(ExpectedConditions.urlContains(title));
	}
	
	public static String doGetTitle(String title,int timeout)
	{
		if(waitForTitleToBe(title,timeout))
		{
			return driver.getTitle();
		}
		return null;
	}
	
	public static String doGetTitleWithFraction(String titleFraction,int timeout)
	{
		if(waitForTitleContains(titleFraction,timeout))
		{
			return driver.getTitle();
		}
		return null;
	}
	
	
	
	
	
}
