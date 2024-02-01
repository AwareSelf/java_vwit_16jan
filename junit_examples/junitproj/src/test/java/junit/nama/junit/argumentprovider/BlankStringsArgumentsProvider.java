package junit.nama.junit.argumentprovider;

import java.util.stream.Stream;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

public class BlankStringsArgumentsProvider implements ArgumentsProvider  {

	
	@Override
	public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
	    return Stream.of(
		          Arguments.of((String) null), 
		          Arguments.of(""), 
		          Arguments.of("   ") 
		        );
		}
}
