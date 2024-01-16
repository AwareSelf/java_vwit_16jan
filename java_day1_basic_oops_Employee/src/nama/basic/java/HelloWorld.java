package nama.basic.java;

public class HelloWorld {
	
	String greetMsg1; //instance property/object property
	
	static String greetMsg2;

	/**
	 * @param args
	 */
	
	
	void display() //instance method can access instance property
	{
		//System.out.println(greetMsg1);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  if(args.length >= 2) { System.out.println(args[0]);
		  System.out.println(args[1]); }
		 
		
		System.out.println("Hi All");
		
		
		HelloWorld ob = new HelloWorld();
		ob.greetMsg1 = "AAA";
		
		
		HelloWorld ob1 = new HelloWorld();
		ob1.greetMsg1 = "BBB";
	//	ob1.greetMsg2 = "kk";
		
		greetMsg2 = "HI Everyone!";
		System.out.println(greetMsg2);
		
		
		
		B.func();
		
		System.out.println(greetMsg2);
		
		
		func1();
		
		
		Employee e = new Employee();
		System.out.println(e.empId);
		System.out.println(e.empName);
		System.out.println(e.empSalary);
		System.out.println(e.deptno);
		System.out.println(e);
		
		
		int no=6;
		System.out.println(no);
		
		Employee e1 = new Employee(1,"Ram",50000.0,10);
	    System.out.println(e1); //e1.toString()  by the compiler
	    
	    System.out.println(e1.computeAnnualSalary());
		
		Employee e2 = new Employee(2,"Shyam",60000.0,10);
		System.out.println(e2); //e2.toString()
		double annsal = e2.computeAnnualSalary();
		System.out.println(annsal);
		
		

	}
	
	
	static void func1()
	{
		
	}

}


class B
{
	
	static void func()
	{
		HelloWorld.greetMsg2 = "Hello";
		System.out.println(HelloWorld.greetMsg2);
		
		
		HelloWorld obb = new HelloWorld();
		obb.greetMsg1 ="hhh";
		obb.display();
	}
	
}