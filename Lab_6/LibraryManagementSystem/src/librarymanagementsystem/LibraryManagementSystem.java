
package librarymanagementsystem;


public class LibraryManagementSystem {

    
    public static void main(String[] args) {
        Library library = new Library("City Library");

        LibraryBranch branch1 = new LibraryBranch("Downtown Branch");
        LibraryBranch branch2 = new LibraryBranch("Uptown Branch");

        library.addBranch(branch1);
        library.addBranch(branch2);

        library.displayBranches();

        Book book1 = new Book("1984", "George Orwell", "123-ABC");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "456-DEF");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "789-GHI");

        library.addBookToBranch("Downtown Branch", book1);
        library.addBookToBranch("Downtown Branch", book2);

        library.addBookToBranch("Uptown Branch", book3);

        library.displayBooksInBranch("Downtown Branch");
        library.displayBooksInBranch("Uptown Branch");

        library.removeBookFromBranch("Downtown Branch", "456-DEF");

        library.displayBooksInBranch("Downtown Branch");

    }
    
}
