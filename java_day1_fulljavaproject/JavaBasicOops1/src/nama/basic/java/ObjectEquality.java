package nama.basic.java;

public class ObjectEquality {

	public static void main(String[] args) {
		
	    int no=5;
	    int no1=5;
	    System.out.println(no==no1);
		
	    Employee x=null; //its Employee reference
	    x =  new Employee(1,"Ram",50000.0,10); //Employee reference is pointing to Employee object
	    
        Employee e1 = new Employee(1,"Ram",50000.0,10); 
		
		Employee e2 = new Employee(1,"Ram",50000.0,10); 
		
		System.out.println(e1==e2); // false as their memory locations are different
	    
		
		 e1 = new Employee(1,"Ram",50000.0,10); //2000 // e1 = 2000
		
		 e2 = new Employee(2,"Shyam",60000.0,10); //3000 // e2 = 3000
		
		System.out.println(e1==e2); //== operator in case ref type/object type , true => objects have same memory
		
		e1=e2;   // e1 = 3000
		System.out.println(e1==e2);
		System.out.println(e1);
		e1.setEmpSalary(100000);
		System.out.println(e1);
		System.out.println(e2);
		
		System.out.println("After creating a copy instead of assigning the same object...");
		//e1 = new Employee(e2.getEmpId(),e2.getEmpName(),e2.getEmpSalary(),e2.getDeptno()); //copy or clone of e2
		e1 = new Employee(e2);
		System.out.println(e1);
		System.out.println(e2);
		e1.setDeptno(30);
		System.out.println(e1);
		System.out.println(e2);
		
		
		
		
		
		

	}

}
