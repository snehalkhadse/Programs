package CollectionConcept;

import java.util.Comparator;

public class Employee1 {
	
	
	String name;
	int salary;
	
	public  Employee1(String name,int salary)
	{
		this.name=name;
		this.salary=salary;
	}

	@Override
	public String toString() {
		
		return "Employee[name="+name+",salary="+salary+"]";
				
	}
}

class EmpComparator implements Comparator<Employee1>
{
	
	@Override
	public int compare(Employee1 e1, Employee1 e2) {
	
		return e1.salary-e2.salary;
	}

	
	

	
	

}




