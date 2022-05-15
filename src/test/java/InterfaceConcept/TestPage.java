package InterfaceConcept;

public class TestPage {

	public static void main(String[] args) {
	
		LoginPage lp=new LoginPage();
		lp.header();
		lp.title();
		lp.loading();
		lp.url();
		lp.doLogin("admin","admin");
		Page.logo();
		
		//top casting
		Page p=new LoginPage();
		p.header();
		p.title();
		p.loading();
	}

}
