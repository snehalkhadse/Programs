package JavaProgram1;

import java.util.ArrayList;

public class CompanyFun {
	
	String name;
	int empcount;
	public static void main(String[] args) 
	{
		CompanyFun comp=new CompanyFun();
		System.out.println(comp.getCEOName());
		
		int shares=comp.getTotalCount();
		System.out.println(comp.getTotalCount());
		
		String founderArr[]=comp.getCoFounders();
		System.out.println(founderArr.length);
		
		for(String e:founderArr)
		{
			System.out.println(e);
			
		}
		
		ArrayList<String> ar=comp.getCustomerList();
		System.out.println("total nos of customers:"+ar.size());
		for(String e:ar)
		{
			System.out.println(e);
		}
		

	}
	public String getCEOName()
	{
		return "Tom";
	}
	
	public int getTotalCount()
	{
		System.out.println("get total count of share");
		int totalshare=2000;
		return totalshare;
		
	}
	
	public String[] getCoFounders()
	{
		String founder[]=new String[3];
		founder[0]="tom";
		founder[1]="peter";
		founder[2]="steve";
		
		return founder;
	}
	
	public ArrayList<String> getCustomerList()
	{
		System.out.println("get customer List");
		 ArrayList<String> custList=new ArrayList<String>();
		 custList.add("Nestle");
		 custList.add("pepsi");
		 custList.add("deo");
		 
		 return custList;
	}
	
	
}
