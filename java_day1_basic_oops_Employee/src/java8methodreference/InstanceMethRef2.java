package java8methodreference;

/*
Type 2: Reference to an instance method of a particular object
If a Lambda expression is like:

// If a lambda expression just call a default method of an object 

(args) -> obj.instanceMethod(args) 

Then method reference is like:

// Shorthand if a lambda expression just call a default method of an object 

obj::instanceMethod 
*/

 
public class InstanceMethRef2 {  
	
    public void saySomething(){  
        System.out.println("Hello, this is non-static method.");  
    }  
    
    public static void main(String[] args) {  
      
    	    // Referring non-static method by creating object on fly  
            //using lambda
            Runnable r = ()->new InstanceMethRef2().saySomething();
            new Thread(r).start();
            
            //using method reference syntax
            Runnable s1 = new InstanceMethRef2()::saySomething; 
            new Thread(s1).start();
            new Thread(new InstanceMethRef2()::saySomething).start();
            
            // Creating object and assigning it to reference
            InstanceMethRef2 ob = new InstanceMethRef2();   
            // Referring non-static method using reference  
            //using lambda
            Runnable ss = ()->ob.saySomething();
            new Thread(ss).start();
              
            
            //using method reference syntax
            Runnable ss1 = ob::saySomething;  
            new Thread(ss1).start();
            new Thread(ob::saySomething).start();
            
            Thread t = new Thread(ob::saySomething);
            t.start();
             
             
            
            
           
    }  
}  

