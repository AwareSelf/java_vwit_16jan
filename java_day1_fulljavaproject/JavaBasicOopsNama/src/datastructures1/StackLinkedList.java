package datastructures1;
public class StackLinkedList
{
	public static void main(String[] args) {
		Stack st=new Stack();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
	    int no = st.pop();
	    System.out.println(no);
	    System.out.println(st.pop());
	    
	    System.out.println("remaining elements in the stack..");
	    st.display();
		
 
	}
	
}
class Stack
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
	void push(int data)
	{
		Node newnode=new Node(data);
		newnode.next=this.head;
		head=newnode;
	}
	
	
	int pop()
	{
		//return data from head node
		if(head!=null) {
			int val = head.data;
			System.out.println("popped value:"+val);
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