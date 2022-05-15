package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementVisibilities {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://classic.crmpro.com/register/");//enter url";
		
		WebElement submitButton=driver.findElement(By.id("submitButton"));
		
		System.out.println("before submitButton is enabled");
		
		System.out.println(submitButton.isDisplayed());
		System.out.println(submitButton.isEnabled());
		
		System.out.println("after submitButton is enabled");
		System.out.println("line27:"+driver.findElement(By.name("agreeTerms")).isSelected());
		
		driver.findElement(By.name("agreeTerms")).click();//sellect check box
		
		System.out.println("line27:"+driver.findElement(By.name("agreeTerms")).isSelected());
		System.out.println(submitButton.isDisplayed());
		System.out.println(submitButton.isEnabled());
		
		
	}

}
