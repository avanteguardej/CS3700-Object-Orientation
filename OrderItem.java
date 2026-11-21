
/*
 * Joyce Keizer
 * CS 3700 - Object Orientation
 * Application Development Project
 * Furniture Ordering System
 */

public class OrderItem {

    // Attributes for an item in a customer's order.
    private Furniture furniture;
    private int quantity;

    // Constructor initializes the item and quantity.
    public OrderItem(Furniture furniture, int quantity) {

        if (furniture == null) {
            throw new IllegalArgumentException(
                "Furniture cannot be null."
            );
        }

        if (quantity <= 0) {
            throw new IllegalArgumentException(
                "Quantity must be greater than zero."
            );
        }

        this.furniture = furniture;
        this.quantity = quantity;
    }

    // Getter methods
    public Furniture getFurniture() {
        return furniture;
    }

    public int getQuantity() {
        return quantity;
    }

    // Calculates the subtotal for this item.
    public double calculateSubtotal() {
        return furniture.getPrice() * quantity;
    }

    // Displays the item details and subtotal.
    public void displayOrderItem() {
        System.out.println("Furniture: " + furniture.getName());
        System.out.println("Quantity: " + quantity);
        System.out.printf("Unit Price: $%.2f%n",
                furniture.getPrice());
        System.out.printf("Subtotal: $%.2f%n",
                calculateSubtotal());
    }
}
