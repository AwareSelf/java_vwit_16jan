package collections;
import java.util.*;

import nama.basic.java.Employee;

public class WhyGenerics {

	public static void main(String[] args) {
	
		//generics info is erased at runtime
		//bytecode has no generics in it
		//generics are giving is for compile time meant for compiler
		//you can write a code without using Generics also
		//but that code will be more liable for wrong insertion of data
		List l = new ArrayList(); //in ur mind --> list of String, compiler list of Object types
		//List l is going to belist of Object types so anything extends Object can be added
		l.add("Namrata");
		l.add(34); //problem is compiler will not stop you from adding Integer here
		l.add("jjj");
		l.add(new Employee(2,"Shyam",60000.0,20));//compiler will not stop u from adding Emp as EMp extends from Object
		
		//this will giev issue as u are expecting list of String obects
		//so it will run into classcastexception
		//To avoid adding wrong type. mention generic type String of List on line no 15
		//So that compiler will stop u from adding non-String object into the List
		display(l);
		
		List<String> l1 = new ArrayList<String>();
		l1.add("Namrata");
	//	l1.add(34);
	//	l1.add(new Employee(2,"Shyam",60000.0,20));
        l1.add("Disha");
		display(l1);
		
		
	}
	
	
	//it is supposed to be a list of strings
	static void display(List<String> l)
	{
		
		Iterator<String> itr = l.iterator();
	    while(itr.hasNext())
	    {
	    	String s = itr.next();
	    }
		
		l.forEach((String val)->System.out.println(val));
	}

}
