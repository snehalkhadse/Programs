
public class StackImp 
{

	
		
		int size;
		int arr[];
		int top;
		
		StackImp(int size)
		{
			this.size=size;
			this.arr=new int[size];
			this.top=-1;
		}
		
		
		
		public int peek()
		{
			if(!this.isEmpty())
			{
				return arr[top];
				
			}
			else
			{
				System.out.println("stack is empty");
				return -1;
			}
		}
		
		public void push(int element)
		{
			if(!isFull())
			{
				top++;
				arr[top]=element;
				System.out.println("pushed element:"+element);
			}
			else
			{
				System.out.println("stack is full now");
			}
				
		}
		
		public int pop()
		{
			if(!isEmpty())
			{
				int returnTop=top;
				top--;
				System.out.println("poped element:"+arr[returnTop]);
				return(arr[returnTop]);
			}
			else
			{
				System.out.println("stack is Empty");
				return -1;
			}
		
		}
		public boolean isEmpty()
		{
			return(top==-1);
			
		}
		public boolean isFull()
		{
			return(size-1==top);
			
		}


public static void main(String[] args) 
{
				
				StackImp stackimp = new StackImp(10);
				stackimp.pop();
				System.out.println("---------");
				
				stackimp.push(100);
				stackimp.push(200);
				stackimp.push(300);
				stackimp.push(400);
				
				System.out.println("---------");
				System.out.println(stackimp.peek());
				stackimp.pop();
				System.out.println(stackimp.isEmpty());
				System.out.println(stackimp.isFull());
				
		
	

}
}