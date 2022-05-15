package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementRightClick {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightclickelenment=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions action=new Actions(driver);
		
		action.contextClick(rightclickelenment).build().perform();
		
		/*WebElement copyelenment=driver.findElement(By.className("context-menu-icon-copy"));
		
		String text=copyelenment.getText();
		System.out.println(text);*/
		List<WebElement>rightclicklist=driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li[contains(@class,'context-menu-item context-menu-icon')]/span"));
		
		System.out.println(rightclicklist.size());
		for(int i=0;i<rightclicklist.size();i++)
		{
			System.out.println(rightclicklist.get(i).getText());
		}
		
	}

}
