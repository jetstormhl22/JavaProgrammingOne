package Chapter5;

import java.util.Scanner;

/**
 * Program to reverse the user input.
 *
 * @author Hayden Love
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string that you would like to reverse: ");
        String s1 = input.nextLine();
        System.out.println("The reversed string is " + (new StringBuffer(s1).reverse().toString()));
    }
}
