package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForPageLoad {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		
		 driver=new ChromeDriver();
		driver.get("https://api.cogmento.com/register/");
		driver.findElement(By.partialLinkText("Log in here"));
		JavaScriptUtil js =new JavaScriptUtil(driver);
		js.waitForPageLoaded();
		driver.findElement(By.name("email")).sendKeys("testing");
	}

	public void waitForPageLoaded()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String loadingstatus=js.executeScript("return document.readystate;").toString();
		if(loadingstatus.equals("complete"))
		{
			System.out.println("page is fully loaded");
		}
		else
		{
			for(int i=1;i<=20;i++) {
				try{
					Thread.sleep(1000);
				}
				catch(InterruptedException e){
					e.printStackTrace();
				}
				loadingstatus=js.executeScript("return document.readyState").toString();
				System.out.println("current page loading status:"+loadingstatus);
				if(loadingstatus.equals("complete"))
				{
					break;
				}
			}
		}
	}
}

