package computer;
import java.util.Scanner;

class SystemInfo {
    String name;
    String type;
    String processor;
    int ram;
    int hdd;
    String motherboard;
    String opticalDrive;
    boolean status = true;

    // Default constructor
    public SystemInfo() {
        name = "Unknown";
        type = "Unknown";
        processor = "Unknown";
        ram = 0;
        hdd = 0;
        motherboard = "Unknown";
        opticalDrive = "None";
    }

    // Method to gather system information from the user
    public void gatherInfo() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter system name: ");
        name = input.nextLine();
        type = getSystemType(input);
        System.out.print("Enter processor details: ");
        processor = input.nextLine();
        ram = getValidInteger(input, "Enter RAM size (in GB): ");
        hdd = getValidInteger(input, "Enter Hard Disk size (in GB): ");
        input.nextLine();
        System.out.print("Enter motherboard name: ");
        motherboard = input.nextLine();
        opticalDrive = getOpticalDrive(input);
    }

    // Method to display system information
    public void showInfo() {
        System.out.println("\n--- Computer System Details ---");
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Hard Disk: " + hdd + " GB");
        System.out.println("Motherboard: " + motherboard);
        System.out.println("Optical Drive: " + opticalDrive);
    }

    // Method to update system information
    public void updateInfo() {
        Scanner input = new Scanner(System.in);
        
        if (getUserChoice(input, "Do you want to change any details? (yes/no): ")) {
            int option = getUpdateOption(input);
            updateDetail(option, input);        
        }
    }
    
    // Helper method to get system type
    private String getSystemType(Scanner input) {
        System.out.print("Enter system type (Laptop/Desktop): ");
        return input.nextLine();
    }

    // Helper method to get optical drive information
    private String getOpticalDrive(Scanner input) {
        System.out.print("Does the system have an optical drive? (Yes/No): ");
        return input.nextLine();
    }

    // Helper method to prompt user for a valid integer
    private int getValidInteger(Scanner input, String message) {
        System.out.print(message);
        return input.nextInt();
    }

    // Helper method to get user's yes/no choice
    private boolean getUserChoice(Scanner input, String message) {
        System.out.print(message);
        String choice = input.nextLine();
        return choice.equalsIgnoreCase("yes");
    }

    // Helper method to get update option from the user
    private int getUpdateOption(Scanner input) {
        System.out.println("\nWhich detail would you like to change?");
        System.out.println("1. Name");
        System.out.println("2. Type");
        System.out.println("3. Processor");
        System.out.println("4. RAM");
        System.out.println("5. Hard Disk");
        System.out.println("6. Motherboard");
        System.out.println("7. Optical Drive");
        System.out.println("8. Exit the Program");
        System.out.print("Enter the number of the detail you want to change: ");
        return input.nextInt();
    }

    // Method to update the specific detail based on user choice
    private void updateDetail(int option, Scanner input) {
    input.nextLine(); // Consume the newline character
    while (true) {
        switch (option) {
            case 1:
                System.out.print("Enter new system name: ");
                name = input.nextLine();
                break;
            case 2:
                type = getSystemType(input);
                break;
            case 3:
                System.out.print("Enter new processor details: ");
                processor = input.nextLine();
                break;
            case 4:
                ram = getValidInteger(input, "Enter new RAM size (in GB): ");
                break;
            case 5:
                hdd = getValidInteger(input, "Enter new Hard Disk size (in GB): ");
                break;
            case 6:
                System.out.print("Enter new motherboard name: ");
                motherboard = input.nextLine();
                break;
            case 7:
                opticalDrive = getOpticalDrive(input);
                break;
            case 8:
                System.out.println("Exiting the program completely...");
                System.exit(0);
                return; // Exit the method to prevent further looping
            default:
                System.out.println("Invalid option.");
                break;
        }

        
        break;
}
    }}
public class Computer {
    public static void main(String[] args) {
        SystemInfo system = new SystemInfo();
        system.gatherInfo();
        system.showInfo();
        system.updateInfo();
        system.showInfo();
    }
}
