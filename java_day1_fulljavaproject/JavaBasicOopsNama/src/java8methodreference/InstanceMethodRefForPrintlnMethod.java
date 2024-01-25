package java8methodreference;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//using static method reference - java 8
public class InstanceMethodRefForPrintlnMethod {

	public static void main(String[] args) throws FileNotFoundException {

	     Consumer con =  (a)->System.out.println(a);
	     
	     //System.out::println is ref to a instance method println inside PrintStream class
	     // out is an instance PrintStream class in IO package
//println is an instance method which can be the overriden method def for Consumer interface
	     Consumer con1 = System.out::println;  //instance method reference 
	//     System.out.println --- definition -- println -> accept 1 arg return void
		
         List<Integer> lstint = Arrays.asList(10,20,30,40);
         lstint.forEach(con1); //bcz forEach accepts instance of Consumer as an arg
         //above line is same as
         lstint.forEach(System.out::println);
         
         PrintStream out = new PrintStream(new File("abc.java"));
         lstint.forEach(out::println);

	}

}

