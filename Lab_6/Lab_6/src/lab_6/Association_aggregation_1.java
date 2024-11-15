
package lab_6;


public class Association_aggregation_1 {
    public static void main(String[] args) {
        Course course1 = new Course("CS101", "Intro to Cs", "5");
        Course course2 = new Course("MATHS101", "Calculus I", "1");

        Faculty faculty1 = new Faculty("Ashar", "Professor", "Asharali@example.com", "112412214", 50023, 4);
        Faculty faculty2 = new Faculty("Mubeen", "Associate Professor", "Mubeen@example.com", "01231411", 42310, 1);
        Faculty faculty3 = new Faculty("Hamza", "Assistant Professor", "Hamza@example.com", "1124124", 23000, 5);

        faculty1.assignCourse(course1);
        faculty2.assignCourse(course2);
        faculty3.assignCourse(course1);

        Department department1 = new Department("CS");
        Department department2 = new Department("MATHS");
        Department department3 = new Department("PHY");

        department1.facultyList(faculty1);
        department1.coursesList(course1);

        department2.facultyList(faculty2);
        department2.coursesList(course2);

        department3.facultyList(faculty3);
        department3.coursesList(course1);

        System.out.println(department1);
        System.out.println(department2);
        System.out.println(department3);
    }

}
