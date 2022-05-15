package InterfaceConcept;

public class LoginPage extends Page
{

	@Override
	public void title()
	{
			System.out.println("LPpage---title");
		
	}

	@Override
	public void url() 
	{
		System.out.println("LPpage---url");
		
	}
	
	public void loading()
	{
			System.out.println("LPpage--loading");
		
	}
	public void doLogin(String un,String pwd)
	{
			System.out.println("login with:"+un+" "+pwd);
		
	}
	public void doLogin(String un,String pwd,String emailId)
	{
			System.out.println("login with:"+un+pwd+emailId);
		
	}
	public LoginPage()
	{
		System.out.println("login page...constructor");
	}


}
