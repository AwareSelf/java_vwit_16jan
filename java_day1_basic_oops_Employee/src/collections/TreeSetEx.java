package collections;

import java.util.*;

import nama.basic.java.Employee;

public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Set<String> st = new TreeSet<String>();
		st.add("Namrata");
		st.add("Piyush");
		st.add("Aditya");
		st.add("Mohak");
		
		System.out.println(st);
		*/
		
		//Sorted Set of Employees
		
		Employee e1 = new Employee(1,"Ram",50000.0,10);
		Employee e2 = new Employee(4,"Rahim",80000.0,10);
	    Employee e3 = new Employee(2,"Nina",40000.0,20);
	    Employee e4 = new Employee(7,"Tina",70000.0,20);
	    Employee e5 = new Employee(5,"Umesh",60000.0,30);
	    
	    
		Set<Employee> st1 = new TreeSet<Employee>();
		st1.add(e1);
		st1.add(e2);
		st1.add(e3);
		st1.add(e4);
		st1.add(e5);
		st1.add(new Employee(5,"Umesh",60000.0,30));
		System.out.println(st1);
		
		
		//when to use Comparator interface - when you have to sort on different basis than what is being used in Comparable interface
		//pass Comparator instance to TreeSet constructor so as it will sort on basis of Comparator thats added
		
	   /*
		Comparator<Employee> cmp = new OneMoreWayCompare();
		Set<Employee> st2 = new TreeSet<Employee>(cmp);
		*/
		Set<Employee> st2 = new TreeSet<Employee>(new OneMoreWayCompare()); 
		st2.add(e1);
		st2.add(e2);
		st2.add(e3);
		st2.add(e4);
		st2.add(e5);
		st2.add(new Employee(5,"Umesh",60000.0,30));
		System.out.println(st2);
		
		
		
		
		

	}

}
