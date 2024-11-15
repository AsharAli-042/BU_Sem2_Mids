package patientinfo;

import java.util.Scanner;

public class PatientInfo {
    // Global Variables
    int patientAge, patientBill, patientNumber;
    String patientEmail, patientComplaint, patientName, patientContact;
    Scanner input = new Scanner(System.in);

    // Method to collect patient's information
    public void patients_info() {
        System.out.println("************ Patients Info ************\n");

        System.out.print("Enter patient number: ");
        patientNumber = input.nextInt();
        input.nextLine(); // to clear the buffer

        System.out.print("Enter patient name: ");
        patientName = input.nextLine();

        System.out.print("Enter patient age: ");
        patientAge = input.nextInt();
        input.nextLine(); // to clear the buffer

        System.out.print("Enter patient email: ");
        patientEmail = input.nextLine();

        System.out.print("Enter patient contact number: ");
        patientContact = input.nextLine(); 

        System.out.print("Enter patient complaint: ");
        patientComplaint = input.nextLine();

        System.out.print("Enter patient bill: ");
        patientBill = input.nextInt();
    }

    // Method to print the receipt
    void printreceipt() {
        System.out.println("\n************ Patient Receipt ************\n");
        System.out.println("Patient number: " + patientNumber);
        System.out.println("Patient name: " + patientName);
        System.out.println("Patient age: " + patientAge);
        System.out.println("Patient email: " + patientEmail);
        System.out.println("Patient contact number: " + patientContact);
        System.out.println("Patient complaint: " + patientComplaint);
        System.out.println("Patient bill: " + patientBill + "$");
    }

    // Main method to run the program
    public static void main(String[] args) {
        PatientInfo info = new PatientInfo();
        info.patients_info();
        info.printreceipt();
    }
}
