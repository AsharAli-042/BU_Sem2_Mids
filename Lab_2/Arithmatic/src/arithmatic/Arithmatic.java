
package arithmatic;
import java.util.Scanner;

public class Arithmatic {
    public static void main(String[] args){
    // Create a Scanner object for input
    Scanner input = new Scanner(System.in);
    
     // Prompt user for two integers
    System.out.println("Enter x: ");
    int a = input.nextInt();
    
    System.out.println("Enter y: ");
    int b = input.nextInt();
    
    // Compute the sum, difference, and product
    int sum = a + b;
    int diff = Math.abs(a - b);
    int product = (a * b);
    
    // Output the results
    System.out.println("Sum of x and y: " + sum);
    System.out.println("difference between x and y: " + diff);
    System.out.println("Product of x and y: " + product);
    
    }
}
