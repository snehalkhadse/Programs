package BuilderStringConcept;

public class FinilizeConcept {

	public static void main(String[] args) 
	{
		FinilizeConcept obj=new FinilizeConcept();
		obj=null;
		System.gc();
		System.out.println("BYE");
	
	}
	@Override
	public void finalize() 
	{
		System.out.println("inside the finilize method");
		
	}

}
