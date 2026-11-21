
/*
 * Joyce Keizer
 * CS 3700 - Object Orientation
 * Module 6 Assignment 1 - JUnit Testing
 */

public class AverageCalculator {

    // Calculates the average of an array of numbers.
    public static double calculateAverage(double[] numbers) {

        // Prevent division by zero or missing input.
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException(
                "The array must contain at least one number."
            );
        }

        double sum = 0;

        // Add each number using an enhanced for loop.
        for (double number : numbers) {
            sum += number;
        }

        // Divide the total by the number of values.
        return sum / numbers.length;
    }

    public static void main(String[] args) {

        // Example: Average daily customer service calls.
        double[] dailyCalls = {120, 135, 110, 145, 140};

        double average = calculateAverage(dailyCalls);

        System.out.println(
            "Average Daily Calls: " + average
        );
    }
}
