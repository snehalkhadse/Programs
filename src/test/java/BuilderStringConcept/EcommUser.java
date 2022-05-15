package BuilderStringConcept;

public class EcommUser {

	public static void main(String[] args) 
	{
		EcommApp shop=new EcommApp();
		shop.login("naveen@gmail.com","naveen123");
		shop.doSearch("macbook",1000);
		shop.addToCart("macbook");
		shop.doPayment("ICIC Bank","test123");
		shop.getEmail();
		shop.logout();
		
		
		
		shop.login();
		shop.doSearch("nike shoes");
		shop.addToCart("nike shoe");
		shop.doPayment("GPay", "test123");
		shop.logout();
		
		int orderId=shop.generateOrderId();
		System.out.println(orderId);
		
		shop.login().doPayment("bank","test123").logout();
		
		shop.login().doSearch("ibook").doPayment("bank","test123");
		
		shop.login().logout();
		
		
		
	}

}
