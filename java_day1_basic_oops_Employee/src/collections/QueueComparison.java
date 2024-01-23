package collections;

import java.util.*;

import nama.basic.java.Employee;

public class QueueComparison {
    public static void main(String[] args) {
    	
    	/*
        // Step 1: Create a PriorityQueue and a LinkedList
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        Queue<Integer> linkedList = new LinkedList<>();

        // Step 2: Add elements to the PriorityQueue
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(15);

        // Step 3: Add elements to the LinkedList
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(15);

        // Step 4: Peek the head of each queue
        System.out.println("Head of PriorityQueue: " + priorityQueue.poll());
        System.out.println("Head of LinkedList: " + linkedList.poll());
        
        System.out.println("Head of PriorityQueue: " + priorityQueue.poll());
        System.out.println("Head of LinkedList: " + linkedList.poll());


        // Step 6: Print the queues after removal
        System.out.println("PriorityQueue after removal: " + priorityQueue);
        System.out.println("LinkedList after removal: " + linkedList);
        
       */
    	
    	func(null); //pass null for Comparator - it will priortize on basis of Comparable intf of element
       
        System.out.println("priority basis of empsalary");
        Comparator<Employee> cmp = (Employee e1,Employee e2)->(int)(e1.getEmpSalary() - e2.getEmpSalary());
        func(cmp);
        
        System.out.println("priority basis of empname");
        cmp = (Employee e1,Employee e2)->e1.getEmpName().compareTo(e2.getEmpName());
        func(cmp);
       
 
        
        
    }
    
    
    static void func(Comparator<Employee> cmp)
    {
    	 
        Queue<Employee> qemp = new PriorityQueue<Employee> (cmp);
		Employee e1 = new Employee(1,"Ram",50000.0,10);
		Employee e2 = new Employee(4,"Rahim",80000.0,10);
	    Employee e3 = new Employee(2,"Nina",40000.0,20);
	    Employee e4 = new Employee(7,"Tina",70000.0,20);
	    Employee e5 = new Employee(5,"Umesh",60000.0,30);
	    
	    qemp.offer(e1);
	    qemp.offer(e2);
	    qemp.offer(e3);
	    qemp.offer(e4);
	    qemp.offer(e5);
	    
	    while(!qemp.isEmpty())
	    	System.out.println(qemp.poll());
    }
}
