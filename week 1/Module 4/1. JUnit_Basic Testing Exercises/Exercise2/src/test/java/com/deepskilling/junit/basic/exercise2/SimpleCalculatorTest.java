package com.deepskilling.junit.basic.exercise2;

import org.junit.Test;
import static org.junit.Assert.*;

// Unit tests for SimpleCalculator (Exercise 2)
public class SimpleCalculatorTest {

    private final SimpleCalculator calculator = new SimpleCalculator();

    @Test
    public void testAdd() {
        assertEquals("Adding 10 and 5 should be 15", 15, calculator.add(10, 5));
        assertEquals("Adding -3 and 3 should be 0", 0, calculator.add(-3, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals("Subtracting 5 from 10 should be 5", 5, calculator.subtract(10, 5));
        assertEquals("Subtracting 10 from 5 should be -5", -5, calculator.subtract(5, 10));
    }

    @Test
    public void testMultiply() {
        assertEquals("Multiplying 4 and 5 should be 20", 20, calculator.multiply(4, 5));
        assertEquals("Multiplying by zero should be 0", 0, calculator.multiply(10, 0));
    }

    @Test
    public void testDivide() {
        assertEquals("Dividing 10.0 by 2.0 should be 5.0", 5.0, calculator.divide(10.0, 2.0), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        calculator.divide(10.0, 0.0);
    }

    @Test
    public void testIsEven() {
        assertTrue("4 should be even", calculator.isEven(4));
        assertFalse("5 should not be even", calculator.isEven(5));
    }
}
