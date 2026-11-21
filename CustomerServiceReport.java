
/*
 * Joyce Keizer
 * CS 3700 - Object Orientation
 * Module 6 Assignment 2 - Designing Classes with UML
 */

public class CustomerServiceReport {

    // Private attributes
    private String reportName;
    private int totalCalls;
    private int totalEscalations;
    private int closedEscalations;

    // Constructor initializes the report information.
    public CustomerServiceReport(String reportName,
                                 int totalCalls,
                                 int totalEscalations,
                                 int closedEscalations) {

        if (totalCalls < 0 || totalEscalations < 0
                || closedEscalations < 0
                || totalEscalations > totalCalls
                || closedEscalations > totalEscalations) {
            throw new IllegalArgumentException(
                "Invalid customer service metrics."
            );
        }

        this.reportName = reportName;
        this.totalCalls = totalCalls;
        this.totalEscalations = totalEscalations;
        this.closedEscalations = closedEscalations;
    }

    // Calculates First Time Resolution percentage.
    public double calculateFTRRate() {
        if (totalCalls == 0) {
            return 0.0;
        }

        return (double) (totalCalls - totalEscalations)
                / totalCalls * 100;
    }

    // Calculates the percentage of escalations closed.
    public double calculateEscalationClosureRate() {
        if (totalEscalations == 0) {
            return 0.0;
        }

        return (double) closedEscalations
                / totalEscalations * 100;
    }

    // Displays the report and calculated metrics.
    public void displayReport() {
        System.out.println("Customer Service Report: " + reportName);
        System.out.println("--------------------------------");

        System.out.println("Total Calls: " + totalCalls);
        System.out.println("Total Escalations: " + totalEscalations);
        System.out.println("Closed Escalations: " + closedEscalations);

        System.out.printf("FTR Rate: %.2f%%%n",
                calculateFTRRate());

        System.out.printf("Escalation Closure Rate: %.2f%%%n",
                calculateEscalationClosureRate());
    }

    // Main method demonstrates the class.
    public static void main(String[] args) {

        CustomerServiceReport report =
                new CustomerServiceReport(
                    "Weekly eCommerce Operations",
                    1000,
                    150,
                    120
                );

        report.displayReport();
    }
}

