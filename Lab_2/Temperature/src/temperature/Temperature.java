package temperature;

public class Temperature {
    public static void main(String[] args){
        // Declare variables for Fahrenheit and Celsius temperatures
        double f1, f2, f3, f4, c1, c2, c3, c4;

        // Assign Celsius values to variables
        c1 = 289; 
        c2 = 400; 
        c3 = -36; 
        c4 = -180;

        // Convert each Celsius temperature to Fahrenheit using the formula F = C * (9/5) + 32
        f1 = ((c1 * (9.0 / 5.0)) + 32);
        f2 = ((c2 * (9.0 / 5.0)) + 32);
        f3 = ((c3 * (9.0 / 5.0)) + 32);
        f4 = ((c4 * (9.0 / 5.0)) + 32);

        // Output the results of each conversion
        System.out.println("289 °C = " + f1 + " °F");
        System.out.println("400 °C = " + f2 + " °F");
        System.out.println("-36 °C = " + f3 + " °F");
        System.out.println("-180 °C = " + f4 + " °F");
    }
}
