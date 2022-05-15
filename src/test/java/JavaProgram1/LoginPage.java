package JavaProgram1;

public class LoginPage {

	public static void main(String[] args) 
	{
		LoginPage lp=new LoginPage();
		lp.login("admin","admin");
		lp.search("iphonee/2",80000);
		lp.doPayment(1212121212, 111);
	}
	
	public void login()
	{
		System.out.println("login ti application");
	}
	
	public void login(int a)
	{
		
	}
	public void login(int a,int b)
	{
	}
	public void login(int a,String b)
	{
	
	}
	public void login(String un,String pwd)
	{
		System.out.println("login with:"+un+" "+pwd);
	}
	
	public void login(String un,String pwd,int otp)
	{
		
	}
	public void login(String un,String pwd,int otp,String role)
	{
		
	}
	public void login(String un,String pwd,long ph)
	{
		
	}
	public void search()
	{
		
	}
	
	public void search(String name)
	{
		
	}
	public void search(String name,int price)
	{
		System.out.println("product name:"+name);
		System.out.println("product price:"+price);
	}
	public void search(String sellerName,int price,boolean available)
	{
		
	}
	public void search(String name,int price,String color)
	{
		
	}
	public void doPayment(String UPI,long phone)
	{
		
	}
	
	public void doPayment(long cc,long cvv)
	{
		System.out.println("make the payment:"+cc+" "+"cvv is:"+cvv);
	}
	public void doPayment(long phone,String pwd)
	{
		
	}
	
	
}
