/**
 * 
 */
package mymath;

import static org.junit.jupiter.api.Assertions.*;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;



/**
 * @author namra
 *
 */
class CalculatorTest {
	
	Calculator c;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		
		c = new Calculator(20,10);
		System.out.println("before every test: create Calculator obj op1=20,op2=10:-");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

		
	@DisplayName("Test the setop1 function2")
	@Test
	void addtest2() {
		
		c.setOp1(100);	
		
		double d = c.getOp1();
		assertEquals(d,100,"Calculator setOp1 or getOp1 failed..");
		
	}
	
	@DisplayName("Test the setop2 function2")
	@Test
	void addtest22() {
		
		c.setOp2(100);	
		
		double d = c.getOp2();
	  assertEquals(d,100,"Calculator setOp2 or getOp2 failed..");
		
	}
	
	
	@DisplayName("Test the add function1")
	@Test
	void addtest1() {
		
		double r = c.add();
		Assertions.assertEquals(30,r, "Calculator add func failed...");
		
		
	}
	
	@DisplayName("Test the divide function: divisior should not be zero")
	@Test
	void dividetest() {
		
		c.setOp2(0);
		double r = c.divide1();
		assertEquals(-1,r, "Calculator divide1 func, divisor cant be zero test failed...");
		
		
	}
	
	@DisplayName("Test the divide function")
	@Test
	void dividetest1() {
		
		double r = c.divide1();
		assertEquals(2,r, "Calculator divide func.");
		
		
	}
	
	@DisplayName("Test the divide function")
	@Test
	void divide2test() {
		
		c.setOp2(0);
		double r = c.divide2();
		assertTrue(Double.isInfinite(r), "Calculator divide2 func, test for divide by zero result is infinity fails.");
		
		
	}
	
	
	
	


}
