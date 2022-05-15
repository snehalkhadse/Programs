package CollectionConcept;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		//default generics
		//ArrayList ar=new ArrayList();
		//ar.add(100);
		//ar.add(200);
		
		ArrayList<Object>ar=new ArrayList<Object>();
		ar.add(100);
		ar.add(200);
		ar.add("testing");
		ar.add('t');
		ar.add(12.33);
		ar.add(true);
		
		System.out.println(ar);
		System.out.println(ar.get(2));
		
		//System.out.println(ar.get(6));
		System.out.println(ar.size());
		System.out.println("LI="+0);
		System.out.println("HI="+(ar.size()-1));
		ar.add(400);
		ar.add(500);
		System.out.println(ar.size());
		
		
	}

}
