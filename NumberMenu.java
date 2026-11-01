
import java.util.Scanner;

public class NumberMenu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice = 0;
        int x = 0;
        int y = 0;
        boolean numbersEntered = false;

        do {
            System.out.println("\n========================================");
            System.out.println("              NUMBER MENU");
            System.out.println("========================================");

            if (numbersEntered) {
                System.out.println("Current range: " + x + " through " + y);
            } else {
                System.out.println("No numbers entered yet.");
            }

            System.out.println("----------------------------------------");
            System.out.println("1. Enter two numbers (X and Y)");
            System.out.println("2. Display all numbers in the range");
            System.out.println("3. Calculate the average");
            System.out.println("4. Find prime numbers");
            System.out.println("5. Exit");
            System.out.println("----------------------------------------");
            System.out.print("Please select an option (1-5): ");

            if (!input.hasNextInt()) {
                System.out.println("\nInvalid entry. Please enter a number from 1 to 5.");
                input.next();
                continue;
            }

            choice = input.nextInt();

            if (choice >= 2 && choice <= 4 && !numbersEntered) {
                System.out.println("\nPlease select option 1 to enter your numbers first.");
                continue;
            }

            switch (choice) {

                case 1:
                    System.out.println("\n--- ENTER TWO NUMBERS ---");
                    System.out.println("Enter each number separately and press Enter.");

                    System.out.print("\nEnter your first number (X): ");
                    while (!input.hasNextInt()) {
                        System.out.print("Invalid entry. Please enter a whole number for X: ");
                        input.next();
                    }
                    x = input.nextInt();

                    System.out.print("Enter your second number (Y): ");
                    while (!input.hasNextInt()) {
                        System.out.print("Invalid entry. Please enter a whole number for Y: ");
                        input.next();
                    }
                    y = input.nextInt();

                    numbersEntered = true;

                    System.out.println("\nNumbers saved successfully!");
                    System.out.println("Your selected range is "
                            + Math.min(x, y) + " through " + Math.max(x, y) + ".");
                    break;

                case 2:
                    System.out.println("\n--- NUMBERS IN YOUR RANGE ---");
                    System.out.println("Range: " + Math.min(x, y)
                            + " through " + Math.max(x, y));

                    for (long i = Math.min(x, y); i <= Math.max(x, y); i++) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("\n--- AVERAGE OF YOUR RANGE ---");

                    double average = ((double) x + y) / 2.0;

                    System.out.println("Range: " + Math.min(x, y)
                            + " through " + Math.max(x, y));
                    System.out.printf("Average: %.2f%n", average);
                    break;

                case 4:
                    System.out.println("\n--- PRIME NUMBERS IN YOUR RANGE ---");
                    System.out.println("Range: " + Math.min(x, y)
                            + " through " + Math.max(x, y));

                    boolean foundPrime = false;

                    for (long i = Math.max(2L, Math.min(x, y));
                         i <= Math.max(x, y); i++) {

                        boolean isPrime = true;

                        for (long j = 2; j <= i / j; j++) {
                            if (i % j == 0) {
                                isPrime = false;
                                break;
                            }
                        }

                        if (isPrime) {
                            System.out.print(i + " ");
                            foundPrime = true;
                        }
                    }

                    if (!foundPrime) {
                        System.out.print("No prime numbers found in this range.");
                    }

                    System.out.println();
                    break;

                case 5:
                    System.out.println("\n========================================");
                    System.out.println("Thank you for using the Number Menu!");
                    System.out.println("Program closed successfully.");
                    System.out.println("========================================");
                    break;

                default:
                    System.out.println("\nInvalid choice. Please select an option from 1 to 5.");
            }

        } while (choice != 5);

        input.close();
    }
}
