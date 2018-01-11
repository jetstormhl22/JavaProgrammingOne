package Chapter6;

import java.util.Scanner;

/**
 * Program to check the validity of passwords.
 *
 * @author Hayden Love
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password and I will check it: ");
        String password = input.nextLine();
        if (isValid(password)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

    /**
     * Method returns true if parameters are met.
     *
     * @param password A variable that holds the user input.
     * @return true
     */
    public static boolean isValid(String password) {
        int length = password.length();
        int counter = 0;
        if (length < 8) {
            return false;
        } else {
            for (int i = 0; i < password.length(); i++) {
                if (!Character.isLetterOrDigit(password.charAt(i))) {
                    return false;
                }
            }

            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i))) {
                    ++counter;
                }
            }
            if (counter < 2) {
                return false;
            }
        }
        return true;
    }
}
