package streams;


import java.util.*;
import java.util.stream.*;

public class NumericStream1 {

	public static void main(String[] args) {
		
		
		List<Integer> lst = Arrays.asList(1,4,5,6,7,9);
		
		// convert to stream of primtive ints
		
		IntStream intstrm = lst.stream().mapToInt((Integer i)->i.intValue());
		
		//average,max,min,sum
		OptionalDouble res = intstrm.average();
		
		if(res.isPresent())
		System.out.println(res.getAsDouble());
		
		IntStream intstrm1 = lst.stream().mapToInt((Integer i)->i.intValue());
		OptionalInt res1 = intstrm1.max();
		if(res1.isPresent())
			System.out.println(res1.getAsInt());
		
		
		//0 to 5000 - sum
		int r = IntStream.rangeClosed(0,5000).sum();
		System.out.println(r);
		
		IntStream.iterate(2,n->n*2).limit(10).forEach(System.out::println);
		
		//insttream -> Stream<Integer>
		Stream<Integer> stm = intstrm1.boxed();
		
		
		
		
		
		
		

	}

}
