package Mytest;

import org.testng.annotations.Test;

public class ExceptedExceptionConcept {
	
	String name="Tom";
	@Test(expectedExceptions= {ArithmeticException.class,NullPointerException.class})
	public void loginTest()
	{
		
		System.out.println("login test--");
		//int i=9/0;
		ExceptedExceptionConcept obj=new ExceptedExceptionConcept();
		//obj=null;
		System.out.println(obj.name);
		
	}
}
