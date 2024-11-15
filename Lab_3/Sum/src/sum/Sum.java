
package sum;
import java.util.Scanner;

public class Sum {

    public static int OddSum(int input) {
        if (input <= 0) {
            return 0; //if input is 0 or less so return 0
        }

        if ((input - 1) % 2 != 0) {  // Check if the number is odd
            return (input - 1) + OddSum(input - 1); 
        } else {
            return OddSum(input - 1); 
        }
    }
    
    public static int EvenSum(int input) {
        if (input <= 0) {
            return 0; //if input is 0 or less so return 0
        }

        if ((input - 1) % 2 == 0) {  // Checks if the number is even
            return (input - 1) + EvenSum(input - 1);  
        } else {
            return EvenSum(input - 1); 
        }
    }

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("\nEnter a number (or a negative number to exit):");
            int input = s.nextInt();
            
            if (input >= 0) {
                
                int sumOfOdd = OddSum(input);
                int sumOfEven = EvenSum(input);
                
                System.out.println("\nSum of odd numbers less than " + input + " is: " + sumOfOdd);
                System.out.println("Sum of even numbers less than " + input + " is: " + sumOfEven);
            } else {
                
                System.out.println("Exiting the program.... ");
                break;
            }
            
        }
 
    }
    
}
