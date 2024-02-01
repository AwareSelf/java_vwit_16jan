package junit.nama.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LazyAssertionMessageTest {


	@Test
	void test() {
		
		Calculator c = new Calculator();
		int dividend = 10;
		int divisor = 5;
		int expectedResult = 2;
		int r =c.integerDivision(10,5);
		
		//Creation of this string is expensive, 
		//and I want to create it only if the assertion failed.
		//JUnit5 supports this using Lazy Assertion Message
		assertEquals(expectedResult,r,
				      ()-> dividend+"/"+divisor+" did not produce "+expectedResult);
		
	}
	
	@Test
	void test1() {
		
		Calculator c = new Calculator();
		int dividend = 10;
		int divisor = 5;
		int expectedResult = 2;
		int r =c.integerDivision(10,5);
		assertEquals(expectedResult,r,
				      dividend+"/"+divisor+" did not produce "+expectedResult);
		
	}
	

}
