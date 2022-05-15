package JavaProgram1;

public class WebDriverTool 
{
	public void launchBrowser(String browser)
	{
		System.out.println("launch google chrome");
	
	if(browser.equals("chrome"))
	{
		launchChrome();
		
	}
	else if(browser.equals("firebox"))
	{
		launchChrome();
	}
	else
	{
		System.out.println("please pass correct browser");
	}
	}
	public void launchChrome() 
	{
		System.out.println("please pass chrome version");
		System.out.println("please pass os version");
		System.out.println("please pass launch chrome");
	}
	
	public void launchFirebox(String browser)
	{
		System.out.println("check ff version");
		System.out.println("check os version");
		System.out.println(" launch firebox");
	}
	
	
	
	
}
