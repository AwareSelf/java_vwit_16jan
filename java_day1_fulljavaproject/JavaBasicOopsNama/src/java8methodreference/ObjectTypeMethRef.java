package java8methodreference;

import java.util.*;

//ClassName::new  
/*
Type 3: Reference to an instance method of an arbitrary object of a particular type
If a Lambda expression is like:

// If a lambda expression just call an instance method of a  ObjectType 

(obj, args) -> obj.instanceMethod(args) 

Then method reference is like:

// Shorthand if a lambda expression just call an instance method of a ObjectType 

ObjectType::instanceMethod 
*/
public class ObjectTypeMethRef {

	public static void main(String[] args) {
		// Creating an empty ArrayList of user defined type
        // List of person
        List<String> personList = new ArrayList<>();
 
        // Adding elements to above object of List
        // using add() method
        personList.add("vicky");
        personList.add("poonam");
        personList.add("sachin");
 
       //sort(List<T> list, Comparator<? super T> c)
        Collections.sort(personList,(s1,s2)->s1.compareToIgnoreCase(s2));
        // Method reference to String type
        Collections.sort(personList,
                         String::compareToIgnoreCase);
 
        // Printing the elements(names) on console
        personList.forEach(System.out::println);

	}

}
