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

		int[] arr = {2,3,5,2,6,1,6,6,7,5,7,6,5,7,5};
		sum  = Arrays.stream(arr).parallel().sum();
	
				
		IntStream.rangeClosed(0,50000).sum();			
		IntStream.rangeClosed(0,50000).parallel().sum();
		

	}

}
