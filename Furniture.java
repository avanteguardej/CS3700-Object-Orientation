
/*
 * Joyce Keizer
 * CS 3700 - Object Orientation
 * Application Development Project
 * Furniture Ordering System
 */

public class Furniture {

    // Attributes describing a furniture product.
    private int productId;
    private String name;
    private String category;
    private double price;

    // Constructor initializes furniture information.
    public Furniture(int productId, String name,
                     String category, double price) {

        if (price < 0) {
            throw new IllegalArgumentException(
                "Price cannot be negative."
            );
        }

        this.productId = productId;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    // Getter methods
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    // Displays furniture details.
    public void displayFurniture() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.printf("Price: $%.2f%n", price);
    }
}
