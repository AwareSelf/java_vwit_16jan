package junit.nama.mockito;


import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class InjectMockEx {
	    @Mock
	    Repository repository;

	    //service has one of the property of type Repository
	    //@InjectMocks allows to mock the property inside the RepoService class
	    @InjectMocks
	    RepoService service;

	    @Test
	    void testSuccess() {
	        // Setup mock scenario
	        try {
	            Mockito.when(repository.getStuff()).thenReturn(Arrays.asList("A", "B", "CDEFGHIJK", "12345", "1234"));
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        // Execute the service that uses the mocked repository
	        List<String> stuff = service.getStuffWithLengthLessThanFive();

	        // Validate the response
	        Assertions.assertNotNull(stuff);
	        Assertions.assertEquals(3, stuff.size());
	    }

	    @Test
	    void testException() {
	        // Setup mock scenario
	        try {
	            Mockito.when(repository.getStuff()).thenThrow(new SQLException("Connection Exception"));
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        // Execute the service that uses the mocked repository
	        List<String> stuff = service.getStuffWithLengthLessThanFive();

	        // Validate the response
	        Assertions.assertNotNull(stuff);
	        Assertions.assertEquals(0, stuff.size());
	    }
 }



