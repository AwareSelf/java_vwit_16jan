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
	private String str;
	
    public Scalar(String output) {  
        System.out.print(output);  
        this.str = output;
    }
	
    @Override
	public String toString() {
		return "Scalar [str=" + str + "]";
	}  
    
       
}  

public class ConstructorRef {
		
	    public static void main(String[] args) { 
	    	
	    	MyInterface ref1 = (s) -> new Scalar(s); //instance of that class which is overriding the display method in MyInterface -> done using lambda func
	    	Scalar ob = ref1.display("Scalar World!");
	    	System.out.println(ob);
	    	
	    	//Method reference to a constructor
	        MyInterface ref2 = Scalar::new;   //constructor method reference
	        Scalar ob1 = ref2.display("Scalar World!");
	        System.out.println(ob1);
	    
	}

}
