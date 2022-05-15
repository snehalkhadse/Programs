package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowDomElementHandle {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		 WebDriver driver=new ChromeDriver();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		//driver.findElement(By.id("tea")).sendKeys("masala tea");
		driver.switchTo().frame("pact");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		WebElement teaele=(WebElement)jse.executeScript("return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")");
		
		teaele.sendKeys("masala");
	}			

}
