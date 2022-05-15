package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickWhenReadyConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		By register=By.linkText("Register");
		
		clickElementWhenReady(register,5);
		
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		//wait.until(ExpectedConditions.elementToBeClickable(register)).click();
	}
	public static void clickElementWhenReady(By locator,int timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
	}
	
	public static void clickElementWhenReady(By locator,int timeout,long intervaltime)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5),Duration.ofMillis(intervaltime));
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
	}
	
}
