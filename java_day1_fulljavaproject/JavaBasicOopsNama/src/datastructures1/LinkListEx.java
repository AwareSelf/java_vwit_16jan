package datastructures1;

public class LinkListEx {

	public static void main(String[] args) {
		
		LinkList l = new LinkList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.display();
		
	//	l.delete(10);
	//	l.delete(30);
		l.delete(40);
		l.display();
		

	}

}


class LinkList
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
	
	Node head = null;
	
	
	void add(int data)
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
	
	void delete(int data)
	{
		
	   Node current = head;
	   
	   if(current!=null)
	   {
		   if(current.data==data && current.next==null)
		   {
			   head=null;
		   }
		   else if(current.data==data && current.next!=null)
		   {
			   head = head.next;
		   }
		   else 
		   {
			   
			   while(current.next!=null)
			   {
				   Node temp = current.next;
			      if(temp.data == data)
			      {
			    	  System.out.println("data :"+data+" found");
			    	  current.next = temp.next;
			      }
			      
			      if(current.next!=null)
			         current = current.next;
			   }
		   }
	   }
	}
	
	
	void display()
	{
		Node current = head;
		
		while(current!=null)
		{
			System.out.print(current.data+" -->");
			current = current.next;
			
		}
		
		System.out.println("Null");
	}
}
