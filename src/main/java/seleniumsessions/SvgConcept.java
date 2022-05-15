package seleniumsessions;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SvgConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		 driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		
		String svgxpath="//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='states']/*[name()='g']/*[name()='path']";
		List<WebElement>statelist=driver.findElements(By.xpath(svgxpath));
		Actions act=new Actions(driver);
		
		for(WebElement e:statelist)
		{
			act.moveToElement(e).perform();
			String name=e.getAttribute("name");
			System.out.println(name);
			
			if(name.equals("delaware"))
			{
				e.click();
				break;
			}
		}
		
		
	}

}
