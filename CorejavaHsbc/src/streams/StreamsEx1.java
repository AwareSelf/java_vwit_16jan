package streams;
import java.util.*;
import java.util.stream.*;
import java.util.function.Predicate;

public class StreamsEx1
{
	public static void main(String[] args)
	{
				
		// sort employee by salary in ascending order
        List < Employee > employees = new ArrayList < Employee > ();
        employees.add(new Employee(10, "Ramesh", 30, 400000,true));
        employees.add(new Employee(20, "John", 29, 350000,false));
        employees.add(new Employee(30, "Tom", 30, 450000,true));
        employees.add(new Employee(40, "Pramod", 29, 500000,false));
        employees.add(new Employee(42, "Pritam", 39, 500000,false));
        
        
        Predicate<Employee> p1 = (e)->e.isManager();
        Predicate<Employee> p2 = (e)->e.getAge()>29;
        
        
        Map<String,Employee> mapemp = employees.stream().
        		filter(p1).filter(p2).collect(Collectors.toMap(Employee::getName,(e)->e));
        System.out.println(mapemp);
        
        
        Map<String,Employee> mapempx = employees.stream().
        		filter(p1).filter(p2).collect(Collectors.toMap(e->e.getName(),(e)->e));
        System.out.println(mapempx);
        
        Map<String,Integer> mapemp1 = employees.stream().filter(p1).filter(p2).collect(Collectors.toMap(Employee::getName,Employee::getAge));
        System.out.println(mapemp1);
        
        Long totSal = employees.stream().map(e->e.getSalary()).reduce(0L,(a,b)->a+b);
        System.out.println(totSal);
        
        List<Employee> sortemp = employees.stream().sorted(Comparator.comparingLong(Employee::getSalary)).collect(Collectors.toList());
        List<Employee> sortempd = employees.stream().sorted(Comparator.comparingLong(Employee::getSalary).reversed()).collect(Collectors.toList());
        System.out.println(sortemp);
        System.out.println(sortempd);
        
        
        //sort in ascending and descending order of names
        List<Employee> sortempname = employees.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
        System.out.println(sortempname);
        sortempname = employees.stream().sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toList());
        System.out.println(sortempname);
        
        
        List<Employee> lemp = employees.stream()
        		.filter(e->e.getName().startsWith("P")).collect(Collectors.toList());
        System.out.println(lemp);
        lemp.forEach(System.out::println);
       //below will give error as streams can be traversed only once
       // lemp.forEach(System.out::println);
        
        
        
        //Map can be used to extract particular field of Collection object - from employees collection
        //extract only all employees name in uppercase
        Set<String> names = employees.stream().map(Employee::getName)
        		                              .map(String::toUpperCase)
        		                              .collect(Collectors.toSet());
        System.out.println(names);
        
        
        
        
      
        
        
	}
}