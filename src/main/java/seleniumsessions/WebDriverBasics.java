package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganes\\Downloads\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();//launch chrome
		
		driver.get("http:\\www.Google.com");//enter url
		
		String title=driver.getTitle();//get title
		System.out.println(title);
		
		//validation  point
		if(title.equals("Google"))
		{
			System.out.println("correct title");
		}
		else
		{
			System.out.println("in correct title");
		}
		
		//driver.quit();
		//driver.close();
		
		//String t1=driver.getTitle();
		//System.out.println(t1);
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
	
	}

}
