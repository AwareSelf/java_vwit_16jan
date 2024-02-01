package junit.nama.mockito;


import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@TestInstance(Lifecycle.PER_CLASS)
@ExtendWith(MockitoExtension.class)
class InjectMockIntoSpyEx {
	  
	     
	    @Mock
	    Repository repository;

	    @InjectMocks
	    RepoService service;
	    
	
	    @BeforeAll
	    public void init() {
	        MockitoAnnotations.openMocks(this);
	      
	        //need to add below line if @InjectMocks anno is removed 
	        //repository = Mockito.mock(Repository.class);
	        
	        service = Mockito.spy(new RepoService(repository));
	     
	
	    }

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



