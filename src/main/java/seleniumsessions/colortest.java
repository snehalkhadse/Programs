package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class colortest {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		driver.findElement(By.id("email")).sendKeys("n@gmail.com@com");
		
		driver.findElement(By.id("email")).sendKeys(Keys.TAB);
		
		System.out.println(driver.findElement(By.cssSelector("div.form-group form-error")).isDisplayed());
		
		
		
		
	}

}
