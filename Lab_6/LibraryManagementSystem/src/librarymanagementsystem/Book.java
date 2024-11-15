package librarymanagementsystem;


public class Book {
    private String title;
    private String author;
    private String ISBN;

    // Constructor
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    // Getter for ISBN
    public String getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        return "Book [Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + "]";
    }

}
