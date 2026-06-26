package Lab04.Q2;

public class Product {

    // Attributes
    int productID;
    String productName;
    double basePrice;
    String membershipType;

    // Default Constructor
    Product() {
        membershipType = "Non-Member";
    }

    // Constructor 1: productID and productName
    Product(int productID, String productName) {
        this.productID = productID;
        this.productName = productName;
        this.membershipType = "Non-Member";
    }

    // Constructor 2: productID, productName, basePrice
    Product(int productID, String productName, double basePrice) {
        this.productID = productID;
        this.productName = productName;
        this.basePrice = basePrice;
        this.membershipType = "Non-Member";
    }

    // Constructor 3: all attributes
    Product(int productID, String productName, double basePrice, String membershipType) {
        this.productID = productID;
        this.productName = productName;
        this.basePrice = basePrice;
        setMembershipType(membershipType);
    }

    // Getter for basePrice
    double getBasePrice() {
        return basePrice;
    }

    // Setter for basePrice
    void setBasePrice(double basePrice) {
        if(basePrice > 0) {
            this.basePrice = basePrice;
        }
    }

    // Getter for membershipType
    String getMembershipType() {
        return membershipType;
    }

    // Setter with validation
    void setMembershipType(String membershipType) {
        if(membershipType.equalsIgnoreCase("Premium") ||
                membershipType.equalsIgnoreCase("Regular") ||
                membershipType.equalsIgnoreCase("Non-Member")) {

            this.membershipType = membershipType;
        }
        else {
            this.membershipType = "Non-Member";
        }
    }

    // Method 1: Calculate final price based on membership discount
    double calculateFinalPrice() {

        double discount = 0;

        if(membershipType.equalsIgnoreCase("Premium")) {
            discount = 0.20;
        }
        else if(membershipType.equalsIgnoreCase("Regular")) {
            discount = 0.10;
        }

        return basePrice - (basePrice * discount);
    }

    // Method 2: Calculate price with seasonal discount
    double calculateFinalPrice(double seasonalDiscount) {

        double priceAfterMembership = calculateFinalPrice();

        return priceAfterMembership - (priceAfterMembership * seasonalDiscount / 100);
    }

    // Display Product Details
    void displayProductDetails() {

        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Base Price: " + getBasePrice());
        System.out.println("Membership Type: " + getMembershipType());
        System.out.println("Final Price (After Discount): " + calculateFinalPrice());
        System.out.println("--------------------------------------");
    }
}
