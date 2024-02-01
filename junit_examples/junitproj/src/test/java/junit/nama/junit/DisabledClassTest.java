package junit.nama.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

//JUnit4 had @Ignore annotation for disabling the test
@Disabled("Disabled until bug #2019 has been fixed!")
public class DisabledClassTest {

    @Test
    void test1Plus1() {
        assertEquals(2, 1 + 1);
    }

    @Test
    void test2Plus2() {
        assertEquals(4, 2 + 2);
    }

}

 //testcases test B   B -> A (reworked)