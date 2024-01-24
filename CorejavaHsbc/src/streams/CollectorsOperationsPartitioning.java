package streams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class CollectorsOperationsPartitioning {
	
	public static void main(String[] args)
	{
		
		List<String> strings = List.of("apple", "orange", "banana", "pear","mango");
		Map<Boolean, List<String>> partitionedFruitsByLength = strings.stream()
		        .collect(Collectors.partitioningBy(fruit -> fruit.length() > 4));
		System.out.println(partitionedFruitsByLength);
		
		partitionedFruitsByLength = strings.stream()
		        .collect(Collectors.partitioningBy(fruit -> fruit.length() > 4,
		                Collectors.toList()));
		System.out.println(partitionedFruitsByLength); //{false=[pear], true=[apple, orange, banana]}
		
		Map<Boolean, List<String>> partitionedFruitsInUpperCaseByLength = strings.stream()
		        .collect(Collectors.partitioningBy(fruit -> fruit.length() > 4,
		                Collectors.mapping(String::toUpperCase, Collectors.toList())));
		System.out.println(partitionedFruitsInUpperCaseByLength);
		
		//Group by length
		Map<Boolean, List<String>> groupedByLength = strings.stream()
		        .collect(Collectors.groupingBy(fruit -> fruit.length() > 4));
		System.out.println(groupedByLength); 
		
		Map<Boolean, Long> fruitsCount = strings.stream()
		        .collect(Collectors.groupingBy(fruit -> fruit.length() > 4,
		                Collectors.counting()));
		System.out.println(fruitsCount); //{false=1, true=3}
		
		
		//diff between groupingBy and partitioningBy
		partitionedFruitsByLength = strings.stream()
		        .collect(Collectors.partitioningBy(fruit -> fruit.length() > 3));
		System.out.println(partitionedFruitsByLength); //{false=[], true=[apple, orange, banana, pear]
		groupedByLength = strings.stream()
		        .collect(Collectors.groupingBy(fruit -> fruit.length() > 3));
		System.out.println(groupedByLength); //{true=[apple, orange, banana, pear]}

	}

}
