package Chapter7;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Program to create an array based on user inputs and then find the average of
 * the numbers inside.
 *
 * @author Hayden Love
 */
public class P7 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] average;
        int arraySize;

        System.out.println("Please enter your array size: ");
        arraySize = input.nextInt();
        average = new double[arraySize];

        arrayInputs(average, arraySize);

        System.out.println("Your average is " + average(average, arraySize));
        System.out.println(Arrays.toString(average));
    }

    /**
     * Method returns true if parameters are met.
     *
     * @param array is used to hold the numbers that the user inputs.
     * @param arraySize is used to hold the value that represents how large the
     * array is going to be.
     */
    public static void arrayInputs(double[] array, int arraySize) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter " + arraySize + " variables: ");
        for (int x = 0; x < arraySize; x++) {
            array[x] = input.nextDouble();
        }
        average(array, arraySize);
    }

    /**
     * Method returns true if parameters are met.
     *
     * @param array is used to hold the numbers that the user inputs.
     * @param arraySize is used to hold the value that represents how large the
     * array is going to be.
     * @return averages
     */
    public static double average(double[] array, double arraySize) {
        double averages = 0;
        for (int x = 0; x < arraySize; x++) {
            averages += array[x];
        }
        averages = (averages / arraySize);
        return averages;
    }
}
