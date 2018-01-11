package Chapter3;

import java.util.Scanner;

/**
 * Program to check which of the two items have a better price based off of user
 * input of weight and price
 *
 * @author Hayden Love
 */

public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the weight and price of item1: ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();
        System.out.println("Enter the weight and price of item2:  ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();
        double total1 = price1 / weight1;
        double total2 = price2 / weight2;
        if (total2 > total1) {
            System.out.println("Product 1 has a better price");
        } else if (total1 == total2) {
            System.out.println("The two products are the same price");
        } else {
            System.out.println("Product 2 has a better price");
        }
    }
}
