package seleniumsessions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class CooKiesManager {

    static WebDriver driver;

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().addCookie(new Cookie("local_language", "EN"));



        driver.get("https://qa.max.com/shop/create-account/");
        Set<Cookie> cookies = driver.manage().getCookies();
        Iterator<Cookie> it = cookies.iterator();
        while(it.hasNext()) {
            String name = it.next().getName();
            System.out.println(name);
        }

    }

}

