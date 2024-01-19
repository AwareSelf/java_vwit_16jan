package datastructures;

//Example 2:
//Java program to demonstrate the creation of a doubly Linked list in Java and insertion 
//of elements into the list and then display the elements of the list as the output on 
//the screen:

public class DoublyLinkedList 

{    

    //defining a node in a doubly linked list 

    class Node

    {  

        int data;  

        Node previous;  

        Node next;   

        public Node(int data)

        {  

            this.data = data;  

        }  

    }   

    //defining the head and tail of the doubly linked list and assigning it to Null

    Node head, tail = null;   

    //defining insert() function to insert the data into the list  

    public void insert(int data)

    {  

        //creating a new node called newNode  

        Node newNode = new Node(data);   

        //checking if the given list is empty 

        if(head == null) 

        {  

            //if the lists empty, making both head and tail of the list to point to the newNode  

            head = tail = newNode;  

            //the previous pointer of head will point to null  

            head.previous = null;  

            //the next pointer of tail will point to the null 

            tail.next = null;  

        }  

        else 

        {  

            //otherwise the next pointer of tail will point to the newNode  

            tail.next = newNode;  

            //the previous pointer of the newNode will point to the tail  

            newNode.previous = tail;  

            //and the newNode is made the tail of the list  

            tail = newNode;  

//and the next pointer of tail is made to point to null indicating it is the last node of the list  

            tail.next = null;  

        }  

    }  

  

    //defining displaylist() function to display the data in the list  

    public void displaylist() 

    {  

        //defining a node called current and assigning the head of the list to it 

        Node current = head; 

        //checking if the head/list is empty

        if(head == null) 

        {  

            System.out.println("The given list is empty");  

            return;  

        }  

        //otherwise printing each element in the list

        System.out.println("The data in the doubly linked list are: ");  

        while(current != null) 

        {  

            //printing each data in the list and next pointer pointing to the next node 

            System.out.print(current.data + " ");  

            current = current.next;  

        }  

    } 

    public static void main(String[] args)

    {  

        //defining a new doubly linked list

        DoublyLinkedList newList = new DoublyLinkedList();  

        //inserting data into the list by calling insert() function

        newList.insert(10);  

        newList.insert(30);  

        newList.insert(50);  

        newList.insert(70);  

        newList.insert(100);   

        //displaying the data in the list by calling displaylist() function

        newList.displaylist();  

    }  

}  