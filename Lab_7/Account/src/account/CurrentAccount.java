
package account;

// CurrentAccount Class inheriting Account
public class CurrentAccount extends Account {
    private String accountType = "Current";

    // Constructor
    public CurrentAccount(int accountNo, Member owner, String branch, double balance) {
        super(accountNo, owner, branch, balance);
    }

    // Method to get account type
    public String getAccountType() {
        return accountType;
    }

    // Display info method
    public void displayInfo() {
        System.out.println("Account Type: " + getAccountType());
        System.out.println("Account No: " + getAccountNo());
        System.out.println("Branch: " + getAccountBranch());
        System.out.println("Balance: " + getAccountBalance());
        System.out.println("Owner Name: " + getOwnerName());
        System.out.println("Owner Email: " + getOwnerEmail());
        System.out.println("Owner Contact: " + getOwnerContact());
        System.out.println();
    }
}

