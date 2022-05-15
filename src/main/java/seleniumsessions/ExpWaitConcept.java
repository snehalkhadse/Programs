package seleniumsessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExpWaitConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https:\\app.hubSpot.com");
		
		//exp wait for non web element
		//WebDriverWait wait=new WebDriverWait(driver,15);
		//wait.until(ExpectedConditions.titleContains("HubSpot Login"));
		
		//System.out.println(driver.getTitle());
		
		//for webelement
		
		///By email=By.id("username");
		//wait.until(ExpectedConditions.presenceOfElementLocated(email));
		//driver.findElement(email).sendKeys("test@gmail.com");
		
		
		By email=By.id("username");
		By pwd=By.id("password");
		getElement(driver,email,10).sendKeys("naveenanimation20@gmail.com");
		getElement(driver,pwd,1).sendKeys("Test@12345");
		
		By loginBtn=By.id("loginBtn");
		By header=By.className("signup-link");
		getElement(driver,loginBtn,1).click();
		
		
		String text=getElement(driver,header,Util.DEFAULT_EXP_WAIT).getText();
		
		System.out.println(text);
		
		String title=getPageTitle(driver,10,"HubSpot Login");
		System.out.println("page title:"+title);
	}
	
	public static WebElement getElement(WebDriver driver,By locator,int timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		WebElement element=driver.findElement(locator);
		
		return element;
	}

	public static void waitForPresenceOfElement(WebDriver driver,By locator,int timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver,timeout);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static String getPageTitle(WebDriver driver,int timeout,String title)
	{

		WebDriverWait wait=new WebDriverWait(driver,timeout);
		
		wait.until(ExpectedConditions.titleContains(title));
		
		return driver.getTitle();
	}
}
