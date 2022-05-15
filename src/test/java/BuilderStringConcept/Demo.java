package BuilderStringConcept;

public class Demo {

	public static void main(String[] args) {
		
		String s1="naveen";
		String s2="selenium";
		
		s1=s1.concat(s2);
		
		System.out.println(s1);
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
	}

}
