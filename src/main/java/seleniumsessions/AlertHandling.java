package seleniumsessions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
	
	static WebDriver driver;
	public static void main(String[] args) {
		//java script  alert
		WebDriverManager.chromedriver().setup();

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganes\\Downloads\\chromedriver.exe");
		
		driver=new ChromeDriver();//launch chrome
		
		driver.get("http:\\mail.rediff.com/cgi-bin/login.cgi");//enter url
		
		driver.findElement(By.name("proceed")).click();
		
		//Thread.sleep(4000);
		
		String text=Util.getAlertText(driver);
		if(text.equals("please enter valid user name"))
		{
			System.out.println("correct mesg");
		}
		else
		{
			System.out.println("Incorrect mesg");
		}
		
		
		//Alert alert=driver.switchTo().alert();
		
		
		//String text=alert.getText();
		//System.out.println(text);
		
		//validation
		/*if(text.equals("please enter valid user name"))
		{
			System.out.println("correct mesg");
		}
		else
		{
			System.out.println("incorrect mesg");
		}
		
		alert.accept();
		//alert.dismiss();*/
		
		
		
		
		
	}
	public static String getAlertText()
	{
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		System.out.println(text);
		alert.accept();
		
		return text;
	}

}
