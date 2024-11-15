
package librarymanagementsystem;


import java.util.ArrayList;
import java.util.List;

public class Library {
    private String libraryName;
    private List<LibraryBranch> branches;

    // Constructor
    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.branches = new ArrayList<>();
    }

    // Add a new branch to the library
    public void addBranch(LibraryBranch branch) {
        branches.add(branch);
        System.out.println("Branch added to library " + libraryName + ": " + branch.getBranchName());
    }

    // Display all branches in the library
    public void displayBranches() {
        System.out.println("Branches in library " + libraryName + ":");
        for (LibraryBranch branch : branches) {
            System.out.println(branch.getBranchName());
        }
    }

    // Find and display books in a specific branch
    public void displayBooksInBranch(String branchName) {
        for (LibraryBranch branch : branches) {
            if (branch.getBranchName().equals(branchName)) {
                branch.displayBooks();
                return;
            }
        }
        System.out.println("Branch " + branchName + " not found in library " + libraryName);
    }

    public void addBookToBranch(String branchName, Book book) {
        for (LibraryBranch branch : branches) {
            if (branch.getBranchName().equals(branchName)) {
                branch.addBook(book);
                return;
            }
        }
        System.out.println("Branch " + branchName + " not found in library " + libraryName);
    }

    public void removeBookFromBranch(String branchName, String ISBN) {
        for (LibraryBranch branch : branches) {
            if (branch.getBranchName().equals(branchName)) {
                branch.removeBook(ISBN);
                return;
            }
        }
        System.out.println("Branch " + branchName + " not found in library " + libraryName);
    }
}

