package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthPopUps {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");//enter url";
		
		String username="admin";
		String password="admin";
		
		driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
		
	}

}
