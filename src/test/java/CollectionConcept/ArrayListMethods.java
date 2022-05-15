package CollectionConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) 
	{
	
		 ArrayList<String>ar=new ArrayList<String>();
		 ar.add("Java");
		 ar.add("Python");
		 ar.add("Ruby");
		 ar.add("JavaScript");
		 
		 ArrayList<String>ar1=new ArrayList<String>();
		 ar1.add("Testing");
		 ar1.add("dev ops");
		 
		 ar.addAll(ar1);
		 System.out.println(ar);
		 
		//ar.addAll(3,ar1);
		//System.out.println(ar);
		
		 ArrayList<String>clonelist=(ArrayList<String>)ar.clone();
		 System.out.println(clonelist);
		 
		 System.out.println(ar.contains("Python"));
		 System.out.println(ar.contains("C"));
		 
		 
		 System.out.println(ar.indexOf("Ruby")>0);
		 
		 ArrayList<String>list1=new ArrayList<String>(Arrays.asList("Naveen","Tom","steve","Lisa","Naveen"));
		 
		 int i=list1.lastIndexOf("naveen");
		 System.out.println(i);
		 
		 list1.remove(1);
		 System.out.println(list1);
		 
		 list1.remove("Lisa");
		 System.out.println(list1);
		 
		 ArrayList<Integer>numbers=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		 numbers.removeIf(num-> num%2 == 0);
		 
		 System.out.println(numbers);//odd nos
		 
		 //retain aLL
		 ArrayList<String>namelist=new ArrayList<String>(Arrays.asList("Naveen","Tom","steve","Lisa","Naveen"));
		 System.out.println(namelist);
		 
		 namelist.retainAll(Collections.singleton("Tom"));
		 System.out.println(namelist);
		 
		 ArrayList<Integer>numbers1=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));
		 
		 ArrayList<Integer>sublist=new ArrayList<Integer>(numbers1.subList(2,6));
		 System.out.println(sublist);
		 
		 //to array
		 ArrayList<String>newlist=new ArrayList<String>(Arrays.asList("Naveen","Tom","steve","Lisa","Robert"));
		 
		 Object arr[]=newlist.toArray();
		
		 System.out.println(Arrays.toString(arr));
		 
		 for(Object o:arr)
		 {
			System.out.println((String)o); 
		 }
		 
		 
		 
		 
		
	}

}
