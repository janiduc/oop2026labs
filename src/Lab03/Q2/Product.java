package Lab03.Q2;

public class Product {

    // Private attributes
    private int productId;
    private String productName;
    private double price;
    private int quantity;

    // Getter for productId
    public int getProductId() {
        return productId;
    }

    // Setter for productId
    public void setProductId(int productId) {
        this.productId = productId;
    }

    // Getter for productName
    public String getProductName() {
        return productName;
    }

    // Setter for productName
    public void setProductName(String productName) {
        this.productName = productName;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price (Validation: must be > 0)
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price! Price must be greater than 0.");
        }
    }

    // Getter for quantity
    public int getQuantity() {
        return quantity;
    }

    // Setter for quantity (Validation: must not be negative)
    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Invalid quantity! Quantity cannot be negative.");
        }
    }

    // (b) Display product details
    public void displayDetails() {
        System.out.println("\nProduct Details");
        System.out.println("------------------------");
        System.out.println("Product ID   : " + getProductId());
        System.out.println("Product Name : " + getProductName());
        System.out.println("Price        : " + getPrice());
        System.out.println("Quantity     : " + getQuantity());
    }

    // (c) Calculate total stock value
    public double calculateTotalValue() {
        return price * quantity;
    }
}
