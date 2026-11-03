
/*
 * Joyce Keizer
 * CS 3700 - Object Orientation
 * Module 4 Assignment 2 - JOptionPane
 */

import javax.swing.JOptionPane;

public class LoginAuthentication {

    public static void main(String[] args) {

        // Define the required username and password.
        final String CORRECT_USERNAME = "Hero";
        final String CORRECT_PASSWORD = "Zero";

        // Prompt the user to enter a username.
        String username = JOptionPane.showInputDialog(
                null,
                "Enter your username:",
                "Login - Username",
                JOptionPane.QUESTION_MESSAGE
        );

        // Prompt the user to enter a password.
        String password = JOptionPane.showInputDialog(
                null,
                "Enter your password:",
                "Login - Password",
                JOptionPane.QUESTION_MESSAGE
        );

        // Check whether both credentials match.
        if (CORRECT_USERNAME.equals(username)
                && CORRECT_PASSWORD.equals(password)) {

            JOptionPane.showMessageDialog(
                    null,
                    "Access Granted",
                    "Login Successful",
                    JOptionPane.INFORMATION_MESSAGE
            );

        } else {

            JOptionPane.showMessageDialog(
                    null,
                    "Incorrect Credentials",
                    "Login Failed",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
}
