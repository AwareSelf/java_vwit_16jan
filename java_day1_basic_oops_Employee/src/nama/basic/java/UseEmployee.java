package nama.basic.java;

public class UseEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee();
	//	System.out.println(e.empId);
		System.out.println(e.getEmpId());
	//	System.out.println(e.empName);
	//	System.out.println(e.empSalary);
	//	System.out.println(e.deptno);
		System.out.println(e);
		
		Employee e1 = new Employee(1,"Ram",50000.0,10);
	    System.out.println(e1); //e1.toString()  by the compiler
	    
	    System.out.println(e1.computeAnnualSalary());
		
		Employee e2 = new Employee(2,"Shyam",60000.0,10);
		System.out.println(e2); //e2.toString()
		double annsal = e2.computeAnnualSalary();
		System.out.println(annsal);
		
		//e2.empSalary=-100;
		e2.setEmpSalary(-100);
		
		System.out.println(e2.getEmpSalary());
		
	    e2.setEmpSalary(1000);
		
		System.out.println(e2.getEmpSalary());

	}

}
