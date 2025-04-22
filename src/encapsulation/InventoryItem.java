package encapsulation;

/*

Create a class called InventoryItem with:

Three private attributes:

name (String),

quantity (int),

price (double).

Requirements:

Provide:

Getter for all three attributes,

Setter only for quantity and price.

Make sure:

name is set only in the constructor and cannot change.

quantity must never go below 0.

price must be greater than 0.

If a user tries to set invalid quantity or price, throw an IllegalArgumentException.

 */

public class InventoryItem {

    private final String NAME;
    private int quantity;
    private double price;

    InventoryItem(String name, int quantity, double price) {
        NAME = name;

        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity must not be below 0");
        } else {
            this.quantity = quantity;
        }

        if (price <= 0.0) {
            throw new IllegalArgumentException("Price must be positive");
        } else {
            this.price = price;
        }
    }

    public String getName() {
        return NAME;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity must not be below 0");
        } else {
            this.quantity = quantity;
        }
    }

    public void setPrice(double price) {
        if (price <= 0.0) {
            throw new IllegalArgumentException("Price must be positive");
        } else {
            this.price = price;
        }
    }

}
