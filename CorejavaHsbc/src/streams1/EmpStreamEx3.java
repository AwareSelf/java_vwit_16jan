package streams1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmpStreamEx3 {

	public static void main(String[] args) {
	
		
		Emp e1 = new Emp(1,"Ram",4000);
		Emp e2 = new Emp(2,"Shyam",7000);
		
		Emp e3 = new Emp(3,"Sita",8000);
		
		List<Emp> lst = new ArrayList<Emp>();
		lst.add(e1);
		lst.add(e2);
		lst.add(e3);
		System.out.println(lst);
		/* from lst of emps --> lst of names of those emps whose sal
		
		                       is greater than 5000  */
		
		List<String> empnames = lst.stream().filter(e->e.getEmpSal()>5000)
		            .map(e->e.getEmpName())
		            .sorted()
		            .collect(Collectors.toList());

		System.out.println(empnames);
	}

}
