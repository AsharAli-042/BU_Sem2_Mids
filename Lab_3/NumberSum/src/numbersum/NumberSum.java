
package numbersum;
import java.util.Scanner;

public class NumberSum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("First positive integer: ");
        int x = input.nextInt();

        System.out.print("Second positive integer: ");
        int y = input.nextInt();

        int totalSum = calcSum(x, y);
        System.out.println("Sum from " + x + " to " + y + " is: " + totalSum);

    }

    public static int calcSum(int x, int y) {
        if (x > y) {
            return calcSum(y, x);
        }

        if (x == y) {
            return x;
        }
        
        return x + calcSum(x + 1, y);
    }
    
}
