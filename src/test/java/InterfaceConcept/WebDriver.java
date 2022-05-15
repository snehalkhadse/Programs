package InterfaceConcept;

public interface WebDriver 
{
	public void get(String url);
	public void getTitle();
	public void getpageUrl();
	public void findElement(String locator);
	public void quit();
	
	
}
