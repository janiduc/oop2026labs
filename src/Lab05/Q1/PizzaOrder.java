package Lab05.Q1;

public class PizzaOrder {

    // Attributes
    private String orderID;
    private String customerName;
    private String size;
    private int toppingCount;
    private boolean isDelivery;

    // Default Constructor
    PizzaOrder() {
        orderID = "N/A";
        customerName = "Unknown";
        size = "Small";
        toppingCount = 0;
        isDelivery = false;
    }

    // Constructor 1: orderID and customerName
    PizzaOrder(String orderID, String customerName) {
        this.orderID = orderID;
        this.customerName = customerName;
        this.size = "Small";
        this.toppingCount = 0;
        this.isDelivery = false;
    }

    // Constructor 2: All attributes
    PizzaOrder(String orderID, String customerName, String size, int toppingCount, boolean isDelivery) {
        this.orderID = orderID;
        this.customerName = customerName;
        setSize(size);
        this.toppingCount = toppingCount;
        this.isDelivery = isDelivery;
    }

    // Getter for size
    public String getSize() {
        return size;
    }

    // Setter for size with validation
    public void setSize(String size) {
        if(size.equalsIgnoreCase("Small") ||
                size.equalsIgnoreCase("Medium") ||
                size.equalsIgnoreCase("Large")) {

            this.size = size;
        }
        else {
            this.size = "Small";
        }
    }

    // Get base price according to size
    public double getBasePrice() {

        if(size.equalsIgnoreCase("Small")) {
            return 8.00;
        }
        else if(size.equalsIgnoreCase("Medium")) {
            return 10.00;
        }
        else if(size.equalsIgnoreCase("Large")) {
            return 12.00;
        }
        return 8.00;
    }

    // Calculate total price (no discount)
    public double calculateTotalPrice() {

        double basePrice = getBasePrice();
        double toppingCost = toppingCount * 1.50;

        double total = basePrice + toppingCost;

        if(isDelivery) {
            total += 5.00;
        }

        return total;
    }

    // Overloaded method with discount
    public double calculateTotalPrice(double discountPercentage) {

        double total = calculateTotalPrice();
        double discount = total * (discountPercentage / 100);

        return total - discount;
    }

    // Estimate preparation time
    public int estimatePreparationTime() {
        return 15 + (2 * toppingCount);
    }

    // Display order details
    public void displayOrderDetails() {

        System.out.println("Order ID: " + orderID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Pizza Size: " + size);
        System.out.println("Number of Toppings: " + toppingCount);
        System.out.println("Delivery: " + (isDelivery ? "Yes" : "No"));
        System.out.println("Base Price: $" + getBasePrice());
        System.out.println("Total Price: $" + calculateTotalPrice());
        System.out.println("Estimated Preparation Time: " + estimatePreparationTime() + " minutes");
        System.out.println("----------------------------------------");
    }
}



/*class PizzaOrder {

    String orderID, customerName, size;
    int toppingCount;
    boolean isDelivery;

    // Default constructor
    PizzaOrder() {
        orderID = "N/A";
        customerName = "Unknown";
        size = "Small";
        toppingCount = 0;
        isDelivery = false;
    }

    // Constructor 1
    PizzaOrder(String orderID, String customerName) {
        this.orderID = orderID;
        this.customerName = customerName;
        size = "Small";
    }

    // Constructor 2
    PizzaOrder(String orderID, String customerName, String size, int toppingCount, boolean isDelivery) {
        this.orderID = orderID;
        this.customerName = customerName;
        setSize(size);
        this.toppingCount = toppingCount;
        this.isDelivery = isDelivery;
    }

    // Setter with validation
    void setSize(String size) {
        if(size.equals("Small") || size.equals("Medium") || size.equals("Large"))
            this.size = size;
        else
            this.size = "Small";
    }

    // Base price
    double getBasePrice() {
        if(size.equals("Medium")) return 10;
        if(size.equals("Large")) return 12;
        return 8;
    }

    // Total price
    double calculateTotalPrice() {
        double total = getBasePrice() + (toppingCount * 1.5);
        if(isDelivery) total += 5;
        return total;
    }

    // Overloaded method with discount
    double calculateTotalPrice(double discount) {
        double total = calculateTotalPrice();
        return total - (total * discount / 100);
    }

    // Preparation time
    int estimatePreparationTime() {
        return 15 + (2 * toppingCount);
    }

    // Display details
    void displayOrderDetails() {
        System.out.println("OrderID: " + orderID);
        System.out.println("Customer: " + customerName);
        System.out.println("Size: " + size);
        System.out.println("Toppings: " + toppingCount);
        System.out.println("Delivery: " + isDelivery);
        System.out.println("Total Price: $" + calculateTotalPrice());
        System.out.println("Prep Time: " + estimatePreparationTime() + " minutes\n");
    }
}*/


