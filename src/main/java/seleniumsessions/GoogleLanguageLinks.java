package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLanguageLinks {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		  driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		/*List<WebElement>langList=driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		System.out.println(langList.size());
		
		for(WebElement e:langList)
		{
			String text=e.getText();
			System.out.println(text);
		}*/
		By langlink=By.xpath("//div[@id='SIvCob']/a");
		//clickOnElement(langlink,"मराठी");
		
		List<String>actuallinkTextlist=getLinkTextList(langlink);
		if(actuallinkTextlist.contains("मराठी"));
		{
			System.out.println("मराठी is present on the page");
			
		}
	}
	
	public static void clickOnElement(By locator,String linktext)
	{
		List<WebElement>langList=driver.findElements(locator);
		System.out.println(langList.size());
		
		for(WebElement e:langList)
		{
			String text=e.getText().trim();
			System.out.println(text);
			
			if(text.equals(linktext))
			{
				e.click();
				break;
			}
		}
	}
	
	public static List<String> getLinkTextList(By locator)
	{
		List<WebElement>linkList=driver.findElements(locator);
		List<String>linkTextList=new ArrayList<String>();
		System.out.println(linkList.size());
		
		for(WebElement e:linkList)
		{
			String text=e.getText().trim();
			linkTextList.add(text);
		}
		return linkTextList;
	}

}
