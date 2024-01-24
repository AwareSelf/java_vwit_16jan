package streams;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamsBoxingUnboxing {
	
	public static void main(String[] args)
	{
		List<Integer> numbers;
		
		//Note: IntStream can't be collected directly using Collector.toList, it needs to be 
		//boxed from primitive int to Integer first
		
		IntStream numstream = IntStream.rangeClosed(0,5000);
		numbers = numstream.boxed().collect(Collectors.toList());
		numbers.forEach(System.out::println);
		
	    //unboxing from Integer to int
		Optional<Integer> sum = numbers.stream().reduce((a,b)->a+b);
		if(sum.isPresent())
			System.out.println(sum.get());
		
	    int sum1 = numbers.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum1);
		
		
		
	}

}
