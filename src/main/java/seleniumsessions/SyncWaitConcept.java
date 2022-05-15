package seleniumsessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SyncWaitConcept 
{

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https:\\app.hubSpot.com");
		//Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("username")).sendKeys("test@gmail.com");
		
	}
	

}
