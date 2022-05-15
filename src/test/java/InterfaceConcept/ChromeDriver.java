package InterfaceConcept;

public class ChromeDriver implements WebDriver
{
	
	public ChromeDriver()
	{
		System.out.println("launch google chrome browser");
	}

	@Override
	public void get(String url) 
	{
		System.out.println("launch url:"+url);
	}

	@Override
	public void getTitle() 
	{
		System.out.println("title is:"+"google");
		
	}

	@Override
	public void getpageUrl() 
	{
		System.out.println("url is:"+"http://www.google.com");
	}

	@Override
	public void findElement(String locator) 
	{
		System.out.println("finding elements with:"+locator);
	}

	@Override
	public void quit() {
		System.out.println("Quit Browser");
	}
	
}
