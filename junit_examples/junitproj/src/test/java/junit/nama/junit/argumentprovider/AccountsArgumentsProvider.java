package junit.nama.junit.argumentprovider;

import java.util.stream.Stream;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import customeexception.Account;

public class AccountsArgumentsProvider implements ArgumentsProvider  {

	
	@Override
	public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
	    return Stream.of(
		          Arguments.of(new Account("Prateek Joshi",1001,2000)),
		  		
		          Arguments.of(new Account("Namrata Marathe",1002,5000)), 
		          Arguments.of(new Account("Rahul Marathe",1003,7000)) //,
		          //Arguments.of(new Account("Arjun Marathe",1004,0)) 
		        );
		}
}
