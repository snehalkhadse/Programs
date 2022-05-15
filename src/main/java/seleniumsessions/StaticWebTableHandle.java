package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticWebTableHandle {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html//html_tables.asp");

		//table[@id='customers']
		//*[@id="customers"]

		//table[@id="customers"]/tbody/tr[2]/td[1]
		//table[@id="customers"]/tbody/tr[3]/td[1]
		//table[@id="customers"]/tbody/tr[7]/td[1]

		String beforexpath_comp = "table[@id=\"customers\"]/tbody/tr[";

		String afterxpath_comp = "]/td[1]";

		int rowcount = driver.findElements(By.xpath("table[@id=\"customers\"]/tbody/tr")).size();

		for (int i = 2; i <= rowcount; i++) {
			String compxpath = beforexpath_comp + i + afterxpath_comp;

			String compName = driver.findElement(By.xpath(compxpath)).getText();
			System.out.println(compName);

		}
		//table[@id="customers"]/tbody/tr[2]/td[2]
		//table[@id="customers"]/tbody/tr[3]/td[2]
		//table[@id="customers"]/tbody/tr[3]/td[1]

		By row=By.xpath("//table[@id='customers']/tbody/tr");
		By col=By.xpath("//table[@id='customers']/tbody/th");

		String beforexpath="//table[@id='customers']/tbody/tr[";
		String afterxpath="]/td[";
		printTable(row,col,beforexpath,afterxpath);

	}

	public static void printTable(By rowLocator, By colLocator, String beforexpath, String afterxpath) {
		int rowcount = driver.findElements(rowLocator).size();
		int colcount = driver.findElements(colLocator).size();

		for (int row = 2; row <= rowcount; row++) {
			for (int col = 1; col <= colcount; col++) {
				String xpath = beforexpath + row + afterxpath;

				String text = driver.findElement(By.xpath(xpath)).getText();
				System.out.println(text + "  |  ");

			}
			System.out.println();

		}
	}
}

