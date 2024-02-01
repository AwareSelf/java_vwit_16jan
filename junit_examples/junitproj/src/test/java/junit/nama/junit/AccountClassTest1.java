package junit.nama.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import customeexception.Account;
import customeexception.InsufficientBalanceException;




@TestMethodOrder(OrderAnnotation.class)
public class AccountClassTest1 {

	static Account ob;
	
	@BeforeAll
	static void setup()
	{
		 ob = new Account("Prateek Joshi",1001,2000);
	}

	
	@DisplayName("withdraw testing")
	@Test
	@Order(2)
	void testWithdraw() {
		
	
		try
		{
			
		
		  ob.withdraw(1000); //bal=3500, 3500-1000, bal=2500
		  
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		double bal = ob.getBalance();
		assertEquals(2500,bal,"withdraw of Account not working as expected");
	}
	
	
	
	@DisplayName("test deposit method of Account")
	@Test
	@Order(1)
	void testDeposit() {
		
	
		try
		{
				 
		  ob.deposit(1500);  //2000+1500=3500 //bal=3500
		  
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		double bal = ob.getBalance();
		System.out.println("balance after deposit 1500:"+bal);
		assertEquals(3500,bal,"deposit of Account not working as expected");
	}

	

	
	//continuous withdrawl three times with diff amt from same account
	@DisplayName("testing withdraw func for Insufficient Balance Exception")
	@ParameterizedTest
	@Order(4) //0 => 100
	@ValueSource(doubles= {100})
	void testWithdraw2(double args) {
		
	
		try
		{
			
			System.out.println("\nBalance before withdrawl:bal="+ob.getBalance());
		  ob.withdraw(args);
		  
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		 assertThrows(InsufficientBalanceException.class,
				 ()->ob.withdraw(args),"Insufficient Balance Test failed..");
	}
	
	//continuous wihtdrawal with three diff amt from three diff accounts (each with mim bal=1500)
	@DisplayName("withdraw testing for diff args-check boundary values")
//	@ParameterizedTest
    @ParameterizedTest(name="continuous withdrawal:#{index}-Run test with args={0}")
	@Order(3) //2500 => 0,2000,500 => bal=0
	@ValueSource(doubles= {0,2000,500})
	void testWithdraw3(double args) {
		
	   
		try
		{
			
		   ob.withdraw(args);
		  
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		double bal = ob.getBalance();
		System.out.println("after withdrawing amt="+args+",current bal="+bal);
		assertTrue(bal >= 0,"repeated withdrawl test fail");
	}
	
	

}
