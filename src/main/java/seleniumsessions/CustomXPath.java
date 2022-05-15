package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXPath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login/");
		//xpath:address of element in xpath
		//1.absolute path:html/body/di/dv[5]/div[2]/li/a
		
		//relative path
		//a.properties of element
		//bxpath function
		//custom xpath
		
		//input[@id='username']
		//input[@id='username' and @type]
		//input[@id='username' and @type='email']
		//button[@id='loginBtn' and @data-test-id='password-login-button']
		
		//input[@type='submit' and @value='Login']
		
		//contains
		//input[contains(@id,'test_']
		//input[contains(@id,'username')]
		//input[contains(@id,'username') and @type='email']
		
		//text
		//a[text()='Sign up']
		//i18n-string[text()='Sign up']
		//a//i18n-string[text()='Sign up']
		
		//h2[text()]
		//input[starts-with(@id,'username')]
		//input[ends-with(@id,'email')]
		
		//position
		//input[contains(@class,'form-control ')]  //2 ele
		//(//input[contains(@class,'form-control ')][1])
		//(//input[contains(@class,'form-control ')][2])
		//(//input[contains(@class,'form-control ')][position()=1])
		//(//input[contains(@class,'form-control ')][position()=2])
		
		//parent-child
		//div[@class='private-form__input-wrapper']/input[@id='username']//direct child
		//div[@class='private-form__input-wrapper']//input[@id='username']//indirect child
		
		//div/input--2
		//div//input--3
		
		//div[@class='private-form__input-wrapper']//following::input[@id='password']
		
		//div[@class='private-form__input-wrapper']/following::input[@id='password']
		
		//input[@name='username']/../../..
		//input[@name='username']//parent::div
		//input[@name='username']//parent::div//parent::form
		
		
		//(//input[@type='text'])[last()]
	}

}
