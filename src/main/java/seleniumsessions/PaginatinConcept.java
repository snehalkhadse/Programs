package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PaginatinConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		 driver=new ChromeDriver();
		
		driver.get("https://babynames.merschat.com/popular.cgi");
		
		List<WebElement>nameList=driver.findElements(By.xpath("//a[contains(text(), 'Elika')]"));
		
		while(true)
		{
			if(!(nameList.size()==1))
					{
			driver.findElement(By.linkText("Next")).click();
			nameList=driver.findElements(By.xpath("//a[contains(text(), 'Elika')]"));
			}
			else {
				String title=driver.findElement(By.xpath("(//a[contains(text(), 'Elika')]/../parent::td//following-sibling::td)[2]//a")).getAttribute("title");
				System.out.println(title);
				break;
			}
		}
	}
}


