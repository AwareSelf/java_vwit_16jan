package junit.nama.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import customeexception.Account;
import customeexception.InsufficientBalanceException;
import junit.nama.junitbasictest.MyUtils;


import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class AccountClassOrderTest {

	
	static Account ob;
		
	@BeforeAll
	public static void setupatstart()
	{
		 ob = new Account("Prateek Joshi",1001,2000);
		System.out.println("Do initial setup before all testcases run..");
	}
	
	// 1    | withdraw | amt <= bal  | bal=2000,amt=1500 | bal=500 | pass
	@DisplayName("withdraw testing")
	@Test
	void testWithdraw() {
		
	
		try
		{
			
		
		  ob.withdraw(1500); //500
		  
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		double bal = ob.getBalance();
		
		assertEquals(500,bal,"withdraw of Account not working as expected");
	}
	
	
	
	// 5    | deposit  | bal = bal+amt  | bal=2000,amt=1500 | bal=3500 |pass
	@DisplayName("test deposit method of Account")
	@Test
	void testDeposit() {
		
	
		try
		{
				 
		  ob.deposit(1500);
		  
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		double bal = ob.getBalance();
		assertEquals(3500,bal,"deposit of Account not working as expected");
	}
	
	// 2    | withdraw | amt <= bal | bal=2000,amt=2000 | bal=0 | pass
	@DisplayName("test withdraw if bal  is equal to amount")
	@Test()
	void testNotInsufficientBalance()
	{
		try
		{
		 ob.withdraw(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	     double bal = ob.getBalance();
		  assertEquals(0,bal,"withdraw method test failed for amt same as bal");
	}
	
	//3    | withdraw | amt <= bal  | bal=2000,amt=3000 |InsufficientBalance exception shuld thrown| pass
	@DisplayName("test withdraw if bal  less than amount")
	@Test()
	void testInsufficientBalance()
	{
	      System.out.println("balance before withdraw:"+ob.getBalance());	
		  assertThrows(InsufficientBalanceException.class,
				 ()->ob.withdraw(2001));
	}
	
	
	@AfterEach
	public void tear()
	{
		System.out.println("After every tes has run do this cleanup/tear down");
	}
	
	@AfterAll
	public static void tearAll()
	{
		System.out.println("runs once after all testcases have run..");
		
		
	}

	
	
	
//	assertDoesNotThrow

}
