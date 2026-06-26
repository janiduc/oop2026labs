package Lab04.Q1;

public class Book {

    // Attributes
    String title;
    String author;
    String ISBN;
    double price;

    // I. Constructor with title and author
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // II. Constructor with title, author, and ISBN
    Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    // III. Constructor with all attributes
    Book(String title, String author, String ISBN, double price) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
    }

    // Method Overloading

    // I. No parameters → Returns all details
    String getBookDetails() {
        return "Title: " + title +
                "\nAuthor: " + author +
                "\nISBN: " + ISBN +
                "\nPrice: " + price + "\n";
    }

    // II. One parameter (ISBN) → Returns details if ISBN matches
    String getBookDetails(String ISBN) {
        if(this.ISBN != null && this.ISBN.equals(ISBN)) {
            return "Book Found\nTitle: " + title +
                    "\nAuthor: " + author +
                    "\nISBN: " + this.ISBN +
                    "\nPrice: " + price + "\n";
        }
        else {
            return "Book with ISBN " + ISBN + " not found.\n";
        }
    }
}
