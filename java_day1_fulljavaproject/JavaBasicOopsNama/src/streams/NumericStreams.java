package streams;

import java.util.stream.*;
import java.util.*;



public class NumericStreams {
	
	public static void main(String[] args)
	{
	  //IntStream,DoubleStream,LongStream are streams of primitive datatypes
		//u will get mathematical operation function in this class which u will not
		//get in Stream<Integer> class
				
		IntStream intnums = IntStream.of(1,2,3,4,5);
		intnums.forEach(System.out::println);
		
		//converting intstream (primitive int stream) --> Integer Object stream
		Stream<Integer> intObjStrm = intnums.boxed();
		
		//Integer Object Stream --> primitive ints stream
		List<Integer> lst = Arrays.asList(1,5,3,6,7,9);
		IntStream stmpr =  lst.stream().mapToInt(ob->ob.intValue());
		System.out.println(stmpr.average());
		
		System.out.println("------------------------");
		intnums = IntStream.iterate(0,i->i+2).limit(10);
		intnums.forEach(System.out::println);
		
		System.out.println("------------------------");
		intnums = IntStream.range(0,5);
		intnums.forEach(System.out::println);
		
		System.out.println("------------------------");
		intnums = IntStream.rangeClosed(0,5);
		intnums.forEach(System.out::println);
		
		//sum(),min(),max(),average()
		int sum = IntStream.rangeClosed(0,1000).sum();
		System.out.println("sum of first 1000 integers:"+sum);
				
		//OptionalInt,OptionalDouble --> primitive versions of Optional<Object type>
		OptionalInt min = IntStream.rangeClosed(0,1000).min();
				
		if(min.isPresent())
		System.out.println("min of first 1000 integers:"+min.getAsInt());
				
		OptionalInt max = IntStream.rangeClosed(0,1000).max();
				
		if(max.isPresent())
		System.out.println("max of first 1000 integers:"+max.getAsInt());
				
	    OptionalDouble avg = LongStream.rangeClosed(0,1000).average();
		System.out.println("avg of first 1000 integers:"+(avg.isPresent()?avg.getAsDouble():0.0));
		
		//converting intstream to longstream or doublestream
		DoubleStream dstrm = LongStream.rangeClosed(0,1000).asDoubleStream();
		Stream<Double> doubleobjectstrm = dstrm.boxed();
		
		
		
		/*
		System.out.println("------------------------");
		intnums = IntStream.generate(new Random()::nextInt).limit(10);
		intnums.forEach(System.out::println);
		
		
		
	
		
		//repeat same for LongStream
		//DoubleStream
		DoubleStream doublenums = DoubleStream.of(1.1,2.2,3.3,4.4,5.5);
		doublenums.forEach(System.out::println);
		
		System.out.println("------------------------");
		doublenums = DoubleStream.iterate(0,i->i+2.0).limit(10);
		doublenums.forEach(System.out::println);
		
		System.out.println("------------------------");
		doublenums = DoubleStream.generate(new Random()::nextDouble).limit(10);
		doublenums.forEach(System.out::println);
		
		System.out.println("------------------------");
		doublenums = LongStream.range(0,5).asDoubleStream();
		doublenums.forEach(System.out::println);
		
		System.out.println("------------------------");
		doublenums = LongStream.rangeClosed(0,5).asDoubleStream();
		doublenums.forEach(System.out::println);
		
		//sum(),min(),max(),average()
		int sum = IntStream.rangeClosed(0,1000).sum();
		System.out.println("sum of first 1000 integers:"+sum);
		
		OptionalInt min = IntStream.rangeClosed(0,1000).min();
		
		if(min.isPresent())
		System.out.println("min of first 1000 integers:"+min.getAsInt());
		
		OptionalInt max = IntStream.rangeClosed(0,1000).max();
		
		if(max.isPresent())
		System.out.println("max of first 1000 integers:"+max.getAsInt());
		
	    OptionalDouble avg = LongStream.rangeClosed(0,1000).asDoubleStream().average();
		System.out.println("avg of first 1000 integers:"+(avg.isPresent()?avg.getAsDouble():0.0));
		*/
	}

}
