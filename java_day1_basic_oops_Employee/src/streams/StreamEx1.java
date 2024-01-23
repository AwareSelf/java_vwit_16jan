package streams;

import java.util.*;
import java.util.stream.*;

import nama.basic.java.Employee;

public class StreamEx1 {
	
	
	public static void main(String[] args)
	{
		List<Integer> lst = new ArrayList<Integer>();
	 	System.out.println(lst.isEmpty());
		lst.add(20); //java 1.5 compiler --> primitive 20 -> Integer object 20 --> wrap/autoboxing --> added to collection
		lst.add(20);
		lst.add(10);
		lst.add(60);
		lst.add(80);
		lst.add(4);
		
		System.out.println(lst);
		
		//a sequential Stream over the elements in this collection
		Stream<Integer> strm = lst.stream(); //stream of integer as sequence of values oe after another

		System.out.println("double each value in list and print it (use stream classes)"); 
		strm.map((Integer i)->i*2).forEach((Integer i)->System.out.println(i));
		
		//stream.multiple intermediate operation.terminaloperation 
		
		strm = lst.stream(); //stream of integer as sequence of values oe after another

		System.out.println("converting a collection of Integers to stream, transforming it - doubling it, converting it into Set of Integers");
		Set<Integer> set = strm.map((Integer i)->i*2).collect(Collectors.toSet());
		System.out.println(set);
		
		System.out.println("count total non of elements in the list using count() terminal function of Stream class");
		strm = lst.stream();
		System.out.println(strm.count());
		
		System.out.println("Converting int array to stream of int primitives and squaring them and filtering");
		System.out.println(" even values and printing them");
		
		int[] arr = {2,1,5,7,8};
		IntStream strm1 = Arrays.stream(arr);
		
	
		System.out.println("from array of int primtives, filter even elements and print them");
		  strm1.map((int i)->i*i).filter((int i)->i%2==0).forEach((int i)->System.out.println(i));
			
		//functional interfaces
		  //Consumer - forEach method arg of type Consumer - functional interface - 1 arg return void
		  //Function - map method in Stream as an arg - function interface - 1 arg returns 1 val
		  //Prdeicate - filter method in Stream as an arg - functional interface - 1 arg - boolean value
		  
		  
		
	
		  //list of emps --> list of empnames
		  //list of emps --> list of empnames but in Upeercase
		  //list of emps -->list of emps whose salaries are greater than 5000 		
		  //list of emps -->list of empNames whose salaries are greater than 5000 
			List<Employee> lst1 = new ArrayList<Employee>();
		 	System.out.println(lst.isEmpty());
		 	
			Employee e1 = new Employee(1,"Ram",50000.0,10);
			lst1.add(e1); 
			e1 = new Employee(2,"Shyam",60000.0,20);
			lst1.add(e1);
			e1 = new Employee(4,"Mita",60000.0,20);
			lst1.add(e1);
			
			Employee e2 = new Employee(3,"Radha",70000.0,10);
			lst1.add(e2);
			e2 = new Employee(5,"Rita",70000.0,10);
			lst1.add(e2);
			lst1.add(new Employee(3,"Radha",70000.0,10));
			System.out.println(lst1);
			
		 //list of emps -->list of empNames whose salaries are greater than 5000 
			//traditional way - corejava structural programming
			List<String> lstEmpNames = new ArrayList<String>();
			Iterator<Employee> itr = lst1.iterator();
			while(itr.hasNext())
			{
				Employee e = itr.next();
				if(e.getEmpSalary() > 60000)
				{
					lstEmpNames.add(e.getEmpName());
				}
			}
		
			System.out.println(lstEmpNames);
			
			//same as above using Streams - functional programming style
			List<String> names = lst1.stream()
			            .filter((Employee ex)->ex.getEmpSalary()>60000)
			            .map((Employee e)->e.getEmpName())
			            .collect(Collectors.toList());
			System.out.println(names);
			
			System.out.println(lst1.stream().count()); //count of all emps
			System.out.println(names.stream().count()); //count of emps whose sal is > 5000
			
			
			Stream<Employee> lstt = lst1.stream();
			
			//findout first empployee in deptno 10
			Optional<Employee> opemp = lstt.distinct().filter((Employee e)->e.getDeptno()==10).findFirst(); // lstt stream is closed with terminal operation findfirst called on it
			if(opemp.isPresent())
			{
				System.out.println(opemp.get());
			}
			
			Employee x = lst1.stream().distinct().filter((Employee e)->e.getDeptno()==10).findFirst().orElse(new Employee(999,"xxx",0.0,0));
			
			
			
		   String empname =  lst1.stream()
				               .filter((Employee e)->e.getEmpSalary()>5000)
				               .map((Employee e)->e.getEmpName())
				               .findAny()
				               .orElse("No Emp found matching criteriaa sal > 5000");
		  
		   System.out.println(empname);
		   
		   //https://www.baeldung.com/java-stream-sum
		   //using reduce() method
		   List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		   Integer sum = integers.stream()
		     .reduce(0, (a, b) -> a + b);
		   
		   /*
		   List<Integer> integers1 = Arrays.asList(1, 2, 3, 4, 5);
		   Integer sum1 = integers1.stream()
		     .reduce(0, Integer::sum);
		   
		   List<Integer> integers2 = Arrays.asList(1, 2, 3, 4, 5);
		   Integer sum2 = integers2.stream()
		     .mapToInt(Integer::intValue)
		     .sum();
		     */
		   
		   Item item1 = new Item(1, 10);
		   Item item2 = new Item(2, 15);
		   Item item3 = new Item(3, 25);
		   Item item4 = new Item(4, 40);
		   
		  
		   List<Item> items = Arrays.asList(item1, item2, item3, item4);
		   
		   /*
		   	int summ =  0;
		   
		   for(Item item:items)
		       summ = summ +item.getPrice();
		   
		   System.out.println(summ);
		   */
		           
			   
		   Integer sum3 = items.stream()
				   .map(item -> item.getPrice()) //   40 25 15 10 // 40 25 25 // 40 50 //90
				   .reduce(0, (a, b) -> a + b);

		   Integer sum4 = items.stream()
				   .map(x1 -> x1.getPrice())
				   .reduce(0, Integer::sum);
		   
		   //find out total salary of all emps in deptno 10 from given list of emps
		     double totsal = lst1.stream().filter((Employee e)->e.getDeptno() == 10)
		                  .map((Employee e)->e.getEmpSalary()) //stream of salaries of all emps of dept 10
		                  .reduce(0.0,(a,b)->a+b);
		    System.out.println("Total salary of all emps of deptno 10:"+totsal);
		    
		    //print emp in list in ascending order of emp salaries
		    lst1.stream()
		         .sorted((Employee ee1,Employee ee2)->(int)(ee1.getEmpSalary() - ee2.getEmpSalary()))
		    	 .forEach((Employee es)->System.out.println(es));
		   
		    //print items in ascending order of their prices
		   items.stream() 
	        .sorted((itm1, itm2)->itm1.getPrice() - itm2.getPrice()) 
	        .forEach((Item itm)->System.out.println(itm));
	      //  .forEach(System.out::println); 
	}

}
class Item {

    private int id;
    private Integer price;

    public Item(int id, Integer price) {
        this.id = id;
        this.price = price;
    }

    // Standard getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", price=" + price + "]";
	}

  
	
    
}
