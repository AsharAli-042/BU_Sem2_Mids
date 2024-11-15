
package department;

// Employee Class
public class Employee {
    private String employeeName;
    private String employeeDesignation;
    private String employeeDepartment;
    private String employeeEmail;
    private String employeeContact;
    private int employeeSalary;
    private int employeeNumber;

    // Constructor
    public Employee(String name, String designation, String department, String email, String contact, int salary, int number) {
        this.employeeName = name;
        this.employeeDesignation = designation;
        this.employeeDepartment = department;
        this.employeeEmail = email;
        this.employeeContact = contact;
        this.employeeSalary = salary;
        this.employeeNumber = number;
    }

    // Getters
    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public String getEmployeeContact() {
        return employeeContact;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }


    // toString method
    public String toString() {
        return "Name: " + employeeName + ", Designation: " + employeeDesignation + ", Department: " + employeeDepartment
                + ", Email: " + employeeEmail + ", Contact: " + employeeContact + ", Salary: " + employeeSalary
                + ", Employee Number: " + employeeNumber;
    }
}
