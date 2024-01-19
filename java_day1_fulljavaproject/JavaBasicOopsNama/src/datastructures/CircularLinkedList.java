package datastructures;
//Example 3:
//Java program to demonstrate the creation of a circular Linked list in Java and 
//insertion of elements into the list and then display the elements of the list as the 
//output on the screen:

public class CircularLinkedList

{  

    //defining a node in circular linked list  

    public class Node

    {  

        int data;  

        Node next;  

        public Node(int data) 

        {  

            this.data = data;  

        }  

    }   

    //defining the head and tail of the circular linked list and assigning it to Null

    public Node head = null;  

    public Node tail = null;  

    //defining insert() function to insert the data into the list  

    public void insert(int data)

    {  

        //creating a new node called newNode 

        Node newNode = new Node(data);  

        //checking if the given list is empty   

        if(head == null) 

        {  

//If list is empty, making both the head and tail point to the newNode and the next pointer of newNode to head  

            head = newNode;  

            tail = newNode;  

            newNode.next = head;  

        }  

        else 

        {  

            //otherwise the next pointer of the tail is made the newNode

            tail.next = newNode;  

            //and the newNode is made the tail of the list  

            tail = newNode;  

//and the next pointer of the tail is made to point to the head of the list as it is a circular linked list

            tail.next = head;  

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

        }  

        else 

        {  

            //otherwise printing each element in the list

            System.out.println("The data in the circular linked list are: ");  

             do{  

                 //printing each data in the list and next pointer pointing to the next node   

                System.out.print(" "+ current.data);  

                current = current.next;  

            }

            while(current != head);  

            System.out.println();  

        }  

    }   

    public static void main(String[] args) 

    {  

         //defining a new circular linked list

        CircularLinkedList newList = new CircularLinkedList();  

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