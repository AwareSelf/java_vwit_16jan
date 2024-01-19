package nama.basic.java;

import java.util.Arrays;

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
		System.out.println("equals:"+e1.equals(e2));
		System.out.println(e1.hashCode()==e2.hashCode());
		
		 e1 = new Employee(1,"Ram",50000.0,10); //2000 // e1 = 2000
		
		 e2 = new Employee(2,"Shyam",60000.0,10); //3000 // e2 = 3000
		
		System.out.println(e1==e2); //== operator in case ref type/object type , true => objects have same memory

		System.out.println("hashcode of e1:"+e1.hashCode());
		System.out.println("hashcode of e2:"+e2.hashCode());
		System.out.println(e1.hashCode()==e2.hashCode());
		
		e1=e2;   // e1 = 3000
		//how many objects eligible for garbage collection - object pointed earlier by e1 reference (having address 2000)
		System.out.println(e1==e2);
		System.out.println("equals:"+e1.equals(e2));
		
		System.out.println("hashcode of e1:"+e1.hashCode());
		System.out.println("hashcode of e2:"+e2.hashCode());
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
		
		
		{
			int xno = 5;
			xno++;
			Employee ee1 = new Employee(1,"Ram",50000.0,10);
		}
		
		//Employee[] earr = new Employee[50000];
		/*
		for(int i=0;i<50000;i++) //50000
		{
			Employee ex = new Employee(1,"Ram",50000.0,10);
			ex.computeAnnualSalary();
		}
		*/
		System.gc(); //request to jvm to run the garbage collector utility
		
		//on this line no - all 50000 objects created in for loop ..all are eligible for garbage collection
		
		
	//	xno++;
		
		
		Employee[] arr = new Employee[2]; //array of 2 Employee references
		
		for(int i=0;i<2;i++)
		{  arr[i] =  new Employee(i,"Ram"+i,50000.0,10);
		   System.out.println(arr[i]);
		}
		
		Employee[] arr1 = new Employee[2]; //a
		
		for(int i=0;i<2;i++)
		{  arr1[i] =  new Employee(i,"Ram"+i,50000.0,10);
		   System.out.println(arr1[i]);
		}
		
     	System.out.println("emp array equality:"+(arr==arr1));
		
		System.out.println("emp array equality using equals method:"+(arr.equals(arr1)));
		
		System.out.println("emp array equality using Arrays class equals method:"+Arrays.equals(arr, arr1));
		
		
		
		int[] intarr1 = {1,2,3};
		int[] intarr2 = {1,2,3};
		
		System.out.println("int array equality:"+(intarr1==intarr2));
		
		System.out.println("int array equality using equals method:"+(intarr1.equals(intarr2)));
		
		System.out.println("int array equality using Arrays class equals method:"+Arrays.equals(intarr1, intarr2));
		
		
		
		

	}

}
