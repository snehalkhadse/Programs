package seleniumsessions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableCheckbox {
    static WebDriver driver;

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://selectorshub.com/xpath-practice-page/");

        selectUserName("Joe.Root");
    }

    public static void selectUserName(String userName) {

        driver.findElement(By.xpath("//a[contains(text(),'" + userName
                + "')]/parent::td/preceding-sibling::td//input[@type='checkbox']")).click();
    }
}