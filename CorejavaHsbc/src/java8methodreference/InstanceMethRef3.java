package java8methodreference;

import java.util.ArrayList;
import java.util.List;

/*
Type 2: Reference to an instance method of a particular object
If a Lambda expression is like:

// If a lambda expression just call a default method of an object 

(args) -> obj.instanceMethod(args) 

Then method reference is like:

// Shorthand if a lambda expression just call a default method of an object 

obj::instanceMethod 
*/
public class InstanceMethRef3 {

	public static void main(String[] args) {


		  List<Integer> numbers = new ArrayList<Integer>();
		    numbers.add(5);
		    numbers.add(9);
		    numbers.add(8);
		    numbers.add(1);
		  
		
		    numbers.forEach( (n) -> System.out.println(n) );
		    numbers.forEach(System.out::println);

	}

}
