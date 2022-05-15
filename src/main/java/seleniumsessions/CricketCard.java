package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricketCard {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.espncricinfo.com/series/karnataka-premier-league-2019-1196253/bellary-tuskers-vs-bijapur-bulls-8th-match-1196265/full-scorecard");
		
		//span[text()='Wiaan Mulder']//parent::span/../../..//following-sibling::td)[2]
	}



public static  void getPlayerScoreCard(WebDriver driver,String playerName)
{
	System.out.println("getting score card:"+playerName+"\n");
	
}
}