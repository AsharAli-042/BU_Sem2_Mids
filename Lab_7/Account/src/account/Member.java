
package account;

// Member Class
public class Member {
    private String memberName;
    private String memberEmail;
    private String memberContact;

    // Constructor
    public Member(String name, String email, String contact) {
        this.memberName = name;
        this.memberEmail = email;
        this.memberContact = contact;
    }

    // Getter methods
    public String getMemberName() {
        return memberName;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public String getMemberContact() {
        return memberContact;
    }
}


