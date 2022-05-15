package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.*;
public class RelativeLocators {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.aqi.in/dashboard/canada");
		
		WebElement ele=driver.findElement(By.linkText("Burlington, Canada"));
		
		String aqname=driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(aqname);
		
		String rank=driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(rank);
		
		String belowcity=driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(belowcity);
		
		//String citycolname=driver.findElement(with(By.tagName("p")).above(ele)).getText();
		//System.out.println(rank);
		
	}

}
