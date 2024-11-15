
package department;


public class Course {
    private String courseCode;
    private String courseName;
    private String courseCreditHours;

    // Constructor
    public Course(String code, String name, String creditHours) {
        this.courseCode = code;
        this.courseName = name;
        this.courseCreditHours = creditHours;
    }

    // Getters
    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCreditHours() {
        return courseCreditHours;
    }
}
