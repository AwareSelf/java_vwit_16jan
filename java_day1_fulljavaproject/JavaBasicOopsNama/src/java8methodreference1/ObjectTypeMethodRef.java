package java8methodreference1;

import java.util.function.Function;

/*
 * whenever lambda function is of style
 * 
 *   ele -> ele.function()  you can change it to  
 *   classname_of_ele::function
 *   
 *   for example:
 *   no->no.intValue() 
 *   Integer::intValue
 *   
 *   s->s.toLowerCase()
 *   String::toLowerCase
 *   
 */
public class ObjectTypeMethodRef {

	public static void main(String[] args) {
		
		Function<Integer,Double> f = no->no.doubleValue();
		double d = f.apply(10);
		System.out.println(d);
		
		Function<Integer,Double> f1 = Integer::doubleValue;
		double d1 = f1.apply(10);
		System.out.println(d1);
		
		Function<String,String> f2 = s->s.toLowerCase();
		String s = f2.apply("NAMRATA");
		System.out.println(s);
		
		Function<String,String> f3 = String::toLowerCase;
		s = f3.apply("NAMRATA");
		System.out.println(s);
		
		
		

	}

}
