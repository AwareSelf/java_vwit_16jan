package java8methodreference;

import java.util.ArrayList;
import java.util.List;

/*
Type 2: Reference to an instance method of a particular object
If a Lambda expression is like:

// If a lambda expression just call a default method of an object 

(args) -> obj.instanceMethod(args) 

Then method reference is like:

// Shorthand if a lambda expression just call a default method of an object 

obj::instanceMethod 
*/

interface Sayablex{  
    void say();  
}  
public class InstanceMethRef1 {  
    public void saySomething(){  
        System.out.println("Hello, this is non-static method.");  
    }  
    public static void main(String[] args) {  
      
    	    // Referring non-static method by creating object on fly  
            //using lambda
            Sayablex s = ()->new InstanceMethRef1().saySomething();
            s.say();
            
            //using method reference syntax
            Sayablex s1 = new InstanceMethRef1()::saySomething; 
            s1.say();
            
            // Creating object and assigning it to reference
            InstanceMethRef1 ob = new InstanceMethRef1();   
            // Referring non-static method using reference  
            //using lambda
            Sayablex ss = ()->ob.saySomething();
            ss.say();
            
            //using method reference syntax
            Sayablex ss1 = ob::saySomething;  
            ss1.say();  
             
            
            
           
    }  
}  

