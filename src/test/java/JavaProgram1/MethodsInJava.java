package JavaProgram1;

public class MethodsInJava {

	public static void main(String[] args) 
	{
		MethodsInJava obj=new MethodsInJava();
		obj.test();
		int p=obj.getMarks();
		System.out.println(p);
		
		String s=obj.getName();
		System.out.println(s);
		
		
		int s1=obj.sum(10, 20);
		System.out.println(s1);
	}
	public void test()
	{
		System.out.println("test method");
		
	}
	public int getMarks()
	{
		System.out.println("get Marks");
		int total=100;
		int bonus=50;
		int totalMarks=total+bonus;
		
		return totalMarks;
		
	}
	
	public String getName()
	{
		System.out.println("get Name method");
		String s="naveen";
		
		return s;
		
	}
	public int sum(int a ,int b)
	{
		System.out.println("sum method");
		int z=a+b;
		return z;
	}
	
}
