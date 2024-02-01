package junit.nama.junit.dynamictest;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
	
	List<Employee> lst =  new ArrayList<Employee>();
	
	public EmployeeDao()
	{
		
	}
	
	public Employee save(Employee e)
	{
		lst.add(e);
		return e;
	}


	
	

}
