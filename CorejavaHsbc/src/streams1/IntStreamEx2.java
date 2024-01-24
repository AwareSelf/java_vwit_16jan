package streams1;
import java.util.stream.*;
import java.util.*;

public class IntStreamEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntStream intstr = IntStream.range(10,20);
		long ct =  intstr.count();
		System.out.println(ct);
		
		
		IntStream intstr1 = IntStream.range(10,20);
		  
		//boxed() converts int primitive into Integer object
		//boxed() used to convert stream of primtives to stream of objects
		//instream(primitve ints) to stream of Integers
		   List<Integer> lst = intstr1.boxed().collect(Collectors.toList());
		   System.out.println(lst);
		   
		   
		   //find sum of integers in list
		   //you will have to convert them to int primitve first before
		   //calling sum method on it
		   int sum1 = lst.stream().mapToInt(n->n.intValue()).sum();
					System.out.println(sum1);
					
		//using objectType.methodRef inside mapToInt func			
		   int sum2 = lst.stream().mapToInt(Integer::intValue).sum();
			System.out.println(sum1);
		   
		   IntStream numbers = IntStream.of(1, 2, 3, 4, 5, 6);
		   int sum = numbers.reduce(0, (x,y)->x+y);
		   System.out.println(sum);
		   
		   numbers = IntStream.of(1, 2, 3, 4, 5, 6);
		   int mul = numbers.reduce(1, (x,y)->x*y);
		   System.out.println(mul);
		   
		   
		   Comparator<Integer> c = (x,y)->x-y;
		 		   
		 int minnum = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).min(c).get();
		 System.out.println(minnum);
		 
		 int minnum1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).min((x,y)->x-y).get();
		 System.out.println(minnum1);
		 
		 
			
		 List<Integer> str=  Arrays.asList(10,30,20,40,50);
		 
		 Optional<Integer> opt =  str.stream().findFirst();
		 
		 if(opt.isPresent())
		 {
			 System.out.println(opt.get());
		 }
		 
		 
      int first =  str.stream().findFirst().get();
      System.out.println(first);
		
		 
		 
		 
		
		
		   
		
	}

}
