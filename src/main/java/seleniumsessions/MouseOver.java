package seleniumsessions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseOver {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.bigbasket.com/");
		Thread.sleep(5000);

		//WebElement mainmenu =  driver.findElement(By.xpath("//div[@id=\"navbar\"]/ul/li/a[@class=\"dropdown-toggle meganav-shop\"]"));
		//WebElement beverages=driver.findElement(By.linkText("Beverages"));
		//WebElement tea=driver.findElement(By.linkText("Tea"));


		By mainMenu = By.xpath("//a[@class=\"dropdown-toggle meganav-shop\"]");
		By bevrages = By.linkText("Beverages");
		By tea = By.linkText("Tea");
		By teaBags = By.linkText("Tea Bags");


		selectSubMenu(mainMenu, bevrages, tea, teaBags);

		/*WebElement mainmenu =  driver.findElement(By.xpath("//div[@id=\"navbar\"]/ul/li/a[@class=\"dropdown-toggle meganav-shop\"]"));

		Actions act = new Actions(driver);
		//act.contextClick(mainmenu).build().perform();
		act.moveToElement(mainmenu).click().build().perform();

		WebElement beverages=driver.findElement(By.linkText("Beverages"));

		act.moveToElement(beverages).build().perform();

		WebElement tea=driver.findElement(By.linkText("Tea"));

		act.moveToElement(tea).build().perform();

		WebElement teaBags=driver.findElement(By.linkText("Tea Bags"));

		act.moveToElement(teaBags).click().build().perform();


		//act.moveToElement(beverages).build().perform();
		//driver.findElement(By.linkText("Beverages")).click();

		driver.quit();*/

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void selectSubMenu(By parentMenu, By childMenu) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(parentMenu)).perform();
		Thread.sleep(3000);
		getElement(childMenu).click();
	}

	public static void selectSubMenu(By parentMenu, By childMenu ,By subChildMenu) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(parentMenu)).perform();
		Thread.sleep(3000);
		act.moveToElement(getElement(childMenu)).perform();
		Thread.sleep(3000);
		getElement(subChildMenu).click();
	}
	public static void selectSubMenu(By parentMenu, By childMenu1, By subChildMenu2, By subChildMenu3) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(parentMenu)).perform();
		Thread.sleep(3000);
		act.moveToElement(getElement(childMenu1)).perform();
		Thread.sleep(3000);
		act.moveToElement(getElement(subChildMenu2)).perform();

		getElement(subChildMenu3).click();
	}

}




