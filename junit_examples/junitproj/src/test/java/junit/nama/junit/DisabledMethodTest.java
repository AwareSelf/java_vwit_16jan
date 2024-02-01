package junit.nama.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Disabled;


import static org.junit.jupiter.api.Assertions.assertEquals;

//JUnit4 had @Ignore annotation for disabling the test
public class DisabledMethodTest {

    @Disabled("Disabled until CustomerService is up!")
    @Test
    void testCustomerServiceGet() {
        assertEquals(2, 1 + 1);
    }

    @Test
    void test3Plus3() {
        assertEquals(6, 3 + 3);
    }

}

