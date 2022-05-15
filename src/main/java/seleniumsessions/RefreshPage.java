package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganes\\Downloads\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();//launch chrome
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");//
		
		WebElement login=driver.findElement(By.id("login1"));
		
		driver.navigate().refresh();
		
		login=driver.findElement(By.id("login1"));
		
		login.sendKeys("test@gmail.com");
		
	}

}
