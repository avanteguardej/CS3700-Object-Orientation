
/*
 * Joyce Keizer
 * CS 3700 - Object Orientation
 * Application Development Project
 * Furniture Ordering System - JUnit Tests
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FurnitureOrderingSystemTest {

    @Test
    public void testFurniturePrice() {
        Furniture sofa = new Furniture(
            101, "Velvet Sofa", "Living Room", 1299.99
        );

        assertEquals(1299.99, sofa.getPrice(), 0.001);
    }

    @Test
    public void testNegativeFurniturePrice() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Furniture(101, "Sofa", "Living Room", -100.00);
        });
    }

    @Test
    public void testOrderItemSubtotal() {
        Furniture chair = new Furniture(
            103, "Dining Chair", "Dining Room", 149.99
        );

        OrderItem item = new OrderItem(chair, 4);

        assertEquals(599.96, item.calculateSubtotal(), 0.001);
    }

    @Test
    public void testInvalidQuantity() {
        Furniture chair = new Furniture(
            103, "Dining Chair", "Dining Room", 149.99
        );

        assertThrows(IllegalArgumentException.class, () -> {
            new OrderItem(chair, 0);
        });
    }

    @Test
    public void testOrderTotal() {
        Customer customer = new Customer(
            1001, "Jane Smith",
            "jane.smith@example.com",
            "123 Main Street"
        );

        Order order = new Order(5001, customer);

        Furniture sofa = new Furniture(
            101, "Velvet Sofa", "Living Room", 1299.99
        );

        Furniture table = new Furniture(
            102, "Oak Dining Table", "Dining Room", 799.99
        );

        Furniture chair = new Furniture(
            103, "Dining Chair", "Dining Room", 149.99
        );

        order.addItem(new OrderItem(sofa, 1));
        order.addItem(new OrderItem(table, 1));
        order.addItem(new OrderItem(chair, 4));

        assertEquals(2699.94, order.calculateTotal(), 0.001);
    }

    @Test
    public void testEmptyOrderTotal() {
        Customer customer = new Customer(
            1001, "Jane Smith",
            "jane.smith@example.com",
            "123 Main Street"
        );

        Order order = new Order(5001, customer);

        assertEquals(0.0, order.calculateTotal(), 0.001);
    }

    @Test
    public void testCustomerAddressUpdate() {
        Customer customer = new Customer(
            1001, "Jane Smith",
            "jane.smith@example.com",
            "123 Main Street"
        );

        customer.updateShippingAddress("456 Oak Avenue");

        assertEquals(
            "456 Oak Avenue",
            customer.getShippingAddress()
        );
    }

    @Test
    public void testNullOrderItem() {
        Customer customer = new Customer(
            1001, "Jane Smith",
            "jane.smith@example.com",
            "123 Main Street"
        );

        Order order = new Order(5001, customer);

        assertThrows(IllegalArgumentException.class, () -> {
            order.addItem(null);
        });
    }
}

