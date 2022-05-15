package BuilderStringConcept;

public class EcommApp
{
	public EcommApp login()
	{
		System.out.println("default login;");
		return this;
	}
	public EcommApp login(String un,String pwd)
	{
		System.out.println("login with:"+un+":"+pwd);
		return this;
	}
	public EcommApp doSearch(String productName)
	{
		System.out.println("search with:"+productName);
		return this;
	}
	public EcommApp doSearch(String productName,int price)
	{
		System.out.println("search with:"+productName+"price:"+price);
		return this;
	}
	public EcommApp addToCart(String productName)
	{
		System.out.println("adding product to a cart:"+productName);
		return this;
	}
	public EcommApp doPayment(String accName,String pwd)
	{
		System.out.println("payment with:"+accName+":"+pwd);
		return this;
	}
	public int generateOrderId()
	{
		return 1002;
	}
	public EcommApp getEmail()
	{
		System.out.println("email sent successfully");
		return this;
	}
	public EcommApp logout()
	{
		System.out.println("logout from class");
		return this;
	}
}
