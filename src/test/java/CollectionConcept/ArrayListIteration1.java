package CollectionConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration1 {

	public static void main(String[] args) {
		
		ArrayList<String>tvseries=new ArrayList<String>();
		tvseries.add("Game of trones");
		tvseries.add("Breaking Bad");
		tvseries.add("The big Bang Theory");
		tvseries.add("prision Break");
		
		tvseries.forEach(shows->{
			System.out.println(shows);
		});
		System.out.println("print using iterator");
		
		Iterator<String>it=tvseries.iterator();
		while(it.hasNext())
		{
			String shows=it.next();
			System.out.println(shows);
		}
		
		System.out.println("print using iterator&for each remaining method");
		it=tvseries.iterator();
		it.forEachRemaining(shows->{
			System.out.println(shows);
		});
		
		//using for each loop
		System.out.println("print for loop");
		for(String e:tvseries)
		{
			System.out.println(e);
		}
		
		//for loop for order
		for(int i=0;i<tvseries.size();i++)
		{
			System.out.println(tvseries.get(i));
		}
		
		//listIterator to traverse both direction
		ListIterator<String>tvseriesListIterator=tvseries.listIterator(tvseries.size());
		
		System.out.println("--------");
	
		while(tvseriesListIterator.hasPrevious())
		{
			String show=tvseriesListIterator.previous();
			System.out.println(show);
		}
	}

}
