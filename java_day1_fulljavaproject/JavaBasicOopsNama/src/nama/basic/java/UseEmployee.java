package nama.basic.java;


//nama.basic.java.UseEmployee
public class UseEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Employee e = new Employee();
		e.deptno = 5;
		e.proj="XYZ";
		/*
	//	System.out.println(e.empId);
		
		
	    System.out.println(e.getEmpId());
	//	System.out.println(e.empName);
	//	System.out.println(e.empSalary);
	//	System.out.println(e.deptno);
		System.out.println(e); //e.toString(); 
		
		Employee e1 = new Employee(1,"Ram",50000.0,10);
	    System.out.println(e1); //e1.toString()  by the compiler
	    
	   //1000 
	    System.out.println(e1.computeAnnualSalary()); //function call - jump 2000
		
		Employee e2 = new Employee(2,"Shyam",60000.0,10);
		System.out.println(e2); //e2.toString()
		double annsal = e2.computeAnnualSalary(5000);
		System.out.println(annsal);
		
		//e2.empSalary=-100;
		e2.setEmpSalary(-100);
		
		System.out.println(e2.getEmpSalary());
		
	    e2.setEmpSalary(1000);
		
		System.out.println(e2.getEmpSalary());
		
		*/
		Manager m = new Manager(3,"Sita",70000,10,5,5000,50000);
		System.out.println(m); //m.toString();
		
		System.out.println(m.computeAnnualSalary());
		
		//Manager m1 = new Employee();
		//is-a relationship
		Employee x = new Manager(4,"Radha",40000,20,5,6000,40000);
		System.out.println(x); //x.toString();
		
		System.out.println(x.computeAnnualSalary());
		
		Employee x1 = new Employee(5,"Meeta",40000,20);
		System.out.println(x1); //x.toString();
		
		System.out.println(x1.computeAnnualSalary());
		
		
		func(x);
		func(x1);
		func(new Employee(6,"Sheetal",35000,10));
		
		//get manager details 
		func(new Manager(7,"Megha",75000,20,10,5000,50000));
		func(new WageEmployee());
	

	}
	 
	//code should be open for extension but close for modification
	//extensibility --> one of the oops principle
	  static void func(Employee e) //e=x1;
	  {
		  System.out.println(e);
		  System.out.println(e.computeAnnualSalary());
		  
		  if(e instanceof Manager)
		  {  
			((Manager)e).delegate();
		  
		  }
	  }

}
