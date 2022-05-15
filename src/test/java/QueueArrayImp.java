
public class QueueArrayImp {
	
	int capacity;
	int queuearr[];
	int front;
	int rear;
	int currentsize;
	
	public QueueArrayImp(int sizeofqueue)
	{
		this.capacity= sizeofqueue;
		front=0;
		rear=-1;
		queuearr=new int[this.capacity];
	}
	
	public boolean isFull()
	{
		if(currentsize==capacity)
		{
			return true;
		}
		return false;
	}
	
	public boolean isEmpty()
	{
		if(currentsize==0)
		{
			return true;
		}
		return false;
	}
	
	
	public void enqueue(int data)
	{
		if(isFull())
		{
			System.out.println("hey,queue is full,can not insert data");
			
		}
		else
		{
			rear++;
			if(rear==capacity-1)
			{
				rear=0;
				
			}
			queuearr[rear]=data;
			currentsize++;
			System.out.println(data+"added to queue");
			
			
		}
	}
	
	
	public void dqueue()
	{
		if(isEmpty())
		{
			System.out.println("hey,queue is empty,can not delete data");
			
		}
		else
		{
			front++;
			if(front==capacity-1)
			{
				System.out.println(queuearr[front-1]+"removed from queue");
				front=0;
				
			}
			else
			{
				System.out.println(queuearr[front-1]+"removed from queue");
				
			}
			
		}
		
	}
	
	
	public static void main(String[] args) {
		 QueueArrayImp obj=new  QueueArrayImp(10);
		 obj.enqueue(10);
		 obj.enqueue(20);
		 obj.enqueue(30);
		 obj.dqueue();
		 
		 obj.enqueue(40);
		 obj.dqueue();
		 
		 
		 obj.enqueue(50);
		 obj.enqueue(60);
		 obj.dqueue();
		 
		 obj.enqueue(70);
		 obj.enqueue(80);
		 obj.dqueue(); 
		 
	}

}
