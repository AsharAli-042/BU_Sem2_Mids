package book;
import java.util.Scanner;

class Book {
    // Instance variables
    private String title;
    private String author;
    private double price;

    // Constructor to initialize the book details
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Set methods
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Get methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    // toString method to return book details
    @Override
    public String toString() {
        return "Book Title: " + title + "\nAuthor: " + author + "\nPrice: $" + price;
    }


    public static void main(String[] args) {
        // Create a Book object
        Book myBook = new Book("Developing Java Software", "Russel Winder", 59.25);

        // Print the book's details
        System.out.println(myBook);
        System.out.println("\nName: Ashar Ali Rizvi");
        System.out.print("Enter a new price for the book: ");
        Scanner sc = new Scanner(System.in);
        double newPrice = sc.nextDouble();
        myBook.setPrice(newPrice);
        
        // Print the updated book's details
        System.out.println("\nUpdated Book Details:");
        System.out.println(myBook.toString());


    }
}
