package seleniumsessions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.List;

public class BigBasketCategoryIteration {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bigbasket.com/");

        WebElement mainCate = driver.findElement(By.xpath("//a[@class='dropdown-toggle meganav-shop']"));
        Actions act = new Actions(driver);
        act.moveToElement(mainCate).perform();
        Thread.sleep(2000);

        List<WebElement> level1list = driver.findElements(By.xpath("//ul[@id='navBarMegaNav']//a"));
        for (WebElement e : level1list) {
            act.moveToElement(e).perform();
            System.out.println(e.getText());
        }

        List<WebElement>level2list=driver.findElements(By.xpath("(//ul[@class='nav nav-pills nav-stacked'])[4]//a"));
        for (WebElement e1 : level2list) {
            act.moveToElement(e1).perform();
            System.out.println( e1.getText());
        }


        List<WebElement>level3list=driver.findElements(By.xpath("(//ul[@class='list-unstyled'])[3]//a"));
        for (WebElement e3 : level3list) {
            act.moveToElement(e3).perform();
            System.out.println(e3.getText());
        }


    }
}