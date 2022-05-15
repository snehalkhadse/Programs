package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;
public class MoveToElement 
{
	public static void main(String[] args) throws InterruptedException
	{
		//menu-subMenu
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://mrbool.com/");//enter url";
		
		WebElement parentMenu=driver.findElement(By.className("menulink"));
		By parentMenuLocator=By.className("menulink");
		By subMenuCourses=By.linkText("COURSES");
		
		
		/*Actions action=new Actions(driver);
		
		action.moveToElement(parentMenu).build().perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("COURSES")).click();*/
		
		//clickOnSubMenuLink(driver,parentMenu,"COURSES");
		//clickOnSubMenuLink(driver,parentMenu,subMenuCourses);
		clickOnSubMenuLink(driver,parentMenuLocator,subMenuCourses);
	}
	
	public static void clickOnSubMenuLink(WebDriver driver,WebElement parentMenuElement,String subMenuName) throws InterruptedException
	{
		Actions action=new Actions(driver);
		
		action.moveToElement(parentMenuElement).build().perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.className("menulink"));
		
		WebElement subMenuElement=driver.findElement(By.linkText("COURSES"));
		
		subMenuElement.click();
		
	}
	
	public static void clickOnSubMenuLink(WebDriver driver,WebElement parentMenuElement,By submenuLocator) throws InterruptedException
	{
		Actions action=new Actions(driver);
		
		action.moveToElement(parentMenuElement).build().perform();
		
		Thread.sleep(3000);
		
		WebElement subMenuElement=driver.findElement(submenuLocator);
		
		subMenuElement.click();
		
	}
	
	public static void clickOnSubMenuLink(WebDriver driver,By parentMenuLocator,By submenuLocator) throws InterruptedException
	{
		Actions action=new Actions(driver);
		
		WebElement parentMenuElement=driver.findElement(parentMenuLocator);
		
		action.moveToElement(parentMenuElement).build().perform();
		
		Thread.sleep(3000);
		
		WebElement subMenuElement=driver.findElement(submenuLocator);
		
		subMenuElement.click();
		
	}
	
	
}
