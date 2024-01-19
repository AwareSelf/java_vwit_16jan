package datastructures.recursion;

/*
 * 
Factorial Using Recursion
The classic example of recursion is the computation of the factorial of a number. 
The factorial of a number N is the product of all the numbers between 1 and N. 
The below-given code computes the factorial of the numbers: 3, 4,  and 5.

3=  3 *2*1 (6)
4=  4*3*2*1 (24)
5=  5*3*2*1 (120)
 
*/

public class FactorialRecursion {
	
	public static void main(String[] args)
	{
		FactorialRecursion f = new FactorialRecursion();
		 
	        System.out.println("Factorial of 3 is "
	                           + f.fact(3));
	        System.out.println("Factorial of 4 is "
	                           + f.fact(4));
	        System.out.println("Factorial of 5 is "
	                           + f.fact(5));
		
	}
	
	int fact(int n)
	{
	    if (n <= 1) // base case
	        return 1;
	    else    
	        return n*fact(n-1);    
	}


}

