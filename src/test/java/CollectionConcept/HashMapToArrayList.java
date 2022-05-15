package CollectionConcept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapToArrayList {

	public static void main(String[] args)
	{
		HashMap<String,Integer>compmap =new HashMap<String,Integer>();
		compmap.put("Google",10000);
		compmap.put("walmart",20000);
		compmap.put("amazon",30000);
		compmap.put("facebook",50000);
		compmap.put("cisco",150000);
		
		System.out.println("comp map size"+compmap.size());
		
		
		Iterator it=compmap.entrySet().iterator();
		
		while(it.hasNext())
		{
			Map.Entry pairs=(Map.Entry)it.next();
			System.out.println(pairs.getKey()+"="+pairs.getValue());
			
		}
		//hash map to array list
		List<String>compnamelist=new ArrayList<String>(compmap.keySet());
		for(String t:compnamelist)
		{
			System.out.println(t);
		}
		//convert hashmap values to arrayList
		List<Integer>empvalueslist=new ArrayList<Integer>(compmap.values());
		System.out.println("total employee values count="+empvalueslist.size());
		
		for(Integer e:empvalueslist)
		{
			System.out.println(e);
		}
		
	}
		
}

