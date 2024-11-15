
package department;
// Staff Class inheriting Employee
class Staff extends Employee {
    private String workingHours;

    // Constructor
    public Staff(String name, String designation, String department, String email, String contact, int salary, int number, String workingHours) {
        super(name, designation, department, email, contact, salary, number);
        this.workingHours = workingHours;
    }

    // Getter for workingHours
    public String getWorkingHours() {
        return workingHours;
    }

    // toString method
    public String toString() {
        return super.toString() + ", Working Hours: " + workingHours;
    }
}

