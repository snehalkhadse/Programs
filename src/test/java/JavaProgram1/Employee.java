package JavaProgram1;

public class Employee {

	
		String name;
		double salary;
		int age;
		boolean isActive;
		
		
		public static void main(String[] args) 
		{
			Employee e1=new Employee();
			e1.name="Tom";
			e1.age=24;
			e1.salary=34.99;
			e1.isActive=true;
			System.out.println(e1.name);
			System.out.println(e1.salary);
			System.out.println(e1.age);
			
			Employee e2=new Employee();
			e2.name="lisa";
			e2.age=25;
			e2.salary=35.99;
			e2.isActive=false;
			System.out.println(e2.name+" "+e2.age+" "+e2.salary+" "+e2.isActive);
			
			Employee e4=new Employee();
			e4=null;
			e4.name="testing";
		}

}
