package InterfaceConcept;

public interface USMedical extends WHo
{
	int min_fee=10;
	public void orthoServices();
	public void physioservices();
	public void cardioServices(); 
	//public void services911();
	public void emergencyServices();
	
	
	public void totalDoctor(int count);
	
	public  static void hospitalAdmin()
	{
		System.out.println("us---hospital admin");
	}
	
	default void billing()
	{
		System.out.println("us ....billing");
	}
	
	
}
