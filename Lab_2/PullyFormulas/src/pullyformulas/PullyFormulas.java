
package pullyformulas;
import java.util.Scanner;

public class PullyFormulas {
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("For the speed of one pulley\n");
        System.out.println("Enter the Speed of pulley 1: ");
        double rpm1 = s.nextDouble();
        
        System.out.println("Enter the diameter of pulley 1: ");
        double d1 = s.nextDouble();
        
        System.out.println("Enter the diameter of pulley 2: ");
        double d2 = s.nextDouble();
        
        // RPM2 = diameter1/diameter2 * RPM1
        double rpm2 = (d1 / d2) * rpm1;
        System.out.println("The speed of the 2nd pulley: " + rpm2);
        
        System.out.println("\nFor Weight Lifted\n");
        System.out.println("Enter the Force exerted: ");
        double force = s.nextDouble();
        
        System.out.println("Enter the num of up ropes: ");
        int numOfUpRopes = s.nextInt();
        
        // Weight lifted = force exerted * number of up ropes 
        double weight = (force * numOfUpRopes);
        System.out.println("Weight lifted: " + weight);
    }
}
