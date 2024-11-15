
package account;


// Driver class
public class Inheritance_2 {
    public static void main(String[] args) {
        // Create Member objects
        Member member1 = new Member("Ashar Ali", "Ashar@example.com", "1234234590");
        Member member2 = new Member("Abbas Fakhruddin", "abbas@example.com", "0987234141");
        Member member3 = new Member("Muhammad Hamza", "hamza@example.com", "1121345675");

        // Create Account objects
        CurrentAccount currentAccount1 = new CurrentAccount(101, member1, "Uptown Nazimabad Branch", 1550.0);
        CurrentAccount currentAccount2 = new CurrentAccount(102, member2, "DownTown Chowrangi Branch", 2200.0);
        SavingAccount savingAccount1 = new SavingAccount(103, member3, "Central Branch", 1520.0);

        // Display information
        System.out.println("Account Information:");
        currentAccount1.displayInfo();
        currentAccount2.displayInfo();
        savingAccount1.displayInfo();

    }
}
