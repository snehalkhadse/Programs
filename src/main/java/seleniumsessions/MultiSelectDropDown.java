package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiSelectDropDown {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganes\\Downloads\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();//launch chrome

		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		driver.findElement(By.id("justAnInputBox")).click();

		Thread.sleep(3000);


			//if(text.equals("choice 2 1"))
			//{
				//droplist.get(i).click();
				//break;
			//}
			//SelectMultipleValues(driver,"choice 6 1","choice 2 3","choice 3");
			SelectMultipleValues(driver,"ALL");
	}

	public static void SelectMultipleValues(WebDriver driver,String... value)
	{
			List<WebElement>droplist=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));

			System.out.println(droplist.size());

			if(!value[0].equalsIgnoreCase("ALL")) {
				for(int i=0;i<droplist.size();i++){

					String text=droplist.get(i).getText();
					System.out.println(text);
					for(int j=0;j<value.length;j++)
					{
						try{
							if(!text.isEmpty()){
								if(text.equals(value))
								{
									droplist.get(i).click();
									break;
								}

							}
						}catch(Exception e){
						}
					}
				}
			}else {

				try {
						for(int full=0;full<droplist.size();full++)
						{
							droplist.get(full).click();
						}
					}
					catch(Exception e)
					{

					}
			}

	}
}



		