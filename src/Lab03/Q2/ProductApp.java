package Lab03.Q2;

import java.util.Scanner;

public class ProductApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // (a) Create Product object
        Product product = new Product();

        // (b) Accept user input
        System.out.print("Enter Product ID: ");
        product.setProductId(scanner.nextInt());
        scanner.nextLine(); // clear buffer

        System.out.print("Enter Product Name: ");
        product.setProductName(scanner.nextLine());

        System.out.print("Enter Product Price: ");
        product.setPrice(scanner.nextDouble());

        System.out.print("Enter Product Quantity: ");
        product.setQuantity(scanner.nextInt());

        // (c) Display product details
        product.displayDetails();

        // (d) Display total stock value
        System.out.println("\nTotal Stock Value: " + product.calculateTotalValue());

        scanner.close();
    }
}
