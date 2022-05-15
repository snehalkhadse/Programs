package BuilderStringConcept;

public class TryCatchBlock1 
{
	String name;
	public static void main(String[] args) 
	{
		int base=3;
		
		System.out.println("HI");
		System.out.println("HI");
		System.out.println("HI");
		try
		{
			TryCatchBlock1 obj=new TryCatchBlock1();
			//obj=null;
			obj.name="tom";
			System.out.println(obj.name);
			
			int i=9/base;
			System.out.println("BYe");
			System.out.println("bye");
			System.out.println("bye");
		}
		catch(ArithmeticException e) 
		{
			System.out.println("arithmatic exception is comming");
			
		}
		
		catch(NullPointerException e) 
		{
			System.out.println("null Pointer exception is comming");
			e.printStackTrace();
		}
		
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
	}

}
