package InterfaceConcept;

public class FireBoxBrowser implements WebDriver
{
	
	public FireBoxBrowser()
	{
		System.out.println("launch google FireBox browser");
	}

	@Override
	public void get(String url) {
		System.out.println("launch url:"+url);
		
	}

	@Override
	public void getTitle() {
		System.out.println("title is:"+"Google");
	}

	@Override
	public void getpageUrl() {
		System.out.println(" url is:"+"www.google.com");
	}

	@Override
	public void findElement(String locator) {
		System.out.println("Find elemen with:"+locator);
		
	}

	@Override
	public void quit() {
		System.out.println("Quit Browser");
	}
	
}
