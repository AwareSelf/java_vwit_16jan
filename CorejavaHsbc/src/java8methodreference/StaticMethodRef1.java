package java8methodreference;
import java.util.*;

interface Sayable{  
    void say();  
}  
public class StaticMethodRef1 {  
    public static void saySomething(){  
        System.out.println(Thread.currentThread().getName()+":Hello, this is static method.");  
        
    } 
    
  
    public static void main(String[] args) {  
        // Referring static method  
    	//classname::staticmethod
    	
    	Sayable sayable1 = ()->StaticMethodRef1.saySomething();
    	sayable1.say(); 
        
    	Sayable sayable = StaticMethodRef1::saySomething;  
        // Calling interface method  
        sayable.say();  
        
        Runnable r = ()->StaticMethodRef1.saySomething();
        new Thread(r,"mythread1").start();
        
        
        Runnable r1 =  StaticMethodRef1::saySomething;
        new Thread(r1,"mythread2").start();
    }  
}  

