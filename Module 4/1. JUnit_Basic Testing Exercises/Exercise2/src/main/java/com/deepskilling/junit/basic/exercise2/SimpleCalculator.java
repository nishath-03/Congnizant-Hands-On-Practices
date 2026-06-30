package com.deepskilling.junit.basic.exercise2;

// A simple calculator utility class to provide basic arithmetic functions
public class SimpleCalculator {

    // Adds two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Subtracts the second integer from the first
    public int subtract(int a, int b) {
        return a - b;
    }

    // Multiplies two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Divides the first double by the second; throws IllegalArgumentException if divisor is zero
    public double divide(double dividend, double divisor) {
        if (divisor == 0.0) {
            throw new IllegalArgumentException("Divisor cannot be zero.");
        }
        return dividend / divisor;
    }

    // Checks if a number is even
    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}
