package collections;

import java.util.*;

import nama.basic.java.Employee;

public class HashSetEmpEx {

	public static void main(String[] args) {
		Set<Employee> lst = new HashSet<Employee>();
	 	System.out.println(lst.isEmpty());
	 	
		Employee e1 = new Employee(1,"Ram",50000.0,10);
		lst.add(e1); 
		e1 = new Employee(2,"Shyam",60000.0,20);
		lst.add(e1);
		e1 = new Employee(4,"Mita",60000.0,20);
		lst.add(e1);
		
		Employee e2 = new Employee(3,"Radha",70000.0,10);
		lst.add(e2);
		
		System.out.println(lst);
		
		//this will return true even if Employee equals methods is commented
		//bcz contains is checking emp object which is memoryw-se same
		System.out.println(lst.contains(e2));
	    e2=null;
	    
	    //this will give true only if u override equals in Employee and check empid, as they are
	 	//not memory-wise same but meaning-fully same  i.e. application level/value-wise same
	 	System.out.println(lst.contains(new Employee(3,"Radha",70000.0,10)));
	 	
	    

	}

}
