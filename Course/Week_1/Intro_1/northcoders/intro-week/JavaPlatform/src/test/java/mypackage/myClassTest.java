package mypackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class myClassTest {
    @Test
    void testmyMethod() {
        assertEquals(0, myClass.myMethod(7));
    }
}