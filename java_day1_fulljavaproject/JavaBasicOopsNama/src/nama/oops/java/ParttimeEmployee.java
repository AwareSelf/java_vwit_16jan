package nama.oops.java;

import nama.basic.java.Employee;


//https://www.geeksforgeeks.org/access-modifiers-java/
public class ParttimeEmployee extends Employee {
	
	int partTimeDuration;

	public ParttimeEmployee() {
		
		this.proj = "aaa";  //protected is visible in another package to a derived class/subclass
		
		
	}
	
	public static void main(String[] args)
	{
		ParttimeEmployee ob = new ParttimeEmployee();
		ob.proj = "AAA";
	}
	
	
	static void func()
	{
		ParttimeEmployee ob = new ParttimeEmployee();
		ob.proj = "AAA";
	}
	

}
