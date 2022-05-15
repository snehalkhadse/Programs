package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWithoutSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganes\\Downloads\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();//launch chrome
		
		driver.get("https://www.facebook.com/login");//
		
		driver.findElement(By.linkText("Sign up for Facebook")).click();
		
		List<WebElement>daylist=driver.findElements(By.xpath("//*[@id=\"day\"]/option"));
		
		System.out.println(daylist.size());
		
		
		for(int i=0;i<daylist.size();i++)
		{
			System.out.println(daylist.get(i).getText());
			String text=daylist.get(i).getText();
			
			if(text.equals("10"))
			{
				daylist.get(i).click();
				break;
			}
		
		}
	}
	
}
