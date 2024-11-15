
package lab_6;
import java.util.ArrayList;


public class Department {
    private String departmentName;
    private ArrayList<Faculty> departmentFaculty = new ArrayList<>();
    private ArrayList<Course> offeredCourses = new ArrayList<>();

    // Constructor
    public Department(String name) {
        this.departmentName = name;
    }

    // Method to add faculty
    public void facultyList(Faculty faculty) {
        departmentFaculty.add(faculty);
    }

    // Method to add course
    public void coursesList(Course course) {
        offeredCourses.add(course);
    }

    @Override
    public String toString() {
        return "Department Name: " + departmentName + ", Faculty: " + departmentFaculty + ", Offered Courses: " + offeredCourses;
    }

}
