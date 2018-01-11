package Chapter2;

import java.util.Scanner;

/**
 * Program to calculate gratuity and total amount of money based on user input
 *
 * @author Hayden Love
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a subtotal and gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();
        double gratuity = (subtotal * gratuityRate) / 100;
        double total = subtotal + gratuity;

        System.out.println("The gratuity is $ " + gratuity + " and the total is $ " + total + "");

    }
}
