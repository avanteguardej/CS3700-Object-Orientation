
/*
 * Joyce Keizer
 * CS 3700 - Object Orientation
 * Module 6 Assignment 1 - JUnit Testing
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AverageCalculatorTest {

    // Test the average of positive numbers.
    @Test
    void testPositiveNumbers() {
        double[] numbers = {10, 20, 30, 40, 50};
        assertEquals(30.0,
            AverageCalculator.calculateAverage(numbers), 0.001);
    }

    // Test the average of decimal numbers.
    @Test
    void testDecimalNumbers() {
        double[] numbers = {2.5, 3.5, 4.5};
        assertEquals(3.5,
            AverageCalculator.calculateAverage(numbers), 0.001);
    }

    // Test the average of negative numbers.
    @Test
    void testNegativeNumbers() {
        double[] numbers = {-10, -20, -30};
        assertEquals(-20.0,
            AverageCalculator.calculateAverage(numbers), 0.001);
    }

    // Test a combination of positive and negative numbers.
    @Test
    void testMixedNumbers() {
        double[] numbers = {-10, 0, 10, 20};
        assertEquals(5.0,
            AverageCalculator.calculateAverage(numbers), 0.001);
    }

    // Test an array containing only one number.
    @Test
    void testSingleNumber() {
        double[] numbers = {75};
        assertEquals(75.0,
            AverageCalculator.calculateAverage(numbers), 0.001);
    }

    // Test that an empty array produces an exception.
    @Test
    void testEmptyArray() {
        double[] numbers = {};
        assertThrows(IllegalArgumentException.class,
            () -> AverageCalculator.calculateAverage(numbers));
    }

    // Test that a null array produces an exception.
    @Test
    void testNullArray() {
        assertThrows(IllegalArgumentException.class,
            () -> AverageCalculator.calculateAverage(null));
    }
}

