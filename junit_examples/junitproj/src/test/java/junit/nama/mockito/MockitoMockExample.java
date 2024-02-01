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

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;
import org.mockito.junit.jupiter.MockitoExtension;

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
//different ways to enable the use of annotations with mockito tests
//@RunWith(MockitoJUnitRunner.class) - used with junit4
@ExtendWith(MockitoExtension.class)  //--used with junit5
@TestInstance(Lifecycle.PER_CLASS)
class MockitoMockExample {
	
//	@Rule
//	public MockitoRule initRule = MockitoJUnit.rule();
	
	@BeforeAll
	public void init() {
	    MockitoAnnotations.openMocks(this);
	}

	 @Mock
	    private List<String> mockedList;
	 
	 @Spy
	 private List<String> spyList = new ArrayList<String>();
	 
	@Test
	public void whenUseMockAnnotation_thenMockIsInjected() {
		//by default, calling the methods of mock object will do nothing
	    //so size of list is still 0
	    mockedList.add("one");
	    Mockito.verify(mockedList).add("one");
	    assertEquals(0, mockedList.size());

	    Mockito.when(mockedList.size()).thenReturn(100);
	    assertEquals(100, mockedList.size());
	}
	
	    @Test
	    public void testMockList() {
	        //by default, calling the methods of mock object will do nothing
	        mockedList.add("test");
	        assertNull(mockedList.get(0));
	    }
	 
	    @Test
	    public void testSpyList() {
	        //spy object will call the real method when not stub
	        spyList.add("test");
	        assertEquals("test", spyList.get(0));
	    }
	 
	    @Test
	    public void testMockWithStub() {
	        //try stubbing a method
	        String expected = "Mock 100";
	        when(mockedList.get(100)).thenReturn(expected);
	 
	        assertEquals(expected, mockedList.get(100));
	    }
	 
	    @Test
	    public void testSpyWithStub() {
	        //stubbing a spy method will result the same as the mock object
	        String expected = "Spy 100";
	        
	     //   don't use when-thenReturn:real method gets called so spy.get(0) throws 
	     //   IndexOutOfBoundsException (the list is yet empty)
	     //   for when(spyList.get(0)).thenReturn(expected);

  
	        //take note of using doReturn instead of when
	        doReturn(expected).when(spyList).get(100);
	 
	        assertEquals(expected, spyList.get(100));
	    }

}
