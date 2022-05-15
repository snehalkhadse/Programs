package InterfaceConcept;

public class GoogleAppTesting {

	static WebDriver driver;
	public static void main(String[] args) 
	{
		
		
		//top casting
				String browser="Safari";
				if(browser.equals("chrome"))
				{
					driver=new ChromeDriver();
				}
				else if(browser.equals("FireBox"))
				{
					driver=new FireBoxBrowser();
				}
				else if(browser.equals("Safari"))
				{
					driver=new SafariDriver();
				}
				else
				{
					System.out.println("please choose correct browser");
				}
				
		//ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.getTitle();
		driver.getpageUrl();
		driver.findElement("username");
		
		/*FireBoxBrowser driver=new FireBoxBrowser();
		driver.get("http://www.google.com");
		driver.getTitle();
		driver.getpageUrl();
		driver.findElement("username");*/
		
		/*SafariDriver driver=new SafariDriver();
		driver.get("http://www.google.com");
		driver.getTitle();
		driver.getpageUrl();
		driver.findElement("username");*/
		
		
		
		
		
	}

}
