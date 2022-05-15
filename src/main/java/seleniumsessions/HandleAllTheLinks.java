package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAllTheLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganes\\Downloads\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();//launch chrome
		
		driver.get("https://www.google.com");
		
		List<WebElement>linksList=driver.findElements(By.tagName("a"));
		
		System.out.println("total links:"+linksList.size());
		
		for(int i=0;i<linksList.size();i++)
		{
			String text=linksList.get(i).getText();
			System.out.println(text);
			if(!text.isEmpty())
			{
				linksList.get(i).click();
				driver.navigate().back();
			}
			
			linksList=driver.findElements(By.tagName("a"));
			
	}
	
	


}
}



