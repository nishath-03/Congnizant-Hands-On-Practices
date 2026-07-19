package com.deepskilling.junit.basic.exercise3;

import org.junit.Test;
import static org.junit.Assert.*;

// Demonstrates various assertions in JUnit (Exercise 3)
public class AssertionsTest {

    @Test
    public void testAssertions() {
        // Assert equals
        assertEquals(5, 2 + 3);

        // Assert true
        assertTrue(5 > 3);

        // Assert false
        assertFalse(5 < 3);

        // Assert null
        assertNull(null);

        // Assert not null
        assertNotNull(new Object());
    }
}
