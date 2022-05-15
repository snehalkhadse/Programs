package JavaProgram1;

public class IfElsePro1 {

	public static void main(String[] args) 
	{
		int a=10,b=20;
		
		System.out.println(a==b);
		
		if(a==b) 
		{
			System.out.println("Hi");
		}
		else 
		{	
			System.out.println("Bye");
		}
		
		String s1="selenium";
		String s2="selenium";
		
		if(s1.equals(s2))
		{
			System.out.println("both are equal");
		}
		else 
		{
			System.out.println("both are not equal");
		}
		
		
		//nested if
		int marks=50;
		
		if(marks>=90)
		{
			System.out.println("a grade");
			if(marks<=80)
			{
				System.out.println("B grade");
			}
		}
		else
		{
			System.out.println("Fail");
		}
			
		String browser="safari";
		if(browser.equals("chorme")) {
			System.out.println("launch chorme");
		}
		if(browser.equals("safari")) {
			System.out.println("launch safari");
		}
		
		//if elseif
		if(browser.equals("chorme")) {
			System.out.println("launch chorme");
		}
		else if(browser.equals("firebox")) {
			System.out.println("launch firebox");
		}
		else if(browser.equals("safari")) {
			System.out.println("launch safari");
		}
		else {
			System.out.println("launch chorme");
		}
		
	}

}
