package junit.nama.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import enumex.*;

import java.time.Month;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.params.provider.EnumSource.Mode.EXCLUDE;

//https://mkyong.com/junit5/junit-5-parameterized-tests/
/*
 * Quite similar to @ValueSource, @EnumSource is only applicable when we're going 
 * to pass just one argument per test execution.
 */
public class CoffeePriceEnumTest {

   
    @ParameterizedTest
    @EnumSource(CupPrice.class)
    void test_enum(CupPrice price) {
        assertNotNull(price);
    }

    @ParameterizedTest(name = "#{index} - Is  contains {0}?")
    @EnumSource(value = CupPrice.class, names = {"SMALL", "LARGE"})
    void test_enum_include(CupPrice price) {
    	
    	System.out.println(price.toString()+":"+price.getPrice());
        assertTrue(EnumSet.allOf(CupPrice.class).contains(price));
    }

   
    @ParameterizedTest
    @EnumSource(value = CupPrice.class, mode = EXCLUDE, names = {"MINI","SMALL"})
    void test_enum_exclude(CupPrice cp) {
        EnumSet<CupPrice> excludeSmallSize = EnumSet.range(CupPrice.BIG,CupPrice.EXTRALARGE);
        System.out.println("after excluding small size:"+ excludeSmallSize);
        System.out.println(cp);
         assertTrue(excludeSmallSize.contains(cp));
    }
    
    @ParameterizedTest
    @EnumSource(CupPrice.class) // passing all the cup prices
    void priceBetween(CupPrice price) {
        int p = price.getPrice();
        assertTrue(p >= 5 && p <= 45);
    }
  
 
    
    //add a test to check all enum cup prices are divisible by 5
    
    
    //add a test to check all enum cup prices have a gap of rs 10 between them
    @Test
    void priceGap()
    {
    	CupPrice[] arr = CupPrice.values();
		int[] arr1 = new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			arr1[i] = arr[i].getPrice();
		}
		
		for(int p:arr1)
		 System.out.println(p);
	
		
		//arr1 has all prices of all cup sizes
		//add logic to check that there is gap of 10 in all consecutive values
	    	
    }
       
    //check that all cup sizes that are type/pattern LARGE have prices more than 20 rs
    
    @ParameterizedTest
    @EnumSource(Month.class) // passing all 12 months
    void getValueForAMonth_IsAlwaysBetweenOneAndTwelve(Month month) {
        int monthNumber = month.getValue();
        assertTrue(monthNumber >= 1 && monthNumber <= 12);
    }
    
    @ParameterizedTest
    @EnumSource(value = Month.class, names = {"APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"})
    void someMonths_Are30DaysLong(Month month) {
        final boolean isALeapYear = false;
        assertEquals(30, month.length(isALeapYear));
    }
    
    @ParameterizedTest
    @EnumSource(
      value = Month.class,
      names = {"APRIL", "JUNE", "SEPTEMBER", "NOVEMBER", "FEBRUARY"},
      mode = EnumSource.Mode.EXCLUDE)
    void exceptFourMonths_OthersAre31DaysLong(Month month) {
        final boolean isALeapYear = false;
        assertEquals(31, month.length(isALeapYear));

    }
    
   // In addition to literal strings, we can pass a regular expression to the names attribute:

    	@ParameterizedTest
    	@EnumSource(value = Month.class, names = ".+BER", mode = EnumSource.Mode.MATCH_ANY)
    	void fourMonths_AreEndingWithBer(Month month) {
    	    EnumSet<Month> months =
    	      EnumSet.of(Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER, Month.DECEMBER);
    	    assertTrue(months.contains(month));
    	}
}