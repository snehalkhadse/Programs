package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTableHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver  driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		String parentwindowId=driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com/");
		driver.close();
		
		driver.switchTo().window(parentwindowId);
		System.out.println(driver.getTitle());
		
		
	}

}
