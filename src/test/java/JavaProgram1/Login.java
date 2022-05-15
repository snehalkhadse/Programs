package JavaProgram1;

public class Login {


	String username,password,url,title;
	
	
	public static void main(String[] args)
	{
		Login l1=new Login();
		l1.username="admin";
		l1.password="admin123";
		l1.title="Login";
		l1.url="http://www.goole.com";
		System.out.println(l1.username);
		System.out.println(l1.password);
		
		Login amazonLogin=new Login();
		amazonLogin.username="naveen";
		amazonLogin.password="naveen123";
		amazonLogin.url="http://www.amazon.com";
		
		System.out.println(amazonLogin.title);

		Login myLogin=new Login();
		
		myLogin.url="http://www.myapp.com";
		
		System.out.println(myLogin.password);
		System.out.println(myLogin.username);
		System.out.println(myLogin.title);
		System.out.println(amazonLogin.url);
		
	}

}
