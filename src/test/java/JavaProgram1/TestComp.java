package JavaProgram1;

public class TestComp {

	public static void main(String[] args) {
		
		Company c1=new Company();
		c1.name="f1";
		c1.empcount=5000;
		c1.getCeoName();
		//c1.totalShare();
		
		Employee1 e1=new Employee1();
		e1.setSalary(1000);
		System.out.println(e1.getSalary());
		
		
		e1.setSalary(5000);
		System.out.println(e1.getSalary());
		
		e1.setAddress("500,London");
		System.out.println(e1.getAddress());
		
	}

}
