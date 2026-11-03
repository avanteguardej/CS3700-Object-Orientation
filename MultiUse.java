
/*
 * Joyce Keizer
 * CS 3700 - Object Orientation
 * Module 4 Assignment 1
 * Promotion, Casting, and Overloading
 */

public class MultiUse {

    // Overload 1: Print numbers from 1 through the given integer.
    public static void multiUse(int number) {
        System.out.println("Numbers from 1 to " + number + ":");

        for (int i = 1; i <= number; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Overload 2: Calculate the average of two numbers.
    public static double multiUse(double first, double second) {
        return (first + second) / 2.0;
    }

    // Overload 3: Find the maximum of three numbers.
    public static double multiUse(double first, double second,
                                  double third) {
        return Math.max(first, Math.max(second, third));
    }

    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println("       METHOD OVERLOADING");
        System.out.println("================================");

        // Example 1: One integer parameter.
        System.out.println("\nExample 1: One Parameter");
        multiUse(10);

        // Example 2: Two parameters, demonstrating promotion.
        System.out.println("\nExample 2: Two Parameters");
        int firstNumber = 12;
        double secondNumber = 18.5;

        // The integer is promoted to double automatically.
        double average = multiUse(firstNumber, secondNumber);
        System.out.printf("Average: %.2f%n", average);

        // Example 3: Three parameters.
        System.out.println("\nExample 3: Three Parameters");
        double maximum = multiUse(15, 42, 27);
        System.out.printf("Maximum: %.2f%n", maximum);

        // Demonstrate explicit casting.
        System.out.println("\nExample 4: Explicit Casting");
        int wholeNumberAverage = (int) average;

        System.out.println("Average before casting: " + average);
        System.out.println("Average after casting to int: "
                           + wholeNumberAverage);

        System.out.println("\nAll methods executed successfully.");
    }
}
