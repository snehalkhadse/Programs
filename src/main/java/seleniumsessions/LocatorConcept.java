package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ganes\\Downloads\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.hubspot.com");
		
		Thread.sleep(5000);
		
		//HtML Dom//  1.id
		
		//WebElement userElement=driver.findElement(By.id("username"));
		//userElement.sendKeys("naveen@gmail.com");
		
		//WebElement passwordElement=driver.findElement(By.id("password"));
		//passwordElement.sendKeys("test@123.com");
		
		//WebElement logibButton=driver.findElement(By.id("loginBtn"));
		//logibButton.sendKeys("naveen@gmail.com");
		
		
		//driver.findElement(By.id("username")).sendKeys("naveen@gmail.com");
		
		//id 1
		//By username=By.id("username");
		//Util.getElement(driver,username).sendKeys("test@gmail.com");
		
		//By password=By.id("password");
		//Util.getElement(driver,password).sendKeys("test@123");
		
		//By loginButton=By.id("loginBtn");
		//Util.getElement(driver,loginButton).click();
		
		//name 2
		
		//driver.findElement(By.name("username")).sendKeys("testautomation");
		
		//WebElement element=driver.findElement(By.name("username"));
		//element.sendKeys("testautomation");
		
		//By username=By.name("username");
		//Util.getElement(driver,username).sendKeys("testautomation");
		//By passwordElement=By.id("username");
		//WebElement passwordElemen=driver.findElement(passwordElemen);
		//passwordElemen.sendKeys("test@gmail.com");
		
		//By loginButton=By.id("loginBtn");
		//WebElement loginButton=driver.findElement(loginButton);
		//loginButton.sendKeys("naveen@gmail.com");
		
		
		//x-path
		//driver.findElement(By.xpath("//*[@id='username'])"));
		
		//WebElement element=driver.findElement(By.xpath("//*[@id='username'])"));
		
		//element.sendKeys("test@gmail.com");
		
		//By username=By.xpath("//*[@id='username']");
		//Util.getElement(driver,username).sendKeys("test@gmail.com");

		//css selector
		
		//By username=By.cssSelector("#username");
		//Util.getElement(driver,username).sendKeys("test@gmail.com");
	
		//class name
		//form-control private-form__control login-password m-bottom-3
		//form-control private-form__control login-email
		//By username=By.className("login-email");
		//Util.getElement(driver,username).sendKeys("test@gmail.com");
	
		//By password=By.className("login-password");
		//Util.getElement(driver,password).sendKeys("test@gmail.com");
		
		//6link text
		//By signUpLink=By.linkText("Sign up");
		//Util.getElement(driver,signUpLink).click();
		
		//7.partial link text
		
		By signUpLink=By.partialLinkText("Sign");
		Util.getElement(driver,signUpLink).click();
	
	}

}
