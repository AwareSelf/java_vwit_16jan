package junit.nama.junit.nestedtest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Nested;

/*
 * Example With Separate Lifecycle Methods For Nested Class
We will now demonstrate an example where both the main class and the nested 
class have their lifecycle callback methods. Let’s understand the sequence of 
the workflow when such a program is executed.
 */
public class NestedHierarchyFBLoginTest1 {
	
	@BeforeAll
	static void setUp(){
	   System.out.println("@BeforeAll- FBloginTest");
	 }
	@BeforeEach
	void beforeEachTest(){
		System.out.println("@BeforeEach- FBloginTest");
	}
	
	@Test
	void verifyLoginID(){
			String id="user1";
			assertEquals(id, "user1", "Valid login id");
			System.out.println("OUTERMOST CLASS - FBloginTest");
	}

	@Nested
	class NestedPasswordClass { 
		
		
		@BeforeEach
		void beforeEachTest_nested(){
			System.out.println("@BeforeEach- nestedPasswordClass");
		}

		@Test
		void  verifyPassword(){
			String passwd="mypasswd123";
			assertEquals(passwd,"mypasswd123","Valid password");
			System.out.println("NESTED CLASS - nestedPasswordClass");
		}
		
		@Test
		void  verifyPasswordlength(){
			String passwd="mypasswd123";
			assertEquals(passwd.length(),11,"Not Valid password length");
			System.out.println("NESTED CLASS - nestedPasswordClass-password length testing");
		}
		
		@AfterEach
		void afterEachTest_nested(){
			System.out.println("@AfterEach- nestedPasswordClass");
		}
	}
	
	@AfterEach
	void afterEachTest(){
		System.out.println("@AfterEach- FBloginTest");
	}
	@AfterAll
	static void tearDown(){
		System.out.println("@AfterAll-FBloginClass");
	}
}