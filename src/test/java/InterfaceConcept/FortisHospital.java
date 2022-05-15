package InterfaceConcept;
public class FortisHospital extends MedicalAssociation implements USMedical,IndianMedical,UKMedical

{
	
	@Override
	public void covidTest() 
	{

		System.out.println("fh covid test");
	}

	//uk
	@Override
	public void emergencyServices() {
		System.out.println("fh emergency services");
	}

	@Override
	public void pediaServices() {
		System.out.println("fh pedia services");
		
	}

	@Override
	public void ENTServices() 
	{
		System.out.println("fh ENT services");
		
	}
	
	//india
	
	@Override
	public void gynoServices() {
		
		System.out.println("fh gyno services");
	}

	@Override
	public void neuroServices() 
	{
		System.out.println("fh neuro services");
	}

	@Override
	public void oncologyServices() 
	{
		System.out.println("fh oncology services");
		
	}
	
	
	
	//us
	@Override
	public void orthoServices() {
		System.out.println("fh ortho services");
		
	}

	@Override
	public void physioservices() {
		
		System.out.println("fh physio services");
	}

	@Override
	public void cardioServices() 
	{
		System.out.println("fh cardio services");
		
	}
	
	

	@Override
	public void billing() {
		System.out.println("fh billing");
	}

	@Override
	public void totalDoctor(int doctor) 
	{
		System.out.println("total Doctor"+doctor);
	}
	
	
	//
	public void pathologyServices()
	{
		System.out.println("FH...pathology services");
	}
	public void medicalInsurance()
	{
		System.out.println(" fH ...medical Insurance");
	}
	
}
