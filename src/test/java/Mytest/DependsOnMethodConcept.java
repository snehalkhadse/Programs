package Mytest;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {
	
	@Test
	public void loginTest()
	{
		System.out.println("login to app");
		int i=9/0;
	}
	
	@Test(dependsOnMethods="loginTest",priority=1)
	public void homePageTest()
	{
		System.out.println("homePage Test");
	}
	
	@Test(dependsOnMethods="loginTest",priority=2)
	public void searchTest()
	{
		System.out.println("search Test");
	}
	
}
