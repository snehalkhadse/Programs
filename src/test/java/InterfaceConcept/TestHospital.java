package InterfaceConcept;

public class TestHospital {

	public static void main(String[] args) 
	{
		FortisHospital fs=new FortisHospital();
		fs.cardioServices(); 
		fs.emergencyServices();
		fs.pediaServices();
		fs.ENTServices();
		fs.gynoServices();
		fs.pathologyServices();
		fs.medicalInsurance();

		
		
		System.out.println(USMedical.min_fee);
		fs.billing();
		//USMedical.hospitalAdmin();
		fs.covidTest();	
		fs.totalDoctor(20);
		
		fs.medicalTraining();
		fs.medicalResearch();
		
		//Top casting
		USMedical us=new FortisHospital();
		us.cardioServices();
		us.physioservices();
		us.emergencyServices();
		
		
		
		
	}

}
