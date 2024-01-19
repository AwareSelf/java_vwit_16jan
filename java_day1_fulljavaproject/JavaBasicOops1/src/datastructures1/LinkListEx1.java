package datastructures1;

public class LinkListEx1 {

	public static void main(String[] args) {
		
		LinkLst ls = new LinkLst();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ls.display();
		
		//ls.delete(10);
		
		ls.display();

	}

}


class LinkLst
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
		 //data = 40;
		 //head = 10,null
		 //newnode = 40,null
		 
		 Node newnode = new Node(data);
		 Node current = null;
				 
		 if(head==null)
		 {
			 head = newnode;
		 }
		 else
		 {
			 current = head; //current = 10
			 while(current.next!=null)
			 {
				 current = current.next;  //current = 30
			 }
			 
			 current.next = newnode; //current=40
		 }
		 
	 }
	 
	 void delete(int data)
	 {
		
		 boolean flag=false;
         Node current = head;
		 
         if(current.next==null)
         {
        	 if(current.data == data)
        	 {
                 head=null;		 
        	 }
         }
         else
         {
        	 current = head;
		   while(current!=null)
		  {
			 if(current.next.data == data)
			 {
				 flag=true;
				 Node temp = current.next;
				 current.next = temp.next;
				 break;
				 
			 }
			  current = current.next;
		  }
        }//else
		 
         if(flag)
         {
        	 System.out.println("data:"+data+" found and deleted..");
         }
         else
         {
        	 System.out.println("data:"+data+" not found in LinkedList..");
         }
	 }
	 
	 void display()
	 {
		 Node current = null;
		 
		 current = head;
		 
		 while(current!=null)
		 {
			 System.out.print(current.data+" --> ");
			 current = current.next;
		 }
		 
		 System.out.println("Null");
		 
	 }
	
}
