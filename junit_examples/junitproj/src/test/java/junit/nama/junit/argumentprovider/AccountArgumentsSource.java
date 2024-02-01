package junit.nama.junit.argumentprovider;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;

import org.junit.jupiter.params.provider.ArgumentsSource;

import customeexception.Account;

class AccountArgumentsSource {

	
	@ParameterizedTest
	@ArgumentsSource(AccountsArgumentsProvider.class)
	void checkMinBal(Account act) {
	   
		 assertTrue(act.getBalance()>0,"Balance greter than zero:min bal test failed");
	}
	

	
	}
