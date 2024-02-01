package junit.nama.junit.nestedtest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Nested;

public class NestedHierarchyFBLoginTest {
	
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

		@Test
		void  verifyPassword(){
			String passwd="mypasswd123";
			assertEquals(passwd,"mypasswd123","Not Valid password");
			System.out.println("NESTED CLASS - nestedPasswordClass- password tetsing");
		}
		
		@Test
		void  verifyPasswordlength(){
			String passwd="mypasswd123";
			assertEquals(passwd.length(),11,"Not Valid password length");
			System.out.println("NESTED CLASS - nestedPasswordClass-password length testing");
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