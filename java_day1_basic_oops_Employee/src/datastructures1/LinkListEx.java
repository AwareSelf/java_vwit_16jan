package datastructures1;

public class LinkListEx {

	public static void main(String[] args) {
		
		LinkList l = new LinkList();
		l.add(10);
		l.add(20);
		l.add(30);
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
	
	
	void display()
	{
		Node current = head;
		
		while(current!=null)
		{
			System.out.println(current.data);
			current = current.next;
			
		}
		
		System.out.println("Null");
	}
}
