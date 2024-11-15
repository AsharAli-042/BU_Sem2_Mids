
package department;

// Faculty Class inheriting Employee

import java.util.ArrayList;

class Faculty extends Employee {
    private String workingHours;
    private ArrayList<Course> courseList = new ArrayList<>();

    // Constructor
    public Faculty(String name, String designation, String department, String email, String contact, int salary, int number, String workingHours) {
        super(name, designation, department, email, contact, salary, number);
        this.workingHours = workingHours;
    }

    // Getter for workingHours
    public String getWorkingHours() {
        return workingHours;
    }

    // Method to assign a course to the faculty
    public void assignCourse(Course course) {
        courseList.add(course);
    }

    // Method to print courses
    public void printCourseList() {
        System.out.println("Courses assigned to " + getEmployeeName() + ":");
        for (Course course : courseList) {
            System.out.println("Code: " + course.getCourseCode() + ", Name: " + course.getCourseName() + ", Credit Hours: " + course.getCourseCreditHours());
        }
    }

    // toString method
    public String toString() {
        return super.toString() + ", Working Hours: " + workingHours;
    }
}