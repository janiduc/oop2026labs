package Lab04.Q1;

public class LibrarySystem {

    public static void main(String[] args) {

        // Creating objects using different constructors

        Book book1 = new Book("Java Programming", "James Gosling");

        Book book2 = new Book("Data Structures", "Mark Allen Weiss", "ISBN12345");

        Book book3 = new Book("Artificial Intelligence", "Stuart Russell", "ISBN98765", 4500.00);

        // Calling overloaded methods

        System.out.println("Book 1 Details:");
        System.out.println(book1.getBookDetails());

        System.out.println("Book 2 Details:");
        System.out.println(book2.getBookDetails());

        System.out.println("Book 3 Details:");
        System.out.println(book3.getBookDetails());

        // Searching by ISBN
        System.out.println("Search Book by ISBN:");
        System.out.println(book3.getBookDetails("ISBN98765"));

        System.out.println(book2.getBookDetails("ISBN00000"));
        System.out.println(book3.getBookDetails("ISBN00000"));
        System.out.println(book3.getBookDetails("ISBN12345"));
        System.out.println(book2.getBookDetails("ISBN12345"));
    }
}
