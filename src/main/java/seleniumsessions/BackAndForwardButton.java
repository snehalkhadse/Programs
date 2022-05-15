package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackAndForwardButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganes\\Downloads\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();//launch chrome
		
		driver.get("http:\\www.Google.com");//enter url
		
		driver.navigate().to("http://www.amazon.in");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().back();
		
		
	}

}
