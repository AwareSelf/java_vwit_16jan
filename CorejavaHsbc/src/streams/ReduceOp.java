package streams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ReduceOp {
	
	public static void main(String[] args)
	{
		
		/*
		List<Integer> intl = Arrays.asList(1,2,3,4,5,6);
		          Integer res = intl.stream().reduce(0,(a,b)->a+b);
		          System.out.println(res);
		          
		          res = intl.stream().reduce(0,(a,b)->a*b);
		          System.out.println(res);
		
		           intl = Arrays.asList(1,2,3,4,5,6);
		           Optional<Integer> res1 = intl.stream().reduce((a,b)->a+b);
		         
		           if(res1.isPresent())
		            System.out.println(res1.get());
		          

		           intl = Arrays.asList(1,2,3,4,5,6);
		           res1 = intl.stream().reduce((a,b)->a*b);
		         
		           if(res1.isPresent())
		            System.out.println(res1.get());
		           
		           //here there are no elements in the list
		           //but since we use Optional to collect the result when identity is not provided
		           //in reduce operation, it won't cause any exception
		           
		           intl = Arrays.asList();
		           res1 = intl.stream().reduce((a,b)->a*b);
		         
		           //need to check if value is present in the Optional
		           if(res1.isPresent())
		            System.out.println(res1.get());
		          
		
		
		           */
		           List<Integer> intll = Arrays.asList(1,2,3,4,5,6);
			          Optional<Integer> ress = intll.stream().max(Integer::compareTo);
			          if(ress.isPresent())
			          System.out.println(ress.get());
			          
			          intll = Arrays.asList(1,2,3,4,5,6);
			           ress = intll.stream().reduce((a,b)->a>b?a:b);
			          if(ress.isPresent())
			          System.out.println(ress.get());
			          
			          
			          intll = Arrays.asList(1,2,3,4,5,6);
			         ress = intll.stream().min(Integer::compareTo);
			          if(ress.isPresent())
			          System.out.println(ress.get());
			          
			          intll = Arrays.asList(1,2,3,4,5,6);
			           ress = intll.stream().reduce((a,b)->a<b?a:b);
			          if(ress.isPresent())
			          System.out.println(ress.get());
			          
		 
			          
		 
	       
	       //Use FlatMap to get one common List of all subordinates of all employees
			          /*
		   List < Employee > employees1 = new ArrayList < Employee > ();
	       employees1.add(new Employee(10, "Ramesh", 30, 400000,true,Arrays.asList("Ram","Shyam")));
	       employees1.add(new Employee(20, "John", 29, 350000,false,Arrays.asList("Sita","Gita")));
	       employees1.add(new Employee(30, "Shaheer", 35, 350000,true,Arrays.asList("Sita","Gita")));
	       employees1.add(new Employee(31, "Mita", 23, 350000,false,Arrays.asList("Sita","Gita")));
		 
	       Optional<Employee> e =  employees1.stream()
	                    .reduce((e1,e2)-> {
	                    	if(e1.getAge()>e2.getAge())
	                    		return e1;
	                    	else
	                    		return e2;
	                    	
	                    });    

	       if(e.isPresent())
	    	   System.out.println("Employee with highest age is "+e.get());
	      
	       //using ternary operator
	       Optional<Employee> ex =  employees1.stream()
                  .reduce((e1,e2)->e1.getAge()>e2.getAge()? e1:e2);            	
                    

	       if(ex.isPresent())
	    	   System.out.println("Employee with highest age is "+ex.get());
	       
	       
	                          

		       if(ex.isPresent())
		    	   System.out.println("Employee with highest age is "+ex.get());
		       
	       
	       //use filter,map and reduce together
	       //filter employees who are managers and find total salary of those employees
	       Long sum = employees1.stream()
	                 .filter(Employee::isManager)
	                 .map(Employee::getSalary)
	                 .reduce(0L,Long::sum);
	       
	       System.out.println("total salary of those employees who are managers"+sum);
	        */
	  }

}
