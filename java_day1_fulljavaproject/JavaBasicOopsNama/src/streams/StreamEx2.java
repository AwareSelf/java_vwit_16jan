package streams;


import java.util.*;
import java.util.function.Consumer;
import java.util.stream.*;

import nama.basic.java.Employee;

public class StreamEx2 {

	public static void main(String[] args) {
		
		List<Integer> lst = new ArrayList<Integer>();
	 	System.out.println(lst.isEmpty());
		lst.add(20); //java 1.5 compiler --> primitive 20 -> Integer object 20 --> wrap/autoboxing --> added to collection
		lst.add(20);
		lst.add(10);
		lst.add(60);
		lst.add(80);
		lst.add(4);
		
		System.out.println(lst);
		
		//create a stream from collection
		Stream<Integer> str = lst.stream();
		
		//find total no of int in lst
		System.out.println("find total no of int values in lst collection:");
		System.out.println(str.count()); //count terminal operation - stream close
		
		//as str stream is closed you cannot use it, it will throw exception if u use it

		//find total of all int values in this lst collection
		//reduce func is terminal operation , find single resultant aggregate value for all elements in collection
		System.out.println("find total of all int values in this lst collection:");
		int total = lst.stream().reduce(0,(a,b)->a+b); 
		System.out.println("sum of all int values in collection is:"+total);
		
		//sort all elements in lst collection in ascending order and display it
		System.out.println("sort all elements in lst collection in ascending order and display it:");
		lst.stream().sorted().forEach((Integer i)->System.out.println(i));
		
		System.out.println("list all elements in ascending order eliminating duplicates..:");
		//sort all elements in lst collection in ascending order and display it, eliminating the duplicates
		lst.stream().distinct().sorted().forEach((Integer i)->System.out.println(i));
		
		System.out.println("sort all elements in lst collection in descending order and display it:");
		lst.stream().sorted((Integer a,Integer b)->b-a).forEach((Integer i)->System.out.println(i));
		
		
	
		System.out.println("Create a List of Employees and display it:");
		List<Employee> lst1 = new ArrayList<Employee>();
	  	
		Employee e1 = new Employee(1,"Ram",50000.0,10);
		lst1.add(e1); 
		e1 = new Employee(2,"Shyam",60000.0,20);
		lst1.add(e1);
		e1 = new Employee(4,"Mita",60000.0,20);
		lst1.add(e1);
		Employee e2 = new Employee(3,"Radha",70000.0,10);
		lst1.add(e2);
		e2 = new Employee(5,"Rita",70000.0,10);
		lst1.add(e2);
		lst1.add(new Employee(3,"Radha",70000.0,10));
		System.out.println(lst1);
		
		System.out.println("From list of Employee, extract all names by eliminating duplicates.. ");
		Set<String> empnames = lst1.stream().map((Employee e)->e.getEmpName()).collect(Collectors.toSet());
		System.out.println(empnames);
		
		System.out.println("converting set into sortedset:empnames(set)-->empnamessorted(sortedset)");
		SortedSet<String> empnamessorted = new TreeSet<String>(empnames);
		System.out.println(empnamessorted);
		

		System.out.println("Create a group of emp names of all Employees by eliminating duplicates whose deptno is 10.. ");
		Set<String> empnames1 = lst1.stream().filter((Employee e)->e.getDeptno()==10).map((Employee e)->e.getEmpName()).collect(Collectors.toSet());
		System.out.println(empnames1);
		
		System.out.println("Create a group of emp names of all Employees by eliminating duplicates whose deptno is 10 and sal > 60000.. ");
		empnames1 = lst1.stream().filter((e)->e.getDeptno()==10 && e.getEmpSalary()>60000).map((Employee e)->e.getEmpName()).collect(Collectors.toSet());
		System.out.println(empnames1);
		
		  //using ternary operator
		
		 System.out.println("Find the employee with the higheest salary:");
		 
		  Optional<Employee> ex =  lst1.stream()
	               .reduce((emp1,emp2)->{
	            	   
	            	   if(emp1.getEmpSalary()> emp2.getEmpSalary())
	            	   {
	            		   return emp1;
	            	   }
	            	   else
	            	   {
	            		   return emp2;
	            	   }
	               });   
		  
		  //above is same as below...using ternary operator
	       Optional<Employee> exx =  lst1.stream()
               .reduce((emp1,emp2)->emp1.getEmpSalary()>emp2.getEmpSalary()? emp1:emp2);            	
             

	       if(ex.isPresent())
	    	   System.out.println("Employee with highest salary is "+ex.get());
		
	       //2nd way of finding employee with highest salary
	       
	       Comparator<Employee> c = (ae,be)->((int)(be.getEmpSalary()-ae.getEmpSalary()));
	       Optional<Employee> opemp = lst1.stream().sorted(c).findFirst();
	       if(opemp.isPresent())
	    	   System.out.println("Employee with highest salary:"+opemp.get()+" and highest salasry in list is:"+opemp.get().getEmpSalary());
	     
	    //find total salary of all emps in list lst1
	     System.out.println("Find total salary of all emps using stream class functions:");
	     double tot =  lst1.stream().map((e)->e.getEmpSalary()).reduce(0.0,(a,b)->a+b);
	     System.out.println("Total salary of all employees together:"+tot);
	       
		
	     
          
          
          
          
                  
          
          
          
	}

}
