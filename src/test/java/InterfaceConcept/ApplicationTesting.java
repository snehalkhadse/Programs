package InterfaceConcept;

public class ApplicationTesting {

	public static void main(String[] args) 
	{
		WhatsUp wt=new WhatsUp();
		wt.dbSetup();
		wt.serverSetup();
		wt.envSetup();
		wt.UILayerComponents();

	}

}
