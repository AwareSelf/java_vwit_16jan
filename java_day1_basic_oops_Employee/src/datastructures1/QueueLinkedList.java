package datastructures1;



public class QueueLinkedList
{
	public static void main(String[] args) {
		Queue q=new Queue();
		q.offer(10);
		q.offer(20);
		q.offer(30);
		q.offer(40);
		q.offer(50);
	    int no = q.poll();
	    System.out.println(no);
	    System.out.println(q.poll());
	    
	    System.out.println("remaining elements in the queue..");
	    q.display();
		
 
	}
	
}
class Queue
{
	
	
	class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			
			this.next = null;
		}
			
	}
	Node head=null;
	void offer(int data)
	{
		Node newnode = new Node(data);
		
		if(head==null)
		{
		    head = newnode;	
		}
		else
		{
			Node current = head;
			while(current.next!=null)
			{
				current = current.next;
			}
			
			current.next =  newnode;
		}
	}
	
	
	int poll()
	{
		//return data from head node
		if(head!=null) {
			int val = head.data;
			System.out.println("polled value:"+val);
			head=head.next;
			return val;
		}
		else
		{
			return -1;
		}
	}
	void display() {
		Node current=head;
		while(current!=null) {
			System.out.println(current.data);
			current=current.next;
		}
	}
	
	
}