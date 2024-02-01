package junit.nama.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrangeActAssertTestMethodStructure {

	@Test
	void test() {
		
		//Arrange
		Calculator c = new Calculator();
		int dividend = 10;
		int divisor = 5;
		int expectedResult = 2;
		
		//Act
		int r =c.integerDivision(10,5);
		
		//Assert
		assertEquals(expectedResult,r,
				      ()-> dividend+"/"+divisor+" did not produce "+expectedResult);
		
	}

}
