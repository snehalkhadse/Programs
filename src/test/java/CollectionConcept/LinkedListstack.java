package CollectionConcept;

public class LinkedListstack {

	Node head;
	class Node
	{
		int value;
		Node next;
		
	}
	LinkedListstack ()
	{
		head=null;
	}
	
	public void push(int value)
	{
		Node extrahead=head;
		head=new Node();
		head.value=value;
		head.next=extrahead;
		
	}
	public int pop()
	{
		if(head==null)
		{
			System.out.println("stack is empty");
		}
		int value=head.value;
		head=head.next;
		return value;
	}
	
	public static void printList(Node head)
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp);
			
		}
	}
	public static void main(String[] args) 
	{
		LinkedListstack  lts=new LinkedListstack ();
		System.out.println(lts.pop());
		
		lts.push(10);
		lts.push(20);
		lts.push(30);
		lts.push(40);
		lts.push(50);
		
		System.out.println("element removed or poped from stack:"+lts.pop());
		System.out.println("element removed or poped from stack:"+lts.pop());
		
		lts.push(45);
		System.out.println("element removed or poped from stack:"+lts.pop());
		
		//printList(lts.head);
		
		
	}

}
