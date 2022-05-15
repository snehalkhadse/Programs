package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");//enter url";
		
		/*Actions action=new Actions(driver);
		
		WebElement rightclickme=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		action.contextClick(rightclickme).build().perform();
		
		Thread.sleep(3000);
		
		List<WebElement>rightclicklist=driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li[contains(@class,'context-menu-item context-menu-icon')]/span"));
		
		System.out.println(rightclicklist.size());
		
		for(int i=0;i<rightclicklist.size();i++)
		{
			System.out.println(rightclicklist.get(i).getText());
			
		}*/
		
		By rightClickLocator=By.xpath("//span[text()='right click me']");
		By rightClickListLocator=By.xpath("//ul[@class='context-menu-list context-menu-root']/li[contains(@class,'context-menu-item context-menu-icon')]/span");
		int listcount=getRightClickOptionsCount(driver,rightClickLocator,rightClickListLocator);
		
		System.out.println(listcount);
		
		ArrayList<String>rightclicklist= getRightClickOptionsList(driver,rightClickLocator,rightClickListLocator);
		System.out.println(rightclicklist);
		
	}	
	
	
	public static int getRightClickOptionsCount(WebDriver driver,By rightClickLocator,By rightClickListLocator ) throws InterruptedException
	{
		WebElement rightClickelement=driver.findElement(rightClickLocator);
		
		Actions action=new Actions(driver);
		action.contextClick(rightClickelement).build().perform();
		Thread.sleep(3000);;
		
		List<WebElement>rightclicklist=driver.findElements(rightClickListLocator);
		
		return rightclicklist.size();
		
	}
	public static ArrayList<String> getRightClickOptionsList(WebDriver driver,By rightClickLocator,By rightClickListLocator ) throws InterruptedException
	{
		WebElement rightClickelement=driver.findElement(rightClickLocator);
		Actions action=new Actions(driver);
		action.contextClick(rightClickelement).build().perform();
		Thread.sleep(3000);
		
		ArrayList<String>rightClickOptionsList=new ArrayList<String>();

		List<WebElement>rightclicklist=driver.findElements(rightClickListLocator);
		for(int i=0;i<rightclicklist.size();i++)
		{
			String optiontext=rightclicklist.get(i).getText();
			
		rightClickOptionsList.add(optiontext);
		}
		return rightClickOptionsList;
		
	}
	
}
