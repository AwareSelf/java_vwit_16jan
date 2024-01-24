package streams;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOp1 {
	
	public static void main(String[] args)
	{
		
		 //min() and max()
		 List<Integer> intll = Arrays.asList(1,2,3,4,5,6);
         Optional<Integer> ress = intll.stream().max(Integer::compareTo);
         if(ress.isPresent())
         System.out.println(ress.get());
         
         intll = Arrays.asList(1,2,3,4,5,6);
          ress = intll.stream().reduce((a,b)->a>b?a:b);
         if(ress.isPresent())
         System.out.println(ress.get());
         
         
         intll = Arrays.asList(1,2,3,4,5,6);
        ress = intll.stream().min(Integer::compareTo);
         if(ress.isPresent())
         System.out.println(ress.get());
         
         intll = Arrays.asList(1,2,3,4,5,6);
          ress = intll.stream().reduce((a,b)->a<b?a:b);
         if(ress.isPresent())
         System.out.println(ress.get());
         
         
         //limit(long n) and skip(long n)
         List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
         List<Integer> first5num = numbers.stream().limit(5).collect(Collectors.toList());
                              
         first5num.forEach(System.out::println);
         
         System.out.println("-------------**---------");
         numbers = Arrays.asList(1,2,3,4,5,6,7,8);
         first5num = numbers.stream().skip(5).collect(Collectors.toList());
         first5num.forEach(System.out::println);
         
         //findFirst() and findAny()
         Optional<Integer> firstint = numbers.stream().findFirst();
         if(firstint.isPresent())
        	 System.out.println(firstint.get());
         Optional<Integer> anyint = numbers.stream().findAny();
         if(anyint.isPresent())
        	 System.out.println(anyint.get());
         
         
         //of(),iterate(),generate()
         Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8);
         stream.forEach(System.out::println);
         
         System.out.println("*--------------------*");
         //iterate() and generate a stream of first 10 numbers
         Stream<Integer> stream1 = Stream.iterate(0,i->i+2).limit(10);
         stream1.forEach(System.out::println);
         
         System.out.println("*--------------------*");
         //generate a stream of first 10 numbers
         stream1 = Stream.generate(new Random()::nextInt).limit(10);
         stream1.forEach(System.out::println);
         
        
         
         
         
         
	}

}
