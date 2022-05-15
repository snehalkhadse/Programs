package seleniumsessions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForElementConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		By username=By.name("username");
		By password=By.name("password");
		By loginBtn=By.xpath("//input[@type='submit']");
		
		//WebElement username_ele=wait.until(ExpectedConditions.presenceOfElementLocated(username));
		//username_ele.sendKeys("naveen");
		//doSendKeys(username,"naveen",10);
		//doPresenceofElementLocated(username,10,2000);
		//driver.findElement(password).sendKeys("test@1213");
		//driver.findElement(loginBtn).click();
		
		By footers=By.xpath("//footer//ul[@class='footer-nav']//a");
		List<WebElement>footerlist=waitForElementToBeVisible(footers,5);
		for(WebElement e:footerlist)
		{
			System.out.println(e.getText());
			
		}
		if(getElmentTextListWithWait(footers,5).contains("partners"));
		{
			System.out.println("pass");
			
		}
				
				
	}
	public static void doSendKeys(By locator,String value,int timeout)
	{
		doPresenceOfElementLocated(locator,timeout).sendKeys(value);
	}
	
	public static WebElement doPresenceOfElementLocated(By locator,int timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static WebElement doPresenceofElementLocated(By locator,int timeout,long intervaltime)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout),Duration.ofMillis(intervaltime));
		
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static WebElement isElementVisible(By locator,int timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		
		return  wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
	public static WebElement waitForElementsToBeVisible(By locator,int timeout,long intervaltime)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout),Duration.ofMillis(intervaltime));
		
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public static List<WebElement> waitForElementToBeVisible(By locator,int timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
	public static List<WebElement> waitForElementToBeVisible(By locator,int timeout,long intervaltime)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout),Duration.ofMillis(intervaltime));
		
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
	public static List<String> getElmentTextListWithWait(By locator,int timeout)
	{
		List<WebElement>elelist=waitForElementToBeVisible(locator,timeout);
		List<String>eletextlist=new ArrayList<String>();
		for(WebElement e:elelist)
		{
			String text=e.getText();
			eletextlist.add(text);
		}
		return eletextlist;
	}
}