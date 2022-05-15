package BuilderStringConcept;

public class FinallylConcept {

	public static void main(String[] args) 
	{
		int p=10;
		try
		{
			int div=p/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("arithmatic exeption is comming");
			
		}
		finally
		{
			System.out.println("finally block");
			
		}
		System.out.println("BYE");
		System.out.println(getMarks("Tom"));
	
}
	public static int getMarks(String name)
	{
		if(name.equals("Tom"))
		{
			try
			{
				int i=9/0;
			}
			catch(ArithmeticException e)
			{
				return 98;
			}
			finally
			{
				return 80;
			}
		}
		else if(name.equals("peter"))
		{
			return 90;
		}
		else
		{
			System.out.println("name not found");
			return -1;
		}
		
	}
	}