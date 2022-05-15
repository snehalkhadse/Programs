package JavaProgram1;

public class Company {

	public String name;
	public int empcount;
	public int shareprice;
	
	public String getCeoName()
	{
		return "tom";
			
	}
	
	private int totalShare()
	{
		return 1000;
	}

	public static void main(String[] args) 
	{
		
		Company obj=new Company();
		obj.name="IBM";
		obj.empcount=500;
		obj.shareprice=400;
		obj.getCeoName();
		obj.totalShare();
		
		
	}

}
