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

public class CollectorsOperations {
	
	public static void main(String[] args)
	{
		
		
		String result = Stream.of("E","F","G","H").collect(Collectors.joining());
		System.out.println(result);
		
		result = Stream.of("E","F","G","H").collect(Collectors.joining(","));
		System.out.println(result);
		
		result = Stream.of("E","F","G","H").collect(Collectors.joining(",","{","}"));
		System.out.println(result);
		
		List < Employee > employees1 = new ArrayList < Employee > ();
	    employees1.add(new Employee(10, "Ramesh", 30, 400000,true,Arrays.asList("Ram","Shyam")));
	    employees1.add(new Employee(20, "John", 29, 350000,false,Arrays.asList("Sita","Gita")));
	    employees1.add(new Employee(30, "Shaheer", 25, 350000,true,Arrays.asList("Sita","Gita")));
	    employees1.add(new Employee(04, "Meena", 40, 370000,false,Arrays.asList("Sita","Gita")));
	     
		 
		
		String empnamelst = employees1.stream().map(e->e.getName()).collect(Collectors.joining(",","{","}"));
		System.out.println(empnamelst);
		
	    long noofmgr = employees1.stream().filter(Employee::isManager).count();
			System.out.println(noofmgr);
		
        noofmgr = employees1.stream().filter(Employee::isManager).collect(Collectors.counting());
		System.out.println(noofmgr);
		
		
		//use map or Collectors.mapping
		List<String> enames = employees1.stream().map(Employee::getName).collect(Collectors.toList());
		System.out.println(enames);
		
		enames = employees1.stream().collect(Collectors.mapping(Employee::getName,Collectors.toList()));
		System.out.println(enames);
		
		//group Employees by their age
		Map<Integer,List<String>> mapAgeToNames = employees1.stream()
				                                  .collect(Collectors.groupingBy(Employee::getAge,Collectors.mapping(Employee::getName, Collectors.toList())));
		mapAgeToNames.forEach((k,v)->{
			System.out.println("key:"+k+"_Value:"+v);
			
		//min, minBy
			
	    Optional<Employee> minemp = employees1.stream().min(Comparator.comparing(Employee::getName));
	    if(minemp.isPresent())
	    	System.out.println(minemp.get());
	    
	    minemp = employees1.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getName)));
	    if(minemp.isPresent())
	    	System.out.println(minemp.get());
		});
		
	
		
        
		//summingInt and averagingInt
		
		int sumage = employees1.stream().collect(Collectors.summingInt(Employee::getAge));
		System.out.println(sumage);
		
		double totsal = employees1.stream().collect(Collectors.averagingDouble(Employee::getSalary));
		System.out.println(totsal);
		
		Map<String,List<Employee>> memp = employees1.stream().collect(Collectors.groupingBy(e->e.isManager()?"Manager":"TeamMember"));
		memp.forEach((k,v)->
		{
			System.out.println("key-"+k+",value="+v);
		});
		
		Map<Boolean,Optional<Employee>> emaxmap = employees1.stream()
				                                 .collect(
				                                		 Collectors.groupingBy(
				                                		    Employee::isManager,
				                                		    Collectors.maxBy(Comparator.comparing(Employee::getSalary))
				                                		    )//end of grouping
				                                		 );//end of collect
		
		System.out.println("group emp based on manager/non manager and find emp with highest salary in each group:");
		emaxmap.forEach((k,v)->{
			System.out.println("key:"+k+":value:"+v);
		});
		
		Map<Boolean,Employee> emaxmap1 = employees1.stream()
				.collect(Collectors.groupingBy(
						Employee::isManager,
						Collectors.collectingAndThen(
								Collectors.maxBy(Comparator.comparing(Employee::getSalary)), 
								Optional::get)
						));
		
		System.out.println("group emp based on manager/non manager and find emp with highest salary in each group:");
		emaxmap1.forEach((k,v)->{
			System.out.println("key:"+k+":value:"+v);
		});
		
		Map<Boolean,Double> eavgsal = employees1.stream()
                .collect(
               		 Collectors.groupingBy(
               		    Employee::isManager,
               		    Collectors.averagingLong(Employee::getSalary)
               		    )//end of grouping
               		 );//end of collect

		
		System.out.println("group emp based on manager/non manager and find avg salary of all emps in each group:");
		eavgsal.forEach((k,v)->{
			System.out.println("key:"+k+":value:"+v);
		});
		
		
		Map<Boolean,IntSummaryStatistics> empsumstats = employees1.stream()
                .collect(
               		 Collectors.groupingBy(
               		    Employee::isManager,
               		    Collectors.summarizingInt(Employee::getAge)
               		    )//end of grouping
               		 );//end of collect

		
		System.out.println("group emp based on manager/non manager and find summary statistics of all emps based on their age in each group:");
		empsumstats.forEach((k,v)->{
			System.out.println("key:"+k+":value:"+v);
		});
	}

}
