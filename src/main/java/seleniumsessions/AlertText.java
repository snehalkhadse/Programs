package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertText {

	public static WebDriver driver;
	public static void main(String[] args) {
	
		String url="http://mail.rediff.com";
		
		//By goBtn = By.name("proceed");
		driver=Util.launchBrowser(driver,"chrome");
		Util.launchUrl(driver,url);
		
		/*Util.doClick(driver,goBtn);
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
		
		Util.closeBrowser(driver);*/

	}

}
