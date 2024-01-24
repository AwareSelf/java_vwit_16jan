package java8methodreference1;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.*;

@FunctionalInterface
interface Sayable2
{
	void say(String s);
}

public class InstanceMethRef2 {
	
	void sayHello(String name)
	{
		System.out.println("Hi "+name);
	}
	
	public void sayHi()
	{
		System.out.println(Thread.currentThread().getName()+"Hi All");
	}

	public static void main(String[] args) {
		/*
	Sayable2 sy = (str)->System.out.println(str);
	sy.say("namrata");
	
	Sayable2 sy1 = (str)-> new InstanceMethRef2().sayHello(str);	
	sy1.say("namrata");
	
	Sayable2 sy2 = new InstanceMethRef2()::sayHello;
	sy2.say("namrata");
	
	InstanceMethRef2 ob = new InstanceMethRef2();
	Sayable2 sy3 = ob::sayHello;
	sy3.say("namrata");
	
	*/
		
	System.out.println(Thread.currentThread().getName()+":heee all!");
	
	Runnable r = ()->System.out.println(Thread.currentThread().getName()+":say hi");
	new Thread(r,"MyThread").start();
	
	Runnable r1 = ()->new InstanceMethRef2().sayHi();
	new Thread(r1,"MyThread1").start();
	
	
	Runnable r2 = new InstanceMethRef2()::sayHi;
    new Thread(r2,"MyThread2").start();
    
    
    List<String> lst = Arrays.asList("apple","mango","banana","guava");
    lst.forEach((s)->System.out.println(s));
    lst.forEach(System.out::println);
    
    //since its printing String, type in angle brackets is String
    Consumer<String> c = (s)->System.out.println(s);
    c.accept("Howdy!");
    
    Consumer<String> c1 =  System.out::println;
    c1.accept("Khi khi khi");
    
    //pass Consumer ref to foreach method which implmts 
    //accept method
    lst.forEach(c1); //same as code written on line no 57
    lst.forEach(System.out::println);
	
	
	
	
	}

}
