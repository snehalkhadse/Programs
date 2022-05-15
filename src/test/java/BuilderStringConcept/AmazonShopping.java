package BuilderStringConcept;

public class AmazonShopping {

	public static void main(String[] args) 
	{
		 AmazonApp shop=new AmazonApp();
		 shop.login(999992,999)
		 	.search("apple macbook pro")
		 	.addToCart("apple macbook pro")
		 	.payment("1123 1234 1244")
		 	.logout();
		 System.out.println("----------");
		 
		 shop.login("naveen123@gmail.com","naveen")
		 	.addToCart("samsung pro")
		 	.payment("1212 1212 1212 1212")
		 	.logout();
	}
	

}
