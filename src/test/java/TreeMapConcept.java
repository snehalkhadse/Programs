import java.util.Comparator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapConcept {

	public static void main(String[] args) 
	{
		TreeMap<Integer,String>map= new TreeMap<>();
		map.put(1000,"Tom");
		map.put(2000,"peter");
		map.put(3000,"steve");
		map.put(4000,"naveen");
		map.put(11000,"rubby");
		
		System.out.println(map);
		map.forEach((k,v) -> System.out.println("key="+k+"value="+v));
		System.out.println(map.lastKey());
		System.out.println(map.firstKey());
		
		//map.headMap(3000).keySet();
		
		Set<Integer> keylessthan3k=map.headMap(3000).keySet();
		System.out.println(keylessthan3k);
		
		Set<Integer>keylessGr3k=map.tailMap(3000).keySet();
		System.out.println(keylessGr3k);
		
		TreeMap<String,Integer>usermap=new TreeMap<>();
		usermap.put("james",100);
		usermap.put("brad",100);
		usermap.put("Albert",400);
		usermap.put("george",50);
		usermap.put("larry",900);
		usermap.put("ted",120);
		usermap.put("paul",250);
		
		usermap.forEach((k,v)->System.out.println("key="+k+"value="+v));
		
		TreeMap<Integer,String>map1= new TreeMap<>(Comparator.reverseOrder());
		map1.put(1000,"Tom");
		map1.put(2000,"peter");
		map1.put(3000,"steve");
		map1.put(4000,"naveen");
		map1.put(11000,"rubby");
		
		System.out.println(map1);
	}	
		

}
