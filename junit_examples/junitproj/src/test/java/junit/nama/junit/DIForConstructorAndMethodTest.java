package junit.nama.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/*
In this example, We will talk and learn about Dependency Injection for 
Constructors and Methods

In all previous JUnit versions, test constructors or methods were not allowed to 
have parameters. We have one of the major changes in JUnit Jupiter, both test 
constructors and methods are now permitted to have parameters. 
These allow for greater flexibility and enable Dependency Injection for 
constructors and methods.

In case if a test class method or constructor, or a lifecycle method accepts 
TestInfo as a parameter then the parameter must be resolved at runtime by 
automatically registered ParameterResolver.

We can use TestInfo to retrieve information about the current container or test 
such as the display name, the test class, the test method, and associated tags.
*/
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
 
import java.util.Set;
 
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import junit.nama.junitbasictest.MyUtils;
 
/*
 * In the output section, you can see that message from the constructor has 
 * appeared two times, one for each test case. 
 * This proves that the constructor of the JUnit test class is executed before 
 * each test method.
 */

@DisplayName("Dependency Injection for Constructors and Methods")
public class DIForConstructorAndMethodTest {
 
	private static MyUtils myUtils;
	
	public DIForConstructorAndMethodTest(TestInfo testInfo) {
		System.out.println("Inside DIForConstructorAndMethodTest Constructor..");
		String displayName = testInfo.getDisplayName();
		assertEquals("Dependency Injection for Constructors and Methods", displayName);
	}
	
	@BeforeAll
	static void setUp(TestInfo testInfo) {
		myUtils = new MyUtils();
		System.out.println("Test data set up is done..");
		System.out.println(testInfo.getTags());
	}
	
	
	@BeforeEach
	void beforeEach() {
		System.out.println("@BeforeEach is executed..");
	}
	
	@Test
	@Tag(value = "tag_1")
	@DisplayName(value = "adding two positive numbers")
	void test_add_two_positive_numbers(TestInfo testInfo) {
		int actualResult = myUtils.add(20, 10);
		assertEquals(30, actualResult);
		Set<String> tags = testInfo.getTags();
		System.out.println(tags);
		assertTrue(tags.contains("tag_1"));
	}
	
	@Test
	@Tag(value = "tag_2")
	@DisplayName(value = "adding two negtaive numbers")
	void test_add_two_negative_numbers(TestInfo testInfo) {
		int actualResult = myUtils.add(-20, -10);
		assertEquals(-30, actualResult);
	}
	
	@Test
	@DisplayName(value = "adding one positive and one negative number")
	void test_add_one_positive_and_one_negative_number() {
		int actualResult = myUtils.add(20, -10);
		assertEquals(10, actualResult);
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("@AfterEach is executed..");
	}
	
	@AfterAll
	static void tearDown(TestInfo testInfo) {
		myUtils = null;
		System.out.println("Test data teardown is done..");
		//System.out.println(testInfo.getTags());
	}
}