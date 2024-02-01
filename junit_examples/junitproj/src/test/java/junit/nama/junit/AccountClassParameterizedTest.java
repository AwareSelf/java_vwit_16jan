package junit.nama.junit;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assumptions.*;

import org.junit.jupiter.api.Assumptions;

import customeexception.Account;
import customeexception.InsufficientBalanceException;


public class AccountClassParameterizedTest {

	static Account ob;
	
	@BeforeAll
	static void setup()
	{
		 ob = new Account("Prateek Joshi",1001,1500);
	}

	
	//continuous withdrawl three times with diff amt from same account
	@DisplayName("withdraw testing for diff args")
	@ParameterizedTest(name="continuous withdrawal:#{index}-Run test with args={0}")
	@ValueSource(doubles= {10,20,30})
	void testWithdraw2(double args) {
		
	
		try
		{
			
			System.out.println("\nBalance before withdrawl:bal="+ob.getBalance());
		  ob.withdraw(args);
		  
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		double bal = ob.getBalance();
		System.out.println("after withdrawing amt="+args+",current bal="+bal);
		assertTrue(bal >= 0,"balance is less than zero test fail");
	}
	
	//continuous wihtdrawal with three diff amt from three diff accounts (each with mim bal=1500)
	@DisplayName("withdraw testing for diff args-check boundary values")
	@ParameterizedTest(name="independant account withdraw:#{index}-Run test with args={0}")
	@ValueSource(doubles= {0,1499,1500})
	void testWithdraw3(double args) {
		
	    Account ob1=null;
		try
		{
			
		   ob1 = new Account("Prateek Joshi",1001,1500);
		   System.out.println("\nBalance before withdrawl:bal="+ob1.getBalance());
		  ob1.withdraw(args);
		  
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		double bal = ob1.getBalance();
		System.out.println("after withdrawing amt="+args+",current bal="+bal);
		assertTrue(bal >= 0,"balance is less than zero test fail");
	}
	
	  @ParameterizedTest
	  @CsvFileSource(resources = "data.csv", numLinesToSkip = 1)
	void testWithdraw4(double initbal,double amt,double expbal) {
		System.out.println("before assume:"+initbal);
		  Assumptions.assumeFalse(initbal<=0,"Assumption failed test skipped:initbal entry in csv file incorrect:"+initbal);
			System.out.println("after assume:"+initbal);
		  Account ob1=null;
		try
		{
			
		   ob1 = new Account("Prateek Joshi",1001,initbal);
		   System.out.println("\nBalance before withdrawl:bal="+ob1.getBalance());
		  ob1.withdraw(amt);
		  
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		double bal = ob1.getBalance();
		System.out.println("after withdrawing amt="+amt+",current bal="+bal);
		  assertEquals(expbal, bal);
	}
	
	

}
