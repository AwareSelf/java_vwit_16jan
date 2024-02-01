package junit.nama.junit.argumentprovider;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assumptions.*;

import org.junit.jupiter.params.ParameterizedTest;

import org.junit.jupiter.params.provider.ArgumentsSource;

class StringArgumentsSourceEx {

	
	@ParameterizedTest
	@ArgumentsSource(BlankStringsArgumentsProvider.class)
	void isBlank_ShouldReturnTrueForEmptyStringsArgProvider(String input) {
	   assumeTrue(input!=null);
		 assertTrue(input.isBlank());
	}
	
	@ParameterizedTest
	@ArgumentsSource(BlankStringsArgumentsProvider.class)
	void isEmpty_ShouldReturnTrueForEmptyStringsArgProvider(String input) {
		 assumeTrue(input!=null);
		assertTrue(input.isEmpty());
		
	}
	
	
	}

