
package lab_6;


public class Course {
    private String courseCode;
    private String courseName;
    private String courseCreditHours;

    // Constructor
    public Course(String courseCode, String courseName, String courseCreditHours) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.courseCreditHours = courseCreditHours;
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

    @Override
    public String toString() {
        return "Course Code: " + courseCode + ", Course Name: " + courseName + ", Credit Hours: " + courseCreditHours;
    }
}
