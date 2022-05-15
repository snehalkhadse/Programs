package CollectionConcept;

import java.util.ArrayList;
import java.util.Arrays;

public class VirtualCapacity {

	public static void main(String[] args) 
	{
		ArrayList<Object>ar=new ArrayList<Object>();
		System.out.println(ar.size());
		
		ar.add(100);
		System.out.println(ar.size());
		
		ar.add(200);
		ar.add(300);
		ar.add(400);
		System.out.println(ar.size());
		
		//list with other coolection
		ArrayList<Integer>numbers=new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		System.out.println(numbers);
		
		ArrayList<String>names=new ArrayList<String>(Arrays.asList("10","20","30","40"));
		System.out.println(names);
		
		System.out.println(names.size());
		
		//generic array list
		ArrayList<Integer>marksList=new ArrayList<Integer>();
		marksList.add(100);
		
		ArrayList<Double>arD=new ArrayList<Double>();
		arD.add(100.0);
		arD.add(12.33);
		
		
		ArrayList<String>studname=new ArrayList<String>();
		studname.add("Tom");
		
	}

}
