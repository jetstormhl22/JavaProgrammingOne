package Chapter3;

import java.util.Scanner;

/**
 * Program to check the divisibility of a user's input to 5 and 6, 5 or 6, and 5
 * or 6 but not both
 *
 * @author Hayden Love
 */

public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int number = input.nextInt();
        if (number % 5 == 0 && number % 6 == 0) {
            System.out.println("Number " + number + " is divisible by 5 and 6");
        } else {
            System.out.println("Number " + number + " is not divisible by 5 and 6");
        }
        if (number % 5 == 0 || number % 6 == 0) {
            System.out.println("Number " + number + " is divisible by 5 or 6");
        } else {
            System.out.println("Number " + number + " is not divisible by 5 or 6");
        }
        if (number % 5 == 0 ^ number % 6 == 0) {
            System.out.println("Number " + number + " is divisible by 5 or 6 but not both");
        } else {
            System.out.println("Number " + number + " is not divisible by 5 or 6 but not both");
        }
    }
}
