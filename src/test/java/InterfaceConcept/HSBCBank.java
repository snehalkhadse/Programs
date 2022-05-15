package InterfaceConcept;

public class HSBCBank implements USBank,BrazilBank
{
	public void credit()
	{
		System.out.println("hsbc bank");
	}
	
	public void debit()
	{
		System.out.println("hsbc bank");
	}
	
	public void transferMoney()
	{
		System.out.println("hsbc transfer money");
	}
	
	
	
	public void educationLoan()
	{
		System.out.println("hsbc education loan");
	}
	public void carLoan()
	{
		System.out.println("hsbc car loan");
	}
	public void mutualFund()
	{
		System.out.println("hsbc mutual fund");
	}
}
