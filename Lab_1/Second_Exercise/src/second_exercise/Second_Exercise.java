package second_exercise;
import java.util.Scanner;

public class Second_Exercise {
    public static void main(String[] args){
        // Create a Scanner object for  input
        Scanner s = new Scanner(System.in);
        
        // Output Message and Input student Name
        System.out.println("Enter your name: ");
        String name = s.nextLine();

        // Output Message and Input student's Enrollment Number
        System.out.println("Enter your Enrollment No: ");
        String enroll = s.nextLine();
        
        // Output Message and Input student's Subject name
        System.out.println("Enter your Subject name: ");
        String subj = s.nextLine();
        
        // Output Message and Input student's Instructor Name
        System.out.println("Enter your Instructor Name: ");
        String instruct = s.nextLine();
        
        // Output Message and Input student's Semester
        System.out.println("Enter your Semester: ");
        String sem = s.nextLine();
        
        // Output Student details
        System.out.println("Name: " + name);
        System.out.println("Enrollment No: " + enroll);
        System.out.println("Subject: " + subj);
        System.out.println("Instructor Name: " + instruct);
        System.out.println("Semester: " + sem);
        
    }
}
