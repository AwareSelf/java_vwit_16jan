package collections;

import java.util.*;

public class HashSetEx {

	public static void main(String[] args) {
		
		Set<String> s = new HashSet<String>();
		//hashSet doesnt store values linearly like List
		//as it uses hashshing
		//to check equality hashset uses hashCode() then equals() method
		s.add("Mohit"); 
		s.add("Rahul");
		s.add("Punit");
		s.add("Mohit");
		
		System.out.println(s);

	}

}
