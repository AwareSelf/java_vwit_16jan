package junit.nama.junit.dynamictest;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;
import java.util.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.TestInfo;

/*
 * A dynamic test is a test that generated at runtime by factory method using 
 * @TestFactory annotation. 
 * The method marked @TestFactory is not a test case, rather it’s a factory for 
 * test cases.
 */
public class DynamicTestEx {
	
	  @BeforeEach
	  void beforeEach(TestInfo info) {
	    System.out.println("Before execute "+info.getTestMethod().get().getName());
	  }
	  
	  // Static test 1
	  @Test
	  void test_Add() {
		
	    assertEquals(5, Math.addExact(3, 2));
	  }
	  
	  // This method produces Dynamic test cases
	  @TestFactory
	    List<DynamicTest> dynamicTestsFromCollection() {
	    
	        return Arrays.asList(
	            dynamicTest("1st dynamic test", () -> assertTrue(Math.addExact(3, 2)==5)),
	            dynamicTest("2nd dynamic test", () -> assertEquals(5, Math.floorDiv(25, 5)))
	        );
	    }
	  // Static test 2
	  @Test
	  void test_Devide() {
	    assertEquals(5, Math.floorDiv(25, 5));
	  }
	  
	  @AfterEach
	  void afterEach(TestInfo info) {
	    System.out.println("After execute "+info.getTestMethod().get().getName());
	  }
	}