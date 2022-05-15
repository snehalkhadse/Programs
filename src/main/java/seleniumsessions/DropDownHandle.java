package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganes\\Downloads\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();//launch chrome
		
		driver.get("https://www.facebook.com/login");//
		
		driver.findElement(By.linkText("Sign up for Facebook")).click();
		
		
		//WebElement dayElement=driver.findElement(By.id("day"));
		//WebElement month=driver.findElement(By.id("month"));
		//WebElement year=driver.findElement(By.id("year"));
		
		
		//Select select1=new Select(dayElement);
		//select1.selectByIndex(4);
		
		//select1.selectByVisibleText("10");
		
		//Select select2=new Select(month);
		//select2.selectByVisibleText("May");
		
		//Select select3=new Select(year);
		//select3.selectByVisibleText("1990");
		
		//SelectDropDownValueByVisibleIndex(driver,month,8);
		By day=By.id("day");
		By month=By.id("month");
		By year=By.id("year");
		
		SelectDropDownValueByVisibleText(driver,day,"10");
		SelectDropDownValueByVisibleText(driver,month,"May");
		
		SelectDropDownValueByVisibleText(driver,year,"1990");
		SelectDropDownValueByVisibleIndex(driver,month,8);
	}
	/*
	 * this is used to select values from drop down on the basis of visible text
	 * @param element,value
	 */
	public static void SelectDropDownValueByVisibleText(WebDriver driver,By locator,String value)
	{
		WebElement  delement=getElement(driver,locator);
		
		Select select=new Select(delement);
		select.selectByVisibleText(value);
	}
	
	/*used to create webelement on the basis of by locator
	 * @param element,value
	 */
	public static  WebElement getElement(WebDriver driver,By locator)
	{
		WebElement element=driver.findElement(locator);
		return element;
		
	}
	public static void SelectDropDownValueByVisibleIndex(WebDriver driver,By locator,int index)
	{
		WebElement  element=getElement(driver,locator);
		
		Select select=new Select(element);
		select.selectByIndex(index);
	}

}
