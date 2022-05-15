package CollectionConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SychronizedarrayList {

	public static void main(String[] args) 
	{
		List<String>namesList=Collections.synchronizedList(new ArrayList<String>());
		namesList.add("java");
		namesList.add("python");
		namesList.add("rubby");
		
		synchronized(namesList)
		{
			Iterator<String> it=namesList.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
		}

		
		
		//copy on writeArrayList
		
		CopyOnWriteArrayList<String> empList=new CopyOnWriteArrayList<String>();
		empList.add("tom");
		empList.add("steve");
		empList.add("naveen");
		
		Iterator<String>it=empList.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
		
	

}
