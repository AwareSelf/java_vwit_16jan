package datastructures;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;  
public class StackEx
{  
public static void main(String[] args)   
{  
//creating an instance of Stack class  
Stack<Integer> stk= new Stack<>();  
// checking stack is empty or not  
boolean result = stk.empty();  
System.out.println("Is the stack empty? " + result);  
// pushing elements into stack  
stk.push(78);  
stk.push(113);  
stk.push(90);  
stk.push(120);  
//prints elements of the stack  
System.out.println("Elements in Stack: " + stk);  
result = stk.empty();  
System.out.println("Is the stack empty? " + result); 

//------------------------------------------------
Stack<String> stk1= new Stack<>();  
//pushing elements into Stack  
stk1.push("Apple");  
stk1.push("Grapes");  
stk1.push("Mango");  
stk1.push("Orange");  
System.out.println("Stack: " + stk1);  
//Access element from the top of the stack  
String fruits = stk1.peek();  
//prints stack  
System.out.println("Element at top: " + fruits);  

//Search an element  
int location = stk1.search("Mango");  
System.out.println("Location of Dell: " + location);  

//Checks the Stack is empty or not  
boolean rslt=stk1.empty();  
System.out.println("Is the stack empty or not? " +rslt);  
//Find the size of the Stack  
int x=stk1.size();  
System.out.println("The stack size is: "+x);  

//iteration over the stack  
Iterator<String> iterator = stk1.iterator();  
while(iterator.hasNext())  
{  
Object values = iterator.next();  
System.out.println(values);   
}     


System.out.println("Iteration over the stack using forEach() Method:");  
//invoking forEach() method for iteration over the stack  
stk.forEach(n ->  
{  
System.out.println(n);  
});  

ListIterator<String> ListIterator = stk1.listIterator(stk1.size());  
System.out.println("Iteration over the Stack from top to bottom:");  
while (ListIterator.hasPrevious())   
{  
String frtname = ListIterator.previous();  
System.out.println(frtname);  
}  
}  
}  