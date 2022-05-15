package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitforJsAlert {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		
		//Alert alert=driver.switchTo().alert();//no such alert present exception
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		
		Alert alert=wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(alert.getText());
		alert.accept();
	}
	public static Alert waitForAlert(int timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		return wait.until(ExpectedConditions.alertIsPresent());
	}
	

	public static String getAlertText(int timeout)
	{
		return waitForAlert(timeout).getText();
	}
	
	public static void doAlertAccept(int timeout)
	{
		waitForAlert(timeout).accept();
	}
	

	public static void doAlertDismiss(int timeout)
	{
	 waitForAlert(timeout).dismiss();
	}
	
	public static void doAlertDismiss(String text,int timeout)
	{
		 waitForAlert(timeout).sendKeys(text);;
	}
}
