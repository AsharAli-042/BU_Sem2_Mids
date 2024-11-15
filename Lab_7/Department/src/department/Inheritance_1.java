
package department;


public class Inheritance_1 {
    public static void main(String[] args) {
        // Create Staff objects
        Staff staff1 = new Staff("Ashar Ali", "Lab Assistant", "CS", "AsharAli@example.com", "123123210", 40023, 5, "9 AM - 5 PM");
        Staff staff2 = new Staff("Hamza Muhammad", "Secretary", "CS", "Hmaza@example.com", "09876123211", 35210, 2, "10 AM - 6 PM");

        // Create Faculty objects
        Faculty faculty1 = new Faculty("abdur rehman", "Associate Professor", "Computer Science", "abdur@example.com", "11221321455", 70210, 3, "9 AM - 3 PM");
        Faculty faculty2 = new Faculty("bikal", "Assistant Professor", "Computer Science", "bilal@example.com", "55232899", 60130, 4, "10 AM - 4 PM");

        // Create Course objects
        Course course1 = new Course("CS101", "Data Structures", "3");
        Course course2 = new Course("CS102", "Algorithms", "3");
        Course course3 = new Course("CS103", "Computer Networks", "4");

        // Assign courses to faculty
        faculty1.assignCourse(course1);
        faculty1.assignCourse(course2);
        faculty2.assignCourse(course2);
        faculty2.assignCourse(course3);

        // Display Staff information
        System.out.println("Staff Members:");
        System.out.println(staff1.toString());
        System.out.println(staff2.toString());
        System.out.println();

        // Display Faculty information and assigned courses
        System.out.println("Faculty Members:");
        System.out.println(faculty1.toString());
        faculty1.printCourseList();
        System.out.println();
        
        System.out.println(faculty2.toString());
        faculty2.printCourseList();
    }
}
