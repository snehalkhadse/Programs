package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopUP {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");//enter url";
		driver.findElement(By.name("upfile")).sendKeys("C:/Users/ganes/OneDrive/Documents/8100-0440.PNG");
		
	}

}
