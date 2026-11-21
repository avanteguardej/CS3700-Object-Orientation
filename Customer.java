
/*
 * Joyce Keizer
 * CS 3700 - Object Orientation
 * Application Development Project
 * Furniture Ordering System
 */

public class Customer {

    // Private attributes for customer information.
    private int customerId;
    private String name;
    private String email;
    private String shippingAddress;

    // Constructor initializes customer information.
    public Customer(int customerId, String name,
                    String email, String shippingAddress) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.shippingAddress = shippingAddress;
    }

    // Getter methods
    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    // Updates the customer's shipping address.
    public void updateShippingAddress(String newAddress) {
        this.shippingAddress = newAddress;
    }

    // Displays customer information.
    public void displayCustomer() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Shipping Address: " + shippingAddress);
    }
}

