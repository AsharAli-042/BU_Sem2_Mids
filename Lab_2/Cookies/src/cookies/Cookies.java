
package cookies;
import java.util.Scanner;

public class Cookies {
    public static void main(String[] args) {
        
        int cookiesPerBox = 12;
        int boxesPerCarton = 24;
        double boxPrices = 1.14;
        double leftoverBoxPrices = 0.57;

        // Number of cookies produced
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cookies produced: ");
        int totalCookies = sc.nextInt();

        // Calculate number of boxes
        int totalBoxes = totalCookies / cookiesPerBox;
        int leftoverCookies = totalCookies % cookiesPerBox;

        // Calculate number of cartons
        int totalCartons = totalBoxes / boxesPerCarton;
        int leftoverBoxes = totalBoxes % boxesPerCarton;

        // Calculate total money made
        double fullBoxMoney = (totalBoxes - leftoverBoxes) * boxPrices;  
        double leftoverBoxMoney = leftoverBoxes * leftoverBoxPrices;     
        double totalMoneyMade = fullBoxMoney + leftoverBoxMoney;

        // Results
        System.out.println("Total Boxes: " + totalBoxes);
        System.out.println("Total cartons: " + totalCartons); 
        System.out.println("Leftover boxes: " + leftoverBoxes);
        System.out.println("Remaining cookies given away: " + leftoverCookies);
        System.out.println("Total money made: $" + totalMoneyMade);
    }
}
