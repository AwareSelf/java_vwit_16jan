package streams;
import java.util.*;
import java.util.stream.*;

public class UsingParallelStreams {

	public static void main(String[] args) {
		
		//https://medium.com/@mesfandiari77/parallel-stream-in-java-ac47c54176e0
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	
		int sum1 = numbers.stream().reduce(0,(a,b)->a+b);
		sum1 = numbers.parallelStream().reduce(0,(a,b)->a+b);
		
		
		
		List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int sum = numbers1.parallelStream()
                .mapToInt(Integer::intValue)
                .sum();
		System.out.println(sum);

		int[] arr = {2,3,5,2,6,1,6,6,7,5,7,6,5,7,5};
		sum  = Arrays.stream(arr).parallel().sum();
		System.out.println(sum);
				
		
		/*
		 * using parallerl stream is only efficient i.e. will be faster when
		 * range of values is very big. for small range of values the
		 * overhead of creating multiple threads and managing them will be more
		 * than the time saved in parallel computation.Hence, in such cases
		 * itb will end up taking more time than the linear stream.
		 * 
		 * SO only used parallel stream for very large range of nos.
		 */
		System.out.println("Time req for linear stream for add of first 500000000 nos: ");
			
		 long startTime= System.currentTimeMillis();
		    IntStream.rangeClosed(0,500000000).sum();	
	     long t1 =   System.currentTimeMillis() - startTime;
	     System.out.println(t1);
	     
	 	System.out.println("Time req for parallel stream for add of first 500000000 nos: ");
	     long startTime1 = System.currentTimeMillis();
	     IntStream.rangeClosed(0,500000000).parallel().sum();
	     long t2 =   System.currentTimeMillis() - startTime1;
	     System.out.println(t2);
		

	}

}
