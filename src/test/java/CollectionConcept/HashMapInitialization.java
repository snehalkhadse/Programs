package CollectionConcept;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapInitialization {

	
	public static  Map<String,Integer>marksmap;
	static
	{
		marksmap=new HashMap<>();
		marksmap.put("A",100);
		marksmap.put("B",200);
	}
	public static void main(String[] args) 
	{
		HashMap<String,String>map1=new HashMap<>();
		Map<String,String>map2=new HashMap<>();
		
		//static way
		System.out.println(HashMapInitialization.marksmap.get("A"));
		
		//immutable map
		Map<String,Integer>map3=Collections.singletonMap("test",100);
		System.out.println(map3.get("test"));
		//map3.put("abc",200);
		
		//jdk8
		Map<String,String>map4=Stream.of(new String[] [] {
			{"tom","A Grade"},
			{"naveen","A+ Grade"},
		}).collect(Collectors.toMap(data->data[0],data->data[1]));
		
	   System.out.println(map4.get("tom"));
	   map4.put("lisa","A++ Grade");
	   
	   System.out.println(map4.get("lisa"));
	   
	   
	   //using simple entry
	   Map<String,String>map5=Stream.of(
			   new AbstractMap.SimpleImmutableEntry<>("naveen","java"),
			   new AbstractMap.SimpleImmutableEntry<>("tom","python"))
			   .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
	   
	   			System.out.println(map5.get("tom"));
	   			map5.put("steve","ruby");
	   			System.out.println(map5.get("steve"));
			   
			   //jdk 1.9
			  // empty map
			   Map<String,String>emptymap=Map.of();
			   //emptymap.put("tom","python");
			   
			  // System.out.println(emptymap.get("tom"));
			   
			 //singleton method
			Map<String,String>singletonmap =Map.of("k1","v1");
			 System.out.println(singletonmap.get("k1"));
			 
			 //singletonmap1.put("k2", "v2");
			 
			 //multivalue max 10 par=irs store
			 Map<String,String>multimap=Map.of("k1","v1","k2","v2","k3","v3");
			 
			 
			 //ofEntries method
			 
			 Map<String,Integer>
			 map7=Map.ofEntries(new AbstractMap.SimpleEntry<>("A",100),
					 new AbstractMap.SimpleEntry<>("B",200),
					 new AbstractMap.SimpleEntry<>("C",300));
			 
			 System.out.println(map7.get("C"));
			 
			 //maps using Guava
			 Map<String,String>titlemaps=ImmutableMap.Of("Google","Amazon","Amazon Shopping");
			 System.out.println(titlemaps.get("Amazon"));
			 
			 
	   
	   
	   
	   
	}
	private static Map<String, String> ImmutableMapOf(String string, String string2, String string3) {
		// TODO Auto-generated method stub
		return null;
	}

}
