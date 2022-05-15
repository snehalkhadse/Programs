package seleniumsessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowseWindowHandleList {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver  driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		
		Set<String> handles=driver.getWindowHandles();
		
		List<String>handlelist=new ArrayList<String>(handles);
		
		for(String e:handlelist)
		{
			System.out.println(e);
		}
		
		String parentwindowId=handlelist.get(0);
		String childtwindowId=handlelist.get(1);
		
		driver.switchTo().window(childtwindowId);
		System.out.println(driver.getTitle());
		driver.close();
		
		
		driver.switchTo().window(parentwindowId);
		System.out.println(driver.getTitle());
		driver.quit();
		
	}
	
	

}
