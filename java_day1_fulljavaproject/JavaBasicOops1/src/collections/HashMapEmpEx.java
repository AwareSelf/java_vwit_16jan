package collections;

import java.util.*;
import java.util.function.BiConsumer;

import nama.basic.java.Employee;
import nama.basic.java.Manager;

public class HashMapEmpEx {

	public static void main(String[] args) {
	
		//my project often needs a list of emp along with his
		//manager details
		
		//so i need to have data structure which can keep
		//emp-manager info together and whenever i search for emp
		//i can get his manager details
		
		Employee e1 = new Employee(1,"Ram",50000.0,10);
		Employee e2 = new Employee(4,"Rahim",80000.0,10);
	    Employee e3 = new Employee(2,"Nina",40000.0,20);
	    Employee e4 = new Employee(7,"Tina",70000.0,20);
	    Employee e5 = new Employee(5,"Umesh",60000.0,30);
	    
	    Manager m = new Manager(10,"Geeta",90000,30,5,5000,50000);
	    Manager m1 = new Manager(11,"Arun",100000,100,5,5000,50000);
	    Manager m2 = new Manager(12,"Rahul",100000,20,5,5000,50000);
	    
	    Map<Employee,Manager> mp = new HashMap<Employee,Manager>();
	    
	    mp.put(e1,m);
	    mp.put(e2,m);
	    mp.put(e3, m2);
	    mp.put(e4, m1);
	    mp.put(e5, m1);
	    mp.put(new Employee(5,"Umesh",60000.0,30), m2);
	    
	    System.out.println(mp);
	    
	    //finding size of map
	    System.out.println("size of map:"+mp.size());
	    
	    Employee x = new Employee(2,"Nina",40000.0,20);
	    Manager mg = mp.get(x);
	    
	    if(mg!=null)
	      System.out.println("Manager of Employee:"+x.getEmpName()+" is "+mg.getEmpName());
	    
	    Employee x1 = new Employee(12,"Arjun",40000.0,20);
	    Manager mg1 = mp.get(x1);
	    
	    if(mg1!=null)
	      System.out.println("Manager of Employee:"+x1.getEmpName()+" is "+mg1.getEmpName());
	    else
	      System.out.println("Employee "+x1.getEmpName()+" not found int the Map!");
	    
	    
	    System.out.println("Employee-Manager details:");
	    for(Employee e : mp.keySet())
	    {
	       mg1 = mp.get(e);
	       System.out.println("Manager of Employee:"+e.getEmpName()+" is "+mg1.getEmpName());
	    }
	    
	    Set<Employee> emplst = mp.keySet();
	    System.out.println(emplst);
	    emplst.forEach((Employee ee)->System.out.println(ee));
	    
	    Collection<Manager> lst = mp.values();
	    lst.forEach((Manager mx)->System.out.println(mx));
	    
	    
	    BiConsumer<Employee,Manager> bicon = (Employee ex,Manager mx)->System.out.println("Employee:"+ex+" --->"+"Manager:"+mx);
	    mp.forEach(bicon);
	    //above 2 lines are same as
	    mp.forEach((Employee ex,Manager mx)->System.out.println("Employee:"+ex+" --->"+"Manager:"+mx));
	    
	    
	    System.out.println("Employee Rahim contained in the map's key:"+ mp.containsKey(new Employee(4,"Rahim",80000.0,10)));
	    
	    
	    mp.clear();
	    System.out.println(mp.size());
	    
	   /* 
	    *why brackets are necessary sometimes
	    System.out.println("abc"+2+3);
	    System.out.println("abc"+(2+3));
	    */
		

	}

}
