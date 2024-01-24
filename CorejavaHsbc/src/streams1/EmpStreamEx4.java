package streams1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import collections.model.Emp;

public class EmpStreamEx4 {

	public static void main(String[] args) {
	
		
		Emp e1 = new Emp(2,"Ram",4000);
		Emp e2 = new Emp(1,"Shyam",7000);
		
		Emp e3 = new Emp(3,"Sita",8000);
		
		List<Emp> lst = new ArrayList<Emp>();
		lst.add(e1);
		lst.add(e2);
		lst.add(e3);
		System.out.println(lst);
		
		//sorted() on Emp witll sort it based on comparable interface implement in Emp
		List<Emp> sortlst = lst.stream().sorted().collect(Collectors.toList());
		
		System.out.println(sortlst);
		
		 Comparator<Emp> c = (x,y)->((int)(x.getEmpSal() - y.getEmpSal()));
		 
		 List<Emp> sortlst1 = lst.stream().sorted(c).collect(Collectors.toList());
		System.out.println(sortlst1);
		
		
		/* from lst of emps --> lst of names of those emps whose sal
		
		                       is greater than 5000  */
		
		List<String> empnames = lst.stream().filter(e->e.getEmpSal()>5000)
		            .map(e->e.getEmpName())
		            .sorted()
		            .collect(Collectors.toList());

		System.out.println(empnames);
		
		
		
	}

}
