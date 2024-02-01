package junit.nama.mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;
import org.mockito.junit.jupiter.MockitoExtension;

import mymath.Calculator;

//https://www.baeldung.com/mockito-annotations


/*
Often you heard developers how to spy and mock in Mockito in unit test but 
what are the difference between spy and mock in Mockito API? Both can be used
to mock methods or fields. The difference is that in mock, you are creating a
complete mock or fake object while in spy, there is the real object and you 
just spying or stubbing specific methods of it.

When using mock objects, the default behavior of the method when not stub is do 
nothing. Simple means, if its a void method, then it will do nothing when you 
call the method or if its a method with a return then it may return null, empty 
or the default value.

While in spy objects, of course, since it is a real method, when you are not 
stubbing the method, then it will call the real method behavior. 
If you want to change and mock the method, then you need to stub it.
 */
//using Mock and Spy for the instance of Calculator class

@ExtendWith(MockitoExtension.class)  //--used with junit5
@TestInstance(Lifecycle.PER_CLASS)
class MockitoMockExample1 {
	

	 @Mock
	    private Calculator calci;
	 
	 @Spy
	 private Calculator calci1 = new Calculator(10,20);
	 
	 @Captor
      ArgumentCaptor<Double> argCaptor;
	 
	@Test
	public void whenUseMockAnnotation_thenMockIsInjected() {
		//by default, calling the methods of mock object will do nothing
	    //so size of list is still 0
	  
		double res = calci.add();
		System.out.println(res);
	    Mockito.verify(calci).add();
	    assertEquals(0, calci.add()); //mock method are do nothing methods so they return null/0.0

	    //stub mock methods for expected behaviour
	    Mockito.when(calci.add()).thenReturn(30.0);
	    assertEquals(30.0,calci.add());
	}
	
	@Test
	public void whenUseSpyAnnotation_thenSpyIsInjected() {
		//by default, calling the methods of mock object will do nothing
	    //so size of list is still 0
	  
		double res = calci1.add();
		System.out.println(res);
	    Mockito.verify(calci1).add();
	    assertEquals(30, calci1.add()); //spy methods will have  behaviour added to them (they arenot do nothing methods)

	    //stub spy method- spy:calci1 (spy of Calculator instance):stub method add
	    //u will stub spy method when u expect it to behave in diff way than normal behaviour
	    //u expect it to return 300 instead of 30 when u call add method on it
	    doReturn(300.0).when(calci1).add();
	       
	    assertEquals(300.0,calci1.add());
	}
	
	@Test
	public void whenUseMockAnnotationArgCapture() {
		//by default, calling the methods of mock object will do nothing
	    //so size of list is still 0
	  
		calci.setOp1(15);
		
	    Mockito.verify(calci).setOp1(argCaptor.capture());
	    
	    assertEquals(15,argCaptor.getValue(),"Test fail:setOp1 arg should have been 15");
	  
	    calci.setOp2(20);
	    
        Mockito.verify(calci).setOp2(argCaptor.capture());
	    
	    assertEquals(20,argCaptor.getValue(),"Test fail:setOp2 arg should have been 20");
	
	    
	    /*
	      need to stub mock add method as for mock, add meth will return 0.0
	     */    
	    Mockito.when(calci.add()).thenReturn(35.0);
	    assertEquals(35.0,calci.add());
	    
	       
	    
	}
	
	@Test
	public void whenUseSpyAnnotationArgCapture() {
		//by default, calling the methods of mock object will do nothing
	    //so size of list is still 0
	  
		calci1.setOp1(15);
		
	    Mockito.verify(calci1).setOp1(argCaptor.capture());
	    
	    assertEquals(15,argCaptor.getValue(),"Test fail:setOp1 arg should have been 15");
	  
	    calci1.setOp2(20);
	    
        Mockito.verify(calci1).setOp2(argCaptor.capture());
	    
	    assertEquals(20,argCaptor.getValue(),"Test fail:setOp2 arg should have been 20");
	
	  	 
	    /*
	      no need to stub spy add method as original add method will 
	      add the two values that are set in op1 and op2 and
	      give expected result */
	    assertEquals(35.0,calci1.add());
	    
	       
	    
	}
	
     
     
      

}
