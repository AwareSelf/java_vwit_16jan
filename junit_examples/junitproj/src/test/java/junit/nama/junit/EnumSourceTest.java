package junit.nama.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.time.Month;
import java.util.EnumSet;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.params.provider.EnumSource.Mode.EXCLUDE;

//https://mkyong.com/junit5/junit-5-parameterized-tests/
/*
 * Quite similar to @ValueSource, @EnumSource is only applicable when we're going 
 * to pass just one argument per test execution.
 */
public class EnumSourceTest {

    enum Size {
        XXS, XS, S, M, L, XL, XXL, XXXL;
    	
        }

    @ParameterizedTest
    @EnumSource(Size.class)
    void test_enum(Size size) {
        assertNotNull(size);
    }

    @ParameterizedTest(name = "#{index} - Is size contains {0}?")
    @EnumSource(value = Size.class, names = {"L", "XL", "XXL", "XXXL"})
    void test_enum_include(Size size) {
    	
    	System.out.println(size.toString());
        assertTrue(EnumSet.allOf(Size.class).contains(size));
    }

    // Size = M, L, XL, XXL, XXXL
    @ParameterizedTest
    @EnumSource(value = Size.class, mode = EXCLUDE, names = {"XXS", "XS", "S"})
    void test_enum_exclude(Size size) {
        EnumSet<Size> excludeSmallSize = EnumSet.range(Size.M, Size.XXXL);
        System.out.println("after excluding small size:"+ excludeSmallSize);
       System.out.println(size);
        assertTrue(excludeSmallSize.contains(size));
    }
    
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