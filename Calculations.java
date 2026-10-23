import java.util.Scanner; // I use Scanner to read what I type on the keyboard.

/*
 * Joyce Keizer
 * CS 3700 EOL 31 - Object Orientation
 * Module 1 Assignment 2: Calculations and Input/Output
 */

public class Calculations { 
    public static void main(String[] args) { 

        // I set up keyboard input. It will close automatically when I finish.
        try (Scanner input = new Scanner(System.in)) {

            // I ask the user to enter the first number.
            System.out.print("Enter the first number (x): ");

            // I store the first number in x. Using double allows decimals.
            double x = input.nextDouble();

            // I ask the user to enter the second number.
            System.out.print("Enter the second number (y): ");

            // I store the second number in y. This also allows decimals.
            double y = input.nextDouble();

            // I add the two numbers and save the answer as sum.
            double sum = x + y;

            // I subtract y from x and save the answer as difference.
            double difference = x - y;

            // I multiply the two numbers and save the answer as product.
            double product = x * y;

            // I leave a blank line before printing the results heading.
            System.out.println("\nArithmetic Results");

            // I print a divider to make the results easier to read.
            System.out.println("------------------");

            // I display the addition problem and its answer.
            // Each %s is replaced by a value listed after the quotation marks.
            // The %n moves the next output to a new line.
            System.out.printf("Addition:       %s + %s = %s%n", x, y, sum);

            // I display the subtraction problem and its answer on a separate line.
            System.out.printf("Subtraction:    %s - %s = %s%n", x, y, difference);

            // I display the multiplication problem and its answer on a separate line.
            System.out.printf("Multiplication: %s * %s = %s%n", x, y, product);

            // I check whether y is zero because division by zero is undefined.
            if (y == 0) {

                // I explain why the program cannot divide by zero.
                System.out.printf(
                    "Division:       %s / %s = undefined (cannot divide by zero)%n",
                    x, y
                );

            } else { // If y is not zero, I continue with division.

                // I divide x by y and save the answer as quotient.
                double quotient = x / y;

                // I display the division problem and its answer on a separate line.
                System.out.printf("Division:       %s / %s = %s%n", x, y, quotient);

            } // I end the division check.

        } 

    } 

} 