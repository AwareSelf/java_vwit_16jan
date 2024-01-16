package nama.basic.java;


//every class in java extends Object
public class Employee {
	
	int empId;
	String empName;
	double empSalary;
	int deptno;
	
	
	
	public Employee()
	{
		System.out.println("0 arg Employee constructor called..");
	}
	
	public Employee(int empId,String empName,double empSalary,int deptno)
	{
		
		System.out.println("arg-wala Employee constructor called..");
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.deptno = deptno;
		
	}
	
	
	public double computeAnnualSalary()
	{
		return this.empSalary*12;
	}
	
	
	@Override
	public String toString()
	{
		
		return "emp details:empid:"+this.empId
			   +", empname:"+this.empName
			   +", empsalary:"+this.empSalary
			   +", empdeptno:"+this.deptno;
	}
	
	

}
