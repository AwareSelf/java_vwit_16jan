package java8methodreference;

import java.util.*;

//using static method reference - java 8
public class StaticMethodRefMath {

	public static void main(String[] args) {

	   
         List<Integer> lstint = Arrays.asList(10,20,30,40);
       
         int maxno = lstint.stream().reduce(0, (a,b)->Math.max(a, b));
         //IS SAME AS BELOW
         //Math::max is shorthand static method ref version of (a,b)->Math.max(a,b)
         maxno = lstint.stream().reduce(0,Math::max);
         System.out.println(maxno);
         
         
         

	}

}

