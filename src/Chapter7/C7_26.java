package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Program to check if two lines of numbers are strictly identical.
 *
 * @author Hayden Love
 */
public class C7_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        int[] list1;
        int[] list2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numbers for list one: ");
        int input1 = input.nextInt();
        list1 = new int[input1];
        x(list1, input);

        System.out.println("Enter the numbers for list two: ");
        int input2 = input.nextInt();
        list2 = new int[input2];
        x(list2, input);

        if (equals(list1, list2)) {
            System.out.println("Two lists are strictly identical.");
        } else {
            System.out.println("Two lists are not strictly identical.");
        }
    }

    /**
     * Method returns true if parameters are met.
     *
     * @param list1 holds the inputs for the first set of numbers.
     * @return list1
     */
    public static int[] x(int[] list1, Scanner input) {
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }
        return list1;
    }

    /**
     * Method returns true if parameters are met.
     *
     * @param list2 holds the second set of numbers input.
     * @return false
     */
    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }

        return Arrays.equals(list1, list2);
    }

}
