package librarymanagementsystem;
import java.util.ArrayList;
import java.util.List;


public class LibraryBranch {
    private String branchName;
    private List<Book> books;

    // Constructor
    public LibraryBranch(String branchName) {
        this.branchName = branchName;
        this.books = new ArrayList<>();
    }

    // Add a book to the branch
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added to branch " + branchName + ": " + book);
    }

    // Remove a book by ISBN from the branch
    public void removeBook(String ISBN) {
        Book bookToRemove = null;
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                bookToRemove = book;
                break;
            }
        }
        if (bookToRemove != null) {
            books.remove(bookToRemove);
            System.out.println("Book removed from branch " + branchName + ": " + bookToRemove);
        } else {
            System.out.println("Book with ISBN " + ISBN + " not found in branch " + branchName);
        }
    }

    // Display all books in the branch
    public void displayBooks() {
        System.out.println("Books in branch " + branchName + ":");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public String getBranchName() {
        return branchName;
    }

}
