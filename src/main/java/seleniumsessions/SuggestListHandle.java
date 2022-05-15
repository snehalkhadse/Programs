package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuggestListHandle {
	 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		  driver=new ChromeDriver();
		
		//driver.get("http://automationpractice.com/index.php");
		driver.get("https://www.google.com/");
		 
		
		//driver.findElement(By.id("search_query_top")).sendKeys("DRESSES");
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("s b patil school");
		
		//driver.findElement(By.xpath("//div[@class='ac_results']//li[contains(text(),'Casual Dresses > Printed ')]")).click();
		
		//selectOptionFromSuggestList("Casual Dresses > Printed");

	}
	
	/*public static void selectOptionFromSuggestList(String value)
	{
		driver.findElement(By.xpath("//div[@class='ac_results']//li[contains(text(),'Casual Dresses > Printed ')]")).click();
	}*/

}
