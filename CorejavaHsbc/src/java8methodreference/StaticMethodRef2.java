package java8methodreference;
import java.util.*;

public class StaticMethodRef2 {
	
	public static void main(String[] args)
	{/*
		Method reference to static method – Class::staticMethodName
		An example to use Math.max() which is static method.
      */
		List<Integer> integers = Arrays.asList(1,12,433,5);
		     
		Optional<Integer> max = integers.stream().reduce((x,y)->Math.max(x,y));
		max.ifPresent(value -> System.out.println(value)); 
		
		
		Optional<Integer> max1 = integers.stream().reduce( Math::max );  
		max1.ifPresent(System.out::println); 
	}

}
