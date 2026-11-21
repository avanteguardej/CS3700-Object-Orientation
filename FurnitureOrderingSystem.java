
/*
 * Joyce Keizer
 * CS 3700 - Object Orientation
 * Application Development Project
 * Furniture Ordering System
 */

public class FurnitureOrderingSystem {

    public static void main(String[] args) {

        // Create furniture products.
        Furniture sofa = new Furniture(
            101, "Velvet Sofa", "Living Room", 1299.99
        );

        Furniture table = new Furniture(
            102, "Oak Dining Table", "Dining Room", 799.99
        );

        Furniture chair = new Furniture(
            103, "Dining Chair", "Dining Room", 149.99
        );

        // Create a customer.
        Customer customer = new Customer(
            1001,
            "Jane Smith",
            "jane.smith@example.com",
            "123 Main Street, Detroit, MI"
        );

        // Create an order for the customer.
        Order order = new Order(5001, customer);

        // Add furniture items and quantities.
        order.addItem(new OrderItem(sofa, 1));
        order.addItem(new OrderItem(table, 1));
        order.addItem(new OrderItem(chair, 4));

        // Display the complete order.
        order.displayOrder();
    }
}
