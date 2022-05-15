package CollectionConcept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics {

	public static void main(String[] args) 
	{
		HashMap<String,String> capitalmap=new HashMap<String,String>();
		capitalmap.put("india", "New Delhi");
		capitalmap.put("USA", "Washington");
		capitalmap.put("UK", "London");
				
		capitalmap.put("UK", "London1");
				
		capitalmap.put("null", "LA");
		capitalmap.put("null", "Berlin");
		capitalmap.put("Russia", null);
		capitalmap.put("France", null);
		//capitalmap.remove("France");
		
		System.out.println(capitalmap.get("USA"));
		System.out.println(capitalmap.get("UK"));
		System.out.println(capitalmap.get(null));
		System.out.println(capitalmap.get("France"));		
		
		//iterator
		
		Iterator<String>it=capitalmap.keySet().iterator();
		while(it.hasNext())
		{
				String key=it.next();
				String value=capitalmap.get(key);
				System.out.println("key="+key+"value="+value);
					
		}
		
		//iterator set pair
		
		Iterator<Entry<String,String>>it1=capitalmap.entrySet().iterator();
		
		while(it1.hasNext())
		{
				Entry<String,String>entry=it1.next();
				
				System.out.println("key="+entry.getKey()+"and value="+entry.getValue());
					
		}
		
		//lambda for each loop
		capitalmap.forEach((k,v)->System.out.println("key="+k+"value="+v));
		
		
		
		
		
				
		
	}

}
