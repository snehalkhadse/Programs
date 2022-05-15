package BuilderStringConcept;



public class TryCatchBlock
{
	 
	

	public static void main(String[] args) 
	{
		int base=0;
		System.out.println("HI");
		System.out.println("HI");
		System.out.println("HI");
		try
		{
			int i=9/base;
			System.out.println("BYe");
			System.out.println("bye");
			System.out.println("bye");
		}
		catch(ArithmeticException e) 
		{
			System.out.println("some exception is comming");
			e.printStackTrace();
		}
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
	}


}
