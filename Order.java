
/*
 * Joyce Keizer
 * CS 3700 - Object Orientation
 * Application Development Project
 * Furniture Ordering System
 */

import java.util.ArrayList;

public class Order {

    // Attributes for a customer order.
    private int orderId;
    private Customer customer;
    private ArrayList<OrderItem> items;

    // Constructor initializes the order.
    public Order(int orderId, Customer customer) {

        if (customer == null) {
            throw new IllegalArgumentException(
                "Customer cannot be null."
            );
        }

        this.orderId = orderId;
        this.customer = customer;
        this.items = new ArrayList<>();
    }

    // Getter methods
    public int getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    // Adds a furniture item to the order.
    public void addItem(OrderItem item) {

        if (item == null) {
            throw new IllegalArgumentException(
                "Order item cannot be null."
            );
        }

        items.add(item);
    }

    // Calculates the total cost of all items.
    public double calculateTotal() {
        double total = 0.0;

        for (OrderItem item : items) {
            total += item.calculateSubtotal();
        }

        return total;
    }

    // Displays the complete order information.
    public void displayOrder() {

        System.out.println("FURNITURE ORDER SUMMARY");
        System.out.println("-----------------------------");
        System.out.println("Order ID: " + orderId);

        customer.displayCustomer();

        System.out.println("-----------------------------");

        for (OrderItem item : items) {
            item.displayOrderItem();
            System.out.println("-----------------------------");
        }

        System.out.printf("Order Total: $%.2f%n",
                calculateTotal());
    }
}
