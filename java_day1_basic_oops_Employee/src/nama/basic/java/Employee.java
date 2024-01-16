package nama.basic.java;


//every class in java extends Object
public class Employee {
	
	private int empId;
	private String empName;
	private double empSalary;
	private int deptno;
	
	
	
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
	
	
	//setter and getter methods for all private properties
	
	
	
	public double computeAnnualSalary()
	{
		return this.empSalary*12;
	}
	
	
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		
		if(empSalary>0)
		{
		  this.empSalary = empSalary;
		}
		else
		{
			System.out.println("you are trying to set salary value as:"+empSalary+",but Salary can't be -ve");
		}
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public int getEmpId() {
		return empId;
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
