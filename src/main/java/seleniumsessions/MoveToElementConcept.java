package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://mrbool.com/");
		
		WebElement parentmenu=driver.findElement(By.className("menulink"));
		//Thread.sleep(3000);
		
		By submenucourses=By.className("menulink");
		By parentmenulocator=By.className("menulink");
		
		clickOnSubMenuLink(driver,parentmenu,"COURSES");
		
		//clickOnSubMenuLink(driver,parentmenu,submenucourses);
		clickOnSubMenuLink(driver,parentmenulocator,submenucourses);
		
		
		//Actions action=new Actions(driver);
		
		//action.moveToElement(parentmenu).build().perform();
		
		//driver.findElement(By.linkText("COURSES")).click();
		
	}	
	
	public static void clickOnSubMenuLink(WebDriver driver,WebElement parentmenuelement,String submenuname) throws InterruptedException
	{
		Actions action=new Actions(driver);
		
		action.moveToElement(parentmenuelement).build().perform();
		Thread.sleep(3000);
		
		WebElement submenuelement=driver.findElement(By.linkText(submenuname));
		
		submenuelement.click();
	}

	public static void clickOnSubMenuLink(WebDriver driver,WebElement parentmenuelement,By submenuLocator) throws InterruptedException
	{
		Actions action=new Actions(driver);
		
		action.moveToElement(parentmenuelement).build().perform();
		Thread.sleep(3000);
		
		WebElement submenuelement=driver.findElement(submenuLocator);
		
		 submenuelement.click();
		
	}
	public static void clickOnSubMenuLink(WebDriver driver,By parentmenuLocator,By submenuLocator) throws InterruptedException
	{
		Actions action=new Actions(driver);
		
		WebElement parentmenuelement=driver.findElement(parentmenuLocator);
		
		action.moveToElement(parentmenuelement).build().perform();
		Thread.sleep(3000);
		
		WebElement submenuelement=driver.findElement(submenuLocator);
		
		submenuelement.click();
		
	}
}
