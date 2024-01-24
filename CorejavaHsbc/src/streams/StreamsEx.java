package streams;
import java.util.*;
import java.util.stream.*;

public class StreamsEx
{
	public static void main(String[] args)
	{
		
		//use of map
		List<Integer> nums = Arrays.asList(2,3,4,5,6);
		List<Integer> sqnums = nums.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println(sqnums);
		
		//use of Filter
		List<String> names = Arrays.asList("Radha","Sita","Rajesh","Anuj","Suyash");
		List<String> rnames= names.stream().filter(x->x.startsWith("R")).collect(Collectors.toList());
		System.out.println(rnames);
		
		List<String> sortnames= names.stream().sorted().collect(Collectors.toList());
		System.out.println(sortnames);
		names.stream().sorted().forEach(n->System.out.println(n));
		
		List<String> sortnamesdesc= names.stream().sorted((o1,o2)->o2.compareTo(o1)).collect(Collectors.toList());
		System.out.println(sortnamesdesc);
		
		sortnamesdesc= names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortnamesdesc);
		
		// sort employee by salary in ascending order
        List < Employee > employees = new ArrayList < Employee > ();
        employees.add(new Employee(10, "Ramesh", 30, 400000));
        employees.add(new Employee(20, "John", 29, 350000));
        employees.add(new Employee(30, "Tom", 30, 450000));
        employees.add(new Employee(40, "Pramod", 29, 500000));
        
        List<Employee> sortemp = employees.stream().sorted((e1,e2)->(int)(e1.getSalary()-e2.getSalary())).collect(Collectors.toList());
        System.out.println(sortemp);
        
        List<Employee> sortemp1 = employees.stream().sorted(Comparator.comparingLong(Employee::getSalary)).collect(Collectors.toList());
        System.out.println(sortemp1);
        
        //descending order of salary
        List<Employee> sortempd = employees.stream().sorted((e1,e2)->(int)(e2.getSalary()-e1.getSalary())).collect(Collectors.toList());
        System.out.println(sortempd);
        
        List<Employee> sortempd1 = employees.stream().sorted(Comparator.comparingLong(Employee::getSalary).reversed()).collect(Collectors.toList());
        System.out.println(sortempd1);
        
        //reduce terminal operation on stream
        List<Integer> lints = Arrays.asList(1,2,3,4,5);
        Integer sum = lints.stream().reduce(0, (a,b)->a+b);
        System.out.println(sum);
        
        
        // Get the stream
        Stream<String> stream
            = Stream.of("Geeks", "For",
                        "Geeks", "A",
                        "Computer",
                        "Portal");
        

        // Print the stream using lambda expression
        stream.forEach(s -> System.out.println(s));
        
        // Get the stream
        stream = Stream.of("Geeks", "For",
                        "Geeks", "A",
                        "Computer",
                        "Portal");
  
        // Print the stream
        // using double colon operator
        stream.forEach(System.out::println);
		
        
	}
}