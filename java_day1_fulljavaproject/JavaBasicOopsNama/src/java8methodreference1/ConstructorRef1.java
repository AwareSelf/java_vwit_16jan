package java8methodreference1;

import java.util.*;
import java.util.stream.Collectors;

/*
Lambda expression for method reference to a constructor of a class is:

(args) -> new ClassName(args)

The above lambda expression can get replaced by a method reference. The shorthand code looks like this:

ClassName::new
 */


class Fruit
{
	String fruitname;
	Fruit(String fruitname)
	{
		this.fruitname = fruitname;
	}
	
	@Override
	public String toString()
	{
		return "Fruit with fruit name as :"+ this.fruitname;
	}
}

public class ConstructorRef1 {
	 public static void main(String[] args) { 
	    	
	    	List<String> fruits = Arrays.asList("mango","pineapple","apple","banana");
	   	    List<Fruit> ls = fruits.stream().map(s -> new Fruit(s))
	    	                         .collect(Collectors.toList());
	   	 //   ls.forEach(s->System.out.println(s));
	   	    ls.forEach(System.out::println);
	   	   
	    	//replaced lambda argument in map function with constructor-method-ref
	    	List<String> fruits1 = Arrays.asList("mango","pineapple","apple","banana");
	   	    List<Fruit> ls1 = fruits.stream().map(Fruit::new)
	    	                         .collect(Collectors.toList());
	   	    ls1.forEach(System.out::println);
	   	   
	    	             
	    }  
	}

