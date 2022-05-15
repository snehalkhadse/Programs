package CollectionConcept;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) 
	{
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(1, "selenium");
		hm.put(2, "QTP");
		hm.put(3, "test complete");
		hm.put(4, "RMT");
		
		System.out.println(hm.get(1));
		
		System.out.println(hm.get(5));//null
		
		for(Entry m : hm.entrySet())
		{
			
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		hm.remove(3);
		System.out.println(hm);
		
		HashMap<Integer,Employee> emp=new HashMap<Integer,Employee>();
		Employee e1=new Employee("tom",25,"QA");
		
		Employee e2=new Employee("peter",27,"dev");
		
		Employee e3=new Employee("steve",28,"admin");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		

		
		//traverse Hashmap
		for(Entry<Integer,Employee>m:emp.entrySet())
		{
			int key=m.getKey();
			Employee e=m.getValue();
		
			System.out.println("employee="+key+"info:");
			System.out.println(e.name+" "+e.age+" "+e.dept);
			
		}
		
		
	}

}
