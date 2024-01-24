package streams1;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import streams.Employee;

public class StreamEx1 {

	public static void main(String[] args) {
		
	 //list of nos --> set of square of each no	
		
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(5);
		lst.add(4);
		lst.add(13);
		lst.add(9);
		lst.add(13);
		
		System.out.println(lst);
		
		Stream<Integer> stream = lst.stream();
		                stream = stream.map(n->n*n);
		   Set<Integer> set = stream.collect(Collectors.toSet());  
		   
		   System.out.println(set);
		
		//at one go
		Set<Integer> set1 = lst.stream().map(n->n*n).collect(Collectors.toSet());  
	    System.out.println(set1);
	    
	    
	    //lst of string names -> set of names in uppercase
	    List<String> lst1 = new ArrayList<String>();
		lst1.add("kirti");
		lst1.add("kirti");
		lst1.add("ram");
		lst1.add("sita");
		lst1.add("aman");
		
		Set<String> lstnames = lst1.stream().map(s->s.toLowerCase())
				                            .collect(Collectors.toSet());
		
		System.out.println(lstnames);
		
	
        lst = new ArrayList<Integer>();
		lst.add(5);
		lst.add(4);
		lst.add(13);
		lst.add(9);
		lst.add(13);
		
		//lst of square of only even nos
		 Predicate<Integer> p = (n)->n%2==0;
Set<Integer> stint = lst.stream().filter(p).map(n->n*n)
                                           .collect(Collectors.toSet());
		System.out.println(stint);		                        
				                            
	//filter function takes ref of type Predicate (so we pass lambda impl of it)
		//lst of square of only odd nos
Set<Integer> stint1 = lst.stream().filter((n)->n%2!=0).map(n->n*n)
.collect(Collectors.toSet());

System.out.println(stint1);	

		
		
	}

}
