package hasarelationship.containment;

public class Emp {
	
	private int empid;
	private String name;
	private double salary;
	private Dept dept;
	
	public Emp()
	{
		System.out.println("0 arg Emp constructor called..");
	}
		
	public Emp(int empid,String name,double salary)
	{
		System.out.println("args-wala Emp constructor called..");
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	//overloaded constructor
	public Emp(int empid,String name,double salary,Dept dept)
	{
		System.out.println("args-wala Emp constructor called..");
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}
	
	
	/**
	 * @return the dept
	 */
	public Dept getDept() {
		return dept;
	}

	/**
	 * @param dept the dept to set
	 */
	public void setDept(Dept dept) {
		
		this.dept = dept;
	}

	public double calcAnnSal()
	{
		return this.salary*12;
	}
	
	public double calcAnnSal(double bonus)
	{
		System.out.println("overloaded calcAnnSal with bonus called..");
		return this.salary*12 + bonus;
	}
	
	@Override
	public String toString()
	{
		return "Emp details: empid="+this.empid
						+",  name="+this.name
						+", salary="+this.salary
						+", dept details="+this.dept.toString();
	}
}
