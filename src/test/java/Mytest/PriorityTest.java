package Mytest;

import org.testng.annotations.Test;

public class PriorityTest {
	

	/*test c
	test d
	test e
	test b
	test a*/
	
	@Test(priority=2)
	public void a_test()
	{
		System.out.println("test a");
	}

	@Test(priority=1)
	public void b_test()
	{
		System.out.println("test b");
	}

	@Test(priority=0)
	public void c_test()
	{
		System.out.println("test c");
	}

	@Test
	public void d_test()
	{
		System.out.println("test d");
	}

	@Test
	public void e_test()
	{
		System.out.println("test e");
	}

}
