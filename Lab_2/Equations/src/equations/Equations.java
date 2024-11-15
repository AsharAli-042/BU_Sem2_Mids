package equations;

public class Equations {
    public static void main(String[] args){
        // Initialize variables
        int x = 6;
        int y = 20;
        int z = 13;
    
        // 2x² + y²
        int eq_1 = (2 * (x * x)) + (y * y);
        System.out.println("Equation 1: " + eq_1);
    
        // 3x + y - 3z²
        int eq_2 = (3 * x) + y - (3 * (z * z));
        System.out.println("Equation 2: " + eq_2);
    
        // 2x - 2y + 5z²
        int eq_3 = (2 * x) - (2 * y) + (5 * (z * z));
        System.out.println("Equation 3: " + eq_3);
    }
}
