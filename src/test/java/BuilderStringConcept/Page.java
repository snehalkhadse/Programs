package BuilderStringConcept;

public class Page 
{
	int loadTime=30;
	
	public void pageTitle()
	{
		System.out.println("page title");
	}
	public Page()
	{
		System.out.println("page costrucor");
	}
	
	public Page (int time)
	{
		System.out.println("page cont--"+time);
	}
	
	
}
