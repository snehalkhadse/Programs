package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Util {
	public static final int DEFAULT_EXP_WAIT=15;
	
	/*
	 * this method is used to handle alert it will return alert text
	 * @param driver
	 * @pram text
	 */
	public static String getAlertText(WebDriver driver)
	{
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		System.out.println(text);
		alert.accept();
		
		return text;
	}
	
	/*
	 * get the title of page
	 * @param driver
	 * return title of page
	 */
	public static String getPageTitle(WebDriver driver)
	{
		return driver.getTitle();
	}
	/*
	 * launch url
	 * @param driver
	 * @pram url
	 */
	
	public static void launchUrl(WebDriver driver,String url)
	{
		driver.get(url);
		
	}
	
	
	/*
	 * launch browser
	 * @param driver
	 * @pram browsername
	 */
	
	public static WebDriver launchBrowser(WebDriver driver,String browserName)
	{
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganes\\Downloads\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("WebDriver.chrome.driver" ,"C:\\Users\\ganes\\Downloads\\geckodriver.exe");
			
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("browsername is not correct"+browserName);
		}
		
		return driver;
	}
	
	/*
	 * cliclk on element
	 * @param driver
	 * @pram locator
	 */
	
	public static void doClick(WebDriver driver,By locator)
	{
		driver.findElement(locator).click();
	}
	
	
	
	/*
	 * quit browser
	 
	 */
	
	public static void closeBrowser(WebDriver driver)
	{
		driver.quit();
	}
	
	public static WebElement getElement(WebDriver driver,By locator )
	{
		 WebElement element=driver.findElement(locator);
		 return element;
	}
	
	
	}

