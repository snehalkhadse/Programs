package JavaProgram1;

class AditionNumber
{

	public static void main(String[] args) 
	{
		System.out.println("add number");
		AditionNumber obj=new AditionNumber();
		obj.add(10,30);
	}


	public static int add(int a, int b) {
		 a = 10;
		 b = 20;
		int c = a + b;

		return c;
	}
}