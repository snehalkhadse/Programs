package seleniumsessions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		By emailid=By.id("input-email");
		//WebDriverWait(c)--->FluentWait(c)-->Wait(I)  until())
		//emailele.sendKeys("naveen@gmail.com");
		 waitForElementPresentUsingFluentWait(emailid,10,2).sendKeys("naveen@gmail.com");
	}
	public static WebElement waitForElementPresentUsingFluentWait(By locator,int timeout,int pollingtime) {
		Wait<WebDriver>wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(StaleElementReferenceException.class)
				.ignoring(NoSuchElementException.class).withMessage("element is not found");
		
		
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	public static WebElement waitForElementUsingWebDrivertWait(By locator,int timeout,int pollingtime) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
			wait	.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(StaleElementReferenceException.class)
				.ignoring(NoSuchElementException.class).withMessage("element is not found");
		
		//WebElement emailele=wait.until(ExpectedConditions.presenceOfElementLocated(emailid));
		
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
}
