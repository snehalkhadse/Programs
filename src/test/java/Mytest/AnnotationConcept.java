package Mytest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationConcept {

	
	
	/*BS-----DBConnection
	BT-----createuser
	BC----launchBrowser
	
	BM----loginToApp
	accInfoTest
	AM---logout
	
	BM----loginToApp
	userInfoTest
	AM---logout
	
	AM---logout
	AC---closeBrowser
	AT-----DBConnection
	PASSED: accInfoTest
	PASSED: userInfoTest*/
	
	@BeforeSuite
	
	public void DBConnection()//1
	{
		System.out.println("BS-----DBConnection");
	}
	
	@BeforeTest//2
	public void createUser()
	{
		System.out.println("BT-----createuser");
	}
	

	@BeforeClass//3
	public void launchBrowser()
	{
		System.out.println("Bc----launchBrowser");
	}
	
	@BeforeMethod
	public void loginToApp()
	{
		System.out.println("BM----loginToApp");
	}
	
	
	@Test
	public void userInfoTest()
	{
		System.out.println("userInfoTest");
	}
	@Test
	public void accInfoTest()
	{
		System.out.println("accInfoTest");
	}
	
	@AfterMethod
	public void logout()
	{
		System.out.println("AM---logout");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("AC---closeBrowser");
	}
	
	@AfterTest
	public void deleteUser()
	{
		System.out.println("AT-----deleteuser");
	}
	
	@AfterSuite
	public void disconnectDB()
	{
		System.out.println("AS-----DBConnection");
	}
}
