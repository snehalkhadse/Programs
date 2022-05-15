package BuilderStringConcept;

public class ReverseString {

	public static void main(String[] args) {
		String str="selenium";
		//str.concat("testing");
		
		/*int len=str.length();
		String rev="";
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);*/
		
		
		String str1="selenium";
		StringBuffer sb=new  StringBuffer(str1);
		//sb.reverse();
		System.out.println(sb.reverse());
		
		System.out.println(reverseString("tttgjk"));
	}
	public static String reverseString(String value)
	{
		
		if (value==null) 
		{
			System.out.println("you are passing null value");
			return null;
			
			
		}
		int len=value.length();
		if(len==1) {
			return value;
		}
		
		
		String rev="";
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+value.charAt(i);
			
		}
		return rev;
	}
	
}
