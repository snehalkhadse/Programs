package InterfaceConcept;

public abstract class Application 
{
	public abstract void serverSetup();
	public abstract void dbSetup();
	public abstract void envSetup();
	
	public  void UILayerComponents() 
	{
		System.out.println("applicatin UI layercomponent");
	}
	
}
