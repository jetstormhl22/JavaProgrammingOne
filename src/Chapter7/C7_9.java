package Chapter7;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Program to find the lowest number that the user inputs.
 *
 * @author Hayden Love
 */
public class C7_9 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        double[] numbers = new double[10];
        System.out.println("The minimum number is " + x(numbers));
    }

    /**
     * Method returns true if parameters are met.
     *
     * @param numbers holds the integers that the user inputs.
     * @return numbers[0]
     */
    public static double x(double[] numbers) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextDouble();
        }
        Arrays.sort(numbers);
        return numbers[0];
    }
}
