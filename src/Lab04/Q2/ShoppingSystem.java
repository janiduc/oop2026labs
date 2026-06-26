package Lab04.Q2;

public class ShoppingSystem {

    public static void main(String[] args) {

        // Object using constructor 0
        Product p0 = new Product();
        // Object using constructor 1
        Product p1 = new Product(101, "Laptop");
        p1.setBasePrice(1500);
        p1.setMembershipType("Premium");

        // Object using constructor 2
        Product p2 = new Product(102, "Smartphone", 800);
        p2.setMembershipType("Regular");

        // Object using constructor 3
        Product p3 = new Product(103, "Headphones", 200, "Non-Member");

        // Display details
        p0.displayProductDetails();
        p1.displayProductDetails();
        p2.displayProductDetails();
        p3.displayProductDetails();

        // Demonstrate seasonal discount
        System.out.println("Final Price with Seasonal Discount (10%) for Laptop: "
                + p1.calculateFinalPrice(10));

        System.out.println("Final Price with Seasonal Discount (5%) for Smartphone: "
                + p2.calculateFinalPrice(5));
    }
}
