package CollectionConcept;

import java.util.AbstractSequentialList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args)
	{
		LinkedList<String>l1=new LinkedList<String>();
		l1.add("test");
		l1.add("Qtp");
		l1.add("selenium");
		l1.add("RPA");
		l1.add("RPT");
		
		System.out.println("contents of linked list"+l1);
		
		l1.addFirst("Naveen");
		
		l1.addLast("Automation");
		System.out.println("Contents of linked list:"+l1);
		
		System.out.println(l1.get(0));
		
		l1.set(0,"Tom");
		System.out.println(l1.get(0));
		
		l1.removeFirst();
		l1.removeLast();
		System.out.println("Contents of linked list:"+l1);
		
		l1.remove(2);
		System.out.println("Contents of linked list:"+l1);
		
		
		//how to iterate/print value
		System.out.println("using for loop");
		
		for(int n=0;n<l1.size();n++)
		{
			System.out.println(l1.get(n));
		}
		
		System.out.println("using advance for loop");
		
		for(String str:l1)
		{
			System.out.println(str);
		}
		
		//iterator
		System.out.println("using iterator");
		Iterator<String>it=l1.iterator();
		while(it.hasNext())
		{
				
			System.out.println(it.next());
		}
		
		System.out.println("------");
		
		int num=0;
		while(l1.size()>num)
		{
			System.out.println(l1.get(num));
			num++;
		}
		
		System.out.println("------");
		//reverse linked list
		Iterator<String>it1=l1.descendingIterator();
		while(it1.hasNext())
		{
				
			System.out.println(it1.next());
		}
		
		/*for(String e:l1)
		{
			System.out.println(e);
		}*/
	
		
		//sort
		Collections.sort(l1);
		System.out.println(l1);

	}

}
