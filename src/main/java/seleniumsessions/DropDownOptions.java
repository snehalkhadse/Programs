package seleniumsessions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownOptions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganes\\Downloads\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();//launch chrome
		
		driver.get("http:\\www.facebook.com/login");//enter url
		driver.findElement(By.linkText("Sign up for Facebook")).click();
		
		
		//WebElement day=driver.findElement(By.id("day"));
		//WebElement month=driver.findElement(By.id("month"));
		//WebElement year=driver.findElement(By.id("year"));
		
		
		//Select select1=new Select(day);
		
		/*List<WebElement>dayoptions=select1.getOptions();
		System.out.println(dayoptions.size());
		
		for(int i=0;i<dayoptions.size();i++)
		{
			String text=dayoptions.get(i).getText();
			System.out.println(text);
			
		}*/

		
		/*Select select2=new Select(month);
		
		List<WebElement>monthoptions=select2.getOptions();
		System.out.println(monthoptions.size());
		
		for(int i=0;i<monthoptions.size();i++)
		{
			String text=monthoptions.get(i).getText();
			System.out.println(text);
			
		}
		
		Select select3=new Select(day);
		
		List<WebElement>yearoptions=select3.getOptions();
		System.out.println(yearoptions.size());
		
		for(int i=0;i<yearoptions.size();i++)
		{
			String text=yearoptions.get(i).getText();
			System.out.println(text);
			
		}*/
		
		By day=By.id("day");
		By month=By.id("month");
		By year=By.id("year");
		
		ArrayList<String>dayoptions=getAllOptions(driver,day);
		System.out.println("total no of  days are:"+dayoptions.size());
		
		if(dayoptions.size()==32)
		{
			System.out.println("total no of days are correct");
		}
		else {
			System.out.println("total no of days are  not correct");
		}
		//print
		for(int i=0;i<dayoptions.size();i++)
		{
			
			System.out.println(dayoptions.get(i));
			
		}
		// getAllOptions(driver,day);
		 getAllOptions(driver,month);
		 getAllOptions(driver,year);
			
		
	}
	
	public static ArrayList<String> getAllOptions(WebDriver driver,By locator)
	{
		ArrayList<String> optionlist=new ArrayList<String>();
		WebElement ele=getElement(driver,locator);
		
		Select select=new Select(ele);
		List<WebElement>dropDownoptions=select.getOptions();
		//System.out.println(dropDownoptions.size());
		
		
		for(int i=0;i<dropDownoptions.size();i++)
		{
			String text=dropDownoptions.get(i).getText();
			//System.out.println(text);
			optionlist.add(text);
		}
		return optionlist;
	}
	
	public static  WebElement getElement(WebDriver driver,By locator)
	{
		WebElement element=driver.findElement(locator);
		return element;
		
	}
}
