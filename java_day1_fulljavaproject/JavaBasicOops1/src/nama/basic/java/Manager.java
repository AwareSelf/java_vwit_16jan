package nama.basic.java;

//inheritanc gives you reusability of existing code
public class Manager extends Employee {
	
	
	private int teamSize;
	private double pettyCash;
	private double varPay;

   
	
	
	
	public Manager(int empId, String empName, double empSalary, int deptno, int teamSize, double pettyCash,
			double varPay) {
	  
	    super(empId, empName, empSalary, deptno);
	    System.out.println("Manager arg-wala constructor called...");
		this.teamSize = teamSize;
		this.pettyCash = pettyCash;
		this.varPay = varPay;
		
		
	}


	

    public void delegate()
    {
    	System.out.println("Manager "+this.getEmpName()+" delegating to team of size:"+this.teamSize);
    }

	@Override
	public double computeAnnualSalary()
	{
		System.out.println("Manager class computeAnnualSalary called");
		return this.getEmpSalary()*12+this.pettyCash+this.varPay;
	}
	
	
	@Override
	public String toString()
	{
		return super.toString()+",teamSize:"+this.teamSize
				               +", pettyCash:"+this.pettyCash
				               +",varPay:"+this.varPay;
	}
	

}
