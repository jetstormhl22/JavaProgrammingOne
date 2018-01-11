package Chapter6;

import java.util.Scanner;

/**
 * Program to convert money amounts of different currencies.
 *
 * @author Hayden Love
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double money1, money2, money3, dollars;
        String answer = "", response = "";
        System.out.println("Please enter the Euro conversion rate: ");
        money1 = input.nextDouble();
        System.out.println("Please enter the Pound conversion rate: ");
        money2 = input.nextDouble();
        System.out.println("Please enter the Yen conversion rate: ");
        money3 = input.nextDouble();
        do {
            System.out.println("How many dollars are you converting: ");
            dollars = input.nextDouble();
            System.out.println("What are you converting to? Yen(Y), Pound(P), Euro(E): ");
            answer = input.next();
            if (answer.equalsIgnoreCase("E")) {
                double euro = Convert(dollars, money1);
                System.out.printf("For %.2f dollars, you will buy %.2f euros", dollars, euro);
            } else if (answer.equalsIgnoreCase("P")) {
                double pound = Convert(dollars, money2);
                System.out.printf("For %.2f dollars, you will buy %.2f pounds", dollars, pound);
            } else if (answer.equalsIgnoreCase("Y")) {
                double yen = Convert(dollars, money3);
                System.out.printf("For %.2f dollars, you will buy %.2f yens", dollars, yen);
            }
            do {
                System.out.println("Would you like to make any more conversions: ");
                response = input.next();
            } while (!response.equalsIgnoreCase("yes") && !response.equalsIgnoreCase("no"));
        } while (!response.equalsIgnoreCase("no"));
    }

    /**
     * method to find the total.
     *
     * @param dollars the amount of dollars we are converting.
     * @param money the amount of currency we are converting.
     * @return total
     */
    public static double Convert(double dollars, double money) {
        double reduction = 0.95;
        double reduction2 = 0.9;
        double total;
        if (dollars > 100) {
            total = (dollars * reduction) * money;
        } else {
            total = (dollars * reduction2) * money;
        }
        return total;
    }
}
