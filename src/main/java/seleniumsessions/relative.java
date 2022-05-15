package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class relative {
	static WebDriver driver ;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		  driver=new ChromeDriver();
		
		driver.get("https://whenwise.com/sign-in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("email")).sendKeys("naveenanimation20@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("Test@12345");
		
		driver.findElement(By.id("login-btn")).click();
		
		driver.navigate().to("https://whenwise.com/users/2835/edit");
		
		WebElement ele=driver.findElement(By.xpath("//span[text()='Email on booking confirmation?']"));
		
		driver.findElement(with(By.className("lever")).toRightOf(ele)).click();
		
		//WebElement text=driver.findElement(By.xpath("//span[text()='Accept SMS appointment reminder?']"));
		

		//driver.findElement(with(By.className("switch")).toRightOf(text)).click();
		WebElement text1 =driver.findElement(By.xpath("//span[text()='Accept SMS appointment reminder?']"));
	
		acceptAppointmentReminder(String.valueOf(text1));
		
		
	
	}
	public  static void acceptAppointmentReminder(String text)
	{
		//driver.findElement(text);

		driver.findElement(with(By.className("switch")).toRightOf(By.id(text))).click();
	}

}
