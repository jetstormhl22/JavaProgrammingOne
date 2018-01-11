package Chapter4;

import java.util.Scanner;

/**
 * Program to read two strings entered by the user to see if they contain one
 * another
 *
 * @author Hayden Love
 */
public class C4_22 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a string and then input another string: ");
        String number = input.nextLine();
        String subnumber = input.nextLine();
        if (number.contains(subnumber)) {
            System.out.println("String 1 contains String 2 making it a substring");
        } else {
            System.out.println("String 1 does not contain string 2, it is not a substring");
        }
    }
}
