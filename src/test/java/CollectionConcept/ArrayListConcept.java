package CollectionConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) 
	{
		int a[]=new int[3];//static array
		
		ArrayList ar=new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		
		System.out.println(ar.size());
		
		ar.add(40);
		ar.add(50);
		
		System.out.println(ar.size());
		System.out.println(ar.get(4));
		
		//print value from array list
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		
		ArrayList<String>ar1=new ArrayList<String>();
		ar1.add("test");
		ar1.add("selenium");
		
		ArrayList<Integer>ar2=new ArrayList<Integer>();
		ar2.add(100);
		
		
		ArrayList<Employee>ar3 = new ArrayList<Employee>();
		Employee e1=new Employee("Naveen",25,"QA");
		Employee e2=new Employee("Tom",27,"Dev");
		Employee e3=new Employee("peter",29,"Admin");
		
		ArrayList<Employee>ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		//iterator to traverse value
		Iterator<Employee>it=ar4.iterator();
		while(it.hasNext()) 
		{
			Employee emp=it.next();

			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
			
		}
		
		System.out.println("--------------------");
		//addall
		ArrayList<String>ar5=new ArrayList<String>();
		ar5.add("test");
		ar5.add("selenium");
		ar5.add("QTP");
		
		ArrayList<String>ar6=new ArrayList<String>();
		ar6.add("dev");
		ar6.add("java");
		ar6.add("java script");
		
		ar5.addAll(ar6);
		
		
		for(int i=0;i<ar5.size();i++)
		{
			System.out.println(ar5.get(i));
			
		}
		
		System.out.println("--------------------");
		//remove All
		ar5.removeAll(ar6);
		for(int i=0;i<ar5.size();i++)
		{
			System.out.println(ar5.get(i));
			
		}
		
		//retain All
		ArrayList<String>ar7=new ArrayList<String>();
		ar7.add("test");
		ar7.add("selenium");
		ar7.add("QTP");
		
		ArrayList<String>ar8=new ArrayList<String>();
		ar8.add("test");
		ar8.add("Java");
		
		System.out.println("--------------------");
		ar7.retainAll(ar8);
		for(int i=0;i<ar7.size();i++)
		{
			System.out.println(ar7.get(i));
			
		}
	}
	
		
}
