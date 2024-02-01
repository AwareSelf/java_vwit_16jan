package junit.nama.junit.dynamictest;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.stream.Stream;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class StringDynamicTest {
	
    @TestFactory
    Stream<DynamicTest> dynamicTestsForPalindromes() {
    	
        return Stream.of("pop", "radar", "mom", "dad","madam")
            .map(inputText -> 
                        dynamicTest(inputText, 
            		    () -> assertTrue(isPalindrome(inputText))
            	));
    }
 
    /**
     * Method to check whether input String is Palindrome or not
     * @param inputText 
     * @return return true if input is Palindrome else false
     */
    boolean isPalindrome(String inputText) {
		return new StringBuffer(inputText).reverse().toString().equals(inputText);
    }

}
