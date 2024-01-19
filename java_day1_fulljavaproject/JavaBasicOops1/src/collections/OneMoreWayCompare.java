package collections;
import java.util.*;

import nama.basic.java.Employee;

public class OneMoreWayCompare implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		
		return  (int)(o1.getEmpSalary() - o2.getEmpSalary());
	}

}


