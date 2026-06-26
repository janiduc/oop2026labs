package Lab05.Q1;

public class PizzaResturentSystem {

        public static void main(String[] args) {

            // Using default constructor
            PizzaOrder order1 = new PizzaOrder();
            order1.displayOrderDetails();

            // Using constructor with orderID and customerName
            PizzaOrder order2 = new PizzaOrder("P101", "Alice");
            order2.setSize("Medium");
            order2.displayOrderDetails();

            // Using constructor with all attributes
            PizzaOrder order3 = new PizzaOrder("P102", "Bob", "Large", 3, true);
            order3.displayOrderDetails();

            // Demonstrating discount calculation
            System.out.println("Total Price with 10% Discount: $" + order3.calculateTotalPrice(10));
        }
    }




/*
public class Main {
    public static void main(String[] args) {

        PizzaOrder p1 = new PizzaOrder();
        PizzaOrder p2 = new PizzaOrder("P101", "Alice");
        PizzaOrder p3 = new PizzaOrder("P102", "Bob", "Large", 3, true);

        p1.displayOrderDetails();
        p2.displayOrderDetails();
        p3.displayOrderDetails();

        System.out.println("Price with 10% Discount: $" + p3.calculateTotalPrice(10));
    }
}*/
