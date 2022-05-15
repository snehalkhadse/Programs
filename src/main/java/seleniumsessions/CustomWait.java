package seleniumsessions;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomWait {
	static WebDriver driver;
	public static void main(String[] args) {
		
			WebDriverManager.chromedriver().setup();
			
			driver=new ChromeDriver();
			driver.get("https://demo.opencart.com/index.php?route=account/login");
			By emailid=By.id("input-email");
			RetryingElement(emailid,10).sendKeys("naveen@gmail.com");
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	public static WebElement RetryingElement(By locator,int timeout)
	{
		WebElement element=null;
		int attempts=0;
		while(attempts<timeout)
		{
			try
			{
				element=getElement(locator);
				break;
			}
			catch(NoSuchElementException e) {
				System.out.println("element is not foundin attempt:"+attempts+":"+locator);
				try {
					Thread.sleep(500);
				}catch(InterruptedException e1) {
					e1.printStackTrace();
				}
			}
			attempts++;
		}
		if(element==null)
		{
			try {
				throw new Exception("ELEMENT NOT FOUND EXCEPTION");
			}catch(Exception e)
			{
				System.out.println("element not found exceptin...tried for:"+timeout+"with interval of:"+500+"ms");
			}
		}
		return element;
	}
}
