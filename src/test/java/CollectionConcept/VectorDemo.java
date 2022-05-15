package CollectionConcept;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) 
	{
		Vector<Integer>myvector=new Vector<Integer>();
		myvector.add(2);
		myvector.add(4);
		myvector.add(6);
		myvector.add(8);
		myvector.add(10);
		myvector.add(12);
		myvector.add(14);
		myvector.add(16);
		
		System.out.println(myvector);
		System.out.println(myvector.get(2));
		
		myvector.remove(3);
		System.out.println(myvector);
		
		Vector<Integer>yourvector=new Vector<Integer>();
		yourvector.add(10);
		yourvector.add(20);
		
		myvector.addAll(yourvector);
		System.out.println(myvector);
		
		for(Integer e:myvector)
		{
			System.out.println(e);
			
		}
		
		for(int p=0;p<myvector.size();p++)
		{
			System.out.println(myvector.get(p));
			
		}
		
		Iterator<Integer>it=myvector.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}
		
		Collections.sort(myvector);
		System.out.println(myvector);
		
	}

}
