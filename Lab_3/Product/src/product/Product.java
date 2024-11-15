
package product;
import java.util.Scanner;

public class Product {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();

        // Check if the input number is non-negative
        if (num >= 0) {
            int result = calculateFactorial(num);
            System.out.println("Factorial of " + num + " is: " + result);
        } else {
            System.out.println("Please enter a non-negative integer.");
        }

    }

    public static int calculateFactorial(int n) {
        
        if (n == 0) {
            return 1;
        }
        
        return (n * calculateFactorial(n - 1));
    }
    
}
