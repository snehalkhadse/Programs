package BuilderStringConcept;

public class FinallyBlock {

	public static void main(String[] args) 
	{
		System.out.println("A");
		try
		{
			int i=9/0;
		}
		catch(ArithmeticException e) 
		{
			System.out.println("arithmatic exception is comming");
			
		}
		finally
		{
			System.out.println("Bye");
		}
		
		
		System.out.println(getMarks("naveen"));
		
	}
	
	public static int getMarks(String name)
	{
		if(name.equals("sonali"))
		{
			return 90;
		}
		else if(name.equals("Tom"))
		{
			try
			{
				int i=9/0;
			}
			catch(Exception e)
			{
				return 50;
			}
		
			finally
			{
				System.out.println("inside the finally block");
				return 10;
			}
		}
		
		else if(name.equals("sujan"))
		{
			return 95;
		}
		return -1;
	}
}
