package CollectionConcept;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
public class PriorityQueueJavaObject
{
	public static void main(String[] args) {
		
		EmpComparator comparator=new EmpComparator();
		PriorityQueue<Employee1> pr=new PriorityQueue<Employee1>(10,comparator);
		pr.add(new Employee1("A",300));
		pr.add(new Employee1("B",200));
		pr.add(new Employee1("C",4000));
		pr.add(new Employee1("D",50));
		pr.add(new Employee1("E",10));
		pr.add(new Employee1("F",3500));
		pr.add(new Employee1("G",50000));
		
		System.out.println(pr.poll());
		System.out.println(pr);
}

		
		

}
