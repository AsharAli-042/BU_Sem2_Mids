
package account;

// Account Class
public class Account {

    private int accountNo;
    private Member accountOwner;
    private String accountBranch;
    private double accountBalance;

    // Constructor
    public Account(int accountNo, Member owner, String branch, double balance) {
        this.accountNo = accountNo;
        this.accountOwner = owner;
        this.accountBranch = branch;
        this.accountBalance = balance;
    }

    // Getter methods
    public int getAccountNo() {
        return accountNo;
    }

    public Member getAccountOwner() {
        return accountOwner;
    }

    public String getAccountBranch() {
        return accountBranch;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getOwnerName() {
        return accountOwner.getMemberName();
    }

    public String getOwnerEmail() {
        return accountOwner.getMemberEmail();
    }

    public String getOwnerContact() {
        return accountOwner.getMemberContact();
    }
}

