package CollectionConcept;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class HashMapSync {

	public static void main(String[] args) 
	{
		//synchrnized method
		Map<String,String>map1 =new HashMap<String,String>();
		
		map1.put("1","naveen");
		map1.put("2","tom");
		map1.put("3","lisa");
		
		//synchrnized map
		Map<String,String>syncmap =Collections.synchronizedMap(map1);
		
		System.out.println(syncmap);
		
		//concurrent hash map
		ConcurrentHashMap<String,String>concurrentmap =new ConcurrentHashMap<>();
		
		concurrentmap.put("A","java");
		concurrentmap.put("B","python");
		concurrentmap.put("C","ruby");
		
		
		System.out.println(concurrentmap.get("A"));
		
		
		
		
		
		
	}

}
