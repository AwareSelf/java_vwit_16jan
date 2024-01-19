package datastructures.recursion;

/*
Fibonacci Series
Fibonacci Numbers are the numbers is the integer sequence 
where Fib(N) = Fib(N-2) + Fib(N-1). Below is the example to find 3,4,5.

Fib series: 0 1 1 2 3 5 8 ...
Fib(n position):
Fib(0) = 0
Fib(1) = 1
Fib(2) = Fib(1) + Fib(0) = 1 + 0 = 1
Fib(3) = Fib(2) + Fib(1) = 1 + 1 = 2
Fib(4) = Fib(3) + Fib(2) = 2 + 1 = 3
Fib(5) = Fib(4) + Fib(3) = 3 + 2 = 5
 */

//Java Program to implement
//Fibonacci Series
import java.io.*;

//Driver Function
public class FibonacciRecursion {

	// Function to return Fibonacci value
	static int Fib(int N)
	{
		if (N == 0 || N == 1)
			return N;

		return Fib(N - 1) + Fib(N - 2);
	}

	// Main function
	public static void main(String[] args)
	{
		//Fibonacci of 0th pos: 0
		System.out.println("Fibonacci of 0th position: Fibonacci of 0: "+
				+ Fib(0));
		
		//Fibonacci of 1st pos: 0 1
				System.out.println("Fibonacci of 1st position: Fibonacci of 1: "+
						+ Fib(1));
		//Fibonacci of 2nd pos: 0 1 1
		System.out.println("Fibonacci of 2nd position: Fibonacci of 2: "+
						+ Fib(2));		
				
		// Fibonacci of 3 : 0 1 1 2 
		System.out.println("Fibonacci of 3rd position: Fibonacci of 3: "+
						+ Fib(3));

		// Fibonnaci of 4: 0 1 1 2 3
		System.out.println("Fibonacci of 4th position: Fibonacci of 4: "
						+ Fib(4));

		// Fibonacci of 5: 0 1 1 2 3 5
		System.out.println("Fibonacci of 5th position: Fibonacci of 5: "
						+ Fib(5));
	}
}

