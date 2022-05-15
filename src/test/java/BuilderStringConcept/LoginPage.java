package BuilderStringConcept;

public class LoginPage extends Page 
{


	
		int loadTime=20;
		
		void loading() 
		{
			System.out.println("login page load time:"+loadTime);
			System.out.println("login page load time:"+super.loadTime);
			
			pageTitle();
			super.pageTitle();
			
		}
		
		public void pageTitle()
		{
			System.out.println("login page title");
			
		}
		public void LoginPage(int time)
		{
			super(40);
			System.out.println("login page construcor");
			
		}
}