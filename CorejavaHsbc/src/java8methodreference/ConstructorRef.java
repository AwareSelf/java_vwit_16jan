package java8methodreference;

/*
Lambda expression for method reference to a constructor of a class is:

(args) -> new ClassName(args)

The above lambda expression can get replaced by a method reference. The shorthand code looks like this:

ClassName::new
 */

@FunctionalInterface 
interface MyInterface {  
    Scalar display(String output);  
}  

class Scalar {  
    public Scalar(String output) {  
        System.out.print(output);  
    }  
}  

public class ConstructorRef {
	
	public class Example {  
	    public static void main(String[] args) { 
	    	
	    	MyInterface ref1 = (s) -> new Scalar(s);
	    	ref1.display("Scalar World!");
	    	
	    	//Method reference to a constructor
	        MyInterface ref2 = Scalar::new;  
	        ref2.display("Scalar World!");  
	    }  
	}

}
