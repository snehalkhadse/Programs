package InterfaceConcept;

public abstract class Page 
{
	public abstract void title();
	public abstract void url();
	public abstract void loading();
	
	public void header()
	{
		System.out.println("page---header");
	}
	
	public static final void logo()
	{
		System.out.println("page---logo");
	}
	public Page()
	{
		System.out.println("page---construcor");
		
	}
}
