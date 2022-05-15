package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	public static WebDriver driver;
	
	static By email=By.id("username");
	static By password=By.xpath("//*[@id='username'])");
	static By loginButton=By.cssSelector("#loginBtn");
	static By signUpLink=By.linkText("Sign up");
	
	
	public static void main(String[] args) 
	{
		
	driver=Util.launchBrowser(driver,"chrome");
	
	Util.launchUrl(driver,"https://app.hubspot.com");
	
	System.out.println(Util.getPageTitle(driver));
	
	Util.getElement(driver,email).sendKeys("test@gmail.com");
	
	Util.getElement(driver,password).sendKeys("test@123.com");
	
	Util.getElement(driver,loginButton).click();
	
	Util.getElement(driver,signUpLink).click();

	}
}
