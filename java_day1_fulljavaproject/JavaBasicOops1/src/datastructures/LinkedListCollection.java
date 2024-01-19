//Java program to demonstrate the creation of an empty linked list using LinkedList(Collection C) constructor:

package datastructures;

 import java.util.*;  

 import java.util.ArrayList;

 import java.util.LinkedList;

 //defining a class called demo

 public class LinkedListCollection

 {    

     //main method is called    

    public static void main(String[] args)

     {         

        // defining a string arraylist collection

         ArrayList<String> collect = new ArrayList<String>();

         collect.add("Lets");

         collect.add("learn");

         collect.add("DataStructures");      

//passing the collection as a parameter to the LinkedList constructor

         LinkedList List2 = new LinkedList(collect);

         //displaying the elements of the list

         System.out.println("The new linked list is: " + List2);

    }    

}    
 
/*
There are several methods associated with a Linked List in Java. Some of them are:

add()
The add() method is used to insert elements into the list.

addFirst()
The addFirst() method is used to insert elements to the beginning of the list.

 addLast()
The addLast() method is used to insert elements at the end of the list.

remove()
The remove() method is used to remove the elements from the list. 

removeFirst()
The removeFirst() method is used to remove the elements from the beginning of the list.

 removeLast()
The removeFirst() method is used to remove the elements from the end of the list.

 getFirst()
The getFirst() method is used to get the elements from the beginning of the list.

 getLast()
The getLast() method is used to get the elements from the end of the list.

clear()
The clear() method is used to remove all the elements from the list.

clone()
A shallow copy of the linked list is returned using clone() method.

peek()
The head of the list is retrieved using peek() method.

peekFirst()
The first element of the list is retrieved using peekFirst() method.

peekLast()
The last element of the list is retrieved using peekLast() method.

poll()
The head of the list is retrieved and removed using poll() method.

pollFirst()
The first element of the list is retrieved and removed using pollFirst() method.

pollLast()
The last element of the list is retrieved and removed using pollLast() method.

size()
The number of elements present in the list is returned using size() method.

get(int index)
The element present at the position specified by the index is returned using get(int index) method.

element()
The head of the list is retrieved but not removed using element() method.

 */
 
