package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleBrosers {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver  driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		String parentwindowId=driver.getWindowHandle();
		//WebDriver  driver1=new ChromeDriver();
		//driver1.get("https://www.amazon.com/");
		//driver.close();
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.amazon.com/");
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentwindowId);
	
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
