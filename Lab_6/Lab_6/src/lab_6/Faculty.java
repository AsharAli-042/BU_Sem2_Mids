
package lab_6;
import java.util.ArrayList;


public class Faculty {
    private String facultyName;
    private String facultyDesignation;
    private String facultyEmail;
    private String facultyContact;
    private int facultySalary;
    private int facultyId;
    private ArrayList<Course> courseList = new ArrayList<>();

    // Constructor
    public Faculty(String name, String designation, String email, String contact, int salary, int id) {
        this.facultyName = name;
        this.facultyDesignation = designation;
        this.facultyEmail = email;
        this.facultyContact = contact;
        this.facultySalary = salary;
        this.facultyId = id;
    }

    // Method to assign course
    public void assignCourse(Course course) {
        courseList.add(course);
    }

    @Override
    public String toString() {
        return "Faculty Name: " + facultyName + ", Designation: " + facultyDesignation + ", Email: " + facultyEmail
                + ", Contact: " + facultyContact + ", Salary: " + facultySalary + ", ID: " + facultyId
                + ", Courses: " + courseList;
    }
}
