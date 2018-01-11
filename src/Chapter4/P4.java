package Chapter4;

import java.util.Scanner;

/**
 * Program to compare two bidders checking which one has the better deal based
 * on user input
 *
 * @author Hayden Love
 */

public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of the first bidder: ");
        String name1 = input.next();
        System.out.println("How many hours of work do you require?: ");
        int hours1 = input.nextInt();
        System.out.println("How much do you charge per hour?: ");
        double charge1 = input.nextDouble();
        System.out.println("Enter the name of the second bidder: ");
        String name2 = input.next();
        System.out.println("How many hours of work do you require?: ");
        int hours2 = input.nextInt();
        System.out.println("How much do you charge per hour?: ");
        double charge2 = input.nextDouble();
        double cost1 = (charge1 * hours1);
        double cost2 = (charge2 * hours2);
        if (cost1 < cost2) {
            System.out.printf("Bidder 1, " + name1 + ", has won the bid with $%4.2f %n", cost1);
        } else if (cost2 < cost1) {
            System.out.printf("Bidder 2, " + name2 + ", has won the bid with $%4.2f %n", cost2);
        } else if (cost1 == cost2 && hours1 < hours2) {
            System.out.printf("Bidder 1, " + name1 + ", has won the bid with " + hours1 + " hours at a cost of $%4.2f %n", cost1);
        } else if (cost1 == cost2 && hours2 < hours1) {
            System.out.printf("Bidder 2, " + name2 + ", has won the bid with " + hours2 + " hours at a cost of $%4.2f %n", cost2);
        } else if (cost1 == cost2 && hours1 == hours2) {
            System.out.println("Both bidders " + name1 + " and " + name2 + " have equal costs and hours");
            System.out.println("Hours: " + hours1 + "");
            System.out.printf("Charge per hour: $%4.2f %n", charge1);
            System.out.printf("Total cost: $%4.2f", cost1);
        }
    }
}
