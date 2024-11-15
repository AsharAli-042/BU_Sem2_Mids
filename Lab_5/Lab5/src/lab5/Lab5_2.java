
package lab5;
import java.util.*;

public class Lab5_2 {
    
    public static int calcPrimeCalories(int input) {
        int sum = 0;
        for (int i = 2; i < input; i++) {
            if (isPrime(i)) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static int calcOddCalories(int input) {
        int sum = 0;
        for (int i = 1; i < input; i += 2) {
            sum = sum + i;
        }
        return sum;
    }
    
    public static int calcEvenCalories(int input) {
        int sum = 0;
        for (int i = 0; i < input; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    private static boolean isPrime(int num) {
        if (num <= 1)
        {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int primeCalories, oddCalories, evenCalories;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your workout duration (Enter Negative numbers to exit): ");
            int timespan = sc.nextInt();

            if (timespan < 0) {
                System.out.println("Exiting the app");
                break;
            }
            
            primeCalories = calcPrimeCalories(timespan);
            oddCalories = calcOddCalories(timespan);
            evenCalories = calcEvenCalories(timespan);

            System.out.println("Calories burned prime numbers less than " + timespan + ": " + primeCalories);
            System.out.println("Calories burned odd numbers less than " + timespan + ": " + oddCalories);
            System.out.println("Calories burned even numbers less than " + timespan + ": " + evenCalories);
        }

    }
}

