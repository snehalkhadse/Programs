package CollectionConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args)
	{
		
		
		for(int i=0;i<studlist.size();i++)
		{
			System.out.println(studlist.get(i));
		}
		
		//for each
		for(String e:studlist)
		{
			System.out.println(e);
		}
		
		//studlist.stream().forEach(ele->System.out.println(ele));
		
		//iterator
		Iterator<String>it=studlist.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
