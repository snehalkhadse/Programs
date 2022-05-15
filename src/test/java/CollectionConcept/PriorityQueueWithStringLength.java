package CollectionConcept;

import java.util.Comparator;
import java.util.PriorityQueue;



	
	class MyComparator implements Comparator<String>
	{
		@Override
		public int compare(String s1, String s2) {
			
			return s2.length()-s1.length();
		}
	}
	public class PriorityQueueWithStringLength {
		
	public static void main(String[] args) {
		MyComparator comparator=new MyComparator();
		PriorityQueue<String> pr=new PriorityQueue<String>(10,comparator);
		pr.add("naveen");
		pr.add("naveentest");
		pr.add("naveen automation");
		pr.add("N");
		pr.add("nav");
		
		System.out.println(pr.poll());
	}

}
