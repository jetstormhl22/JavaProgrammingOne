package Chapter8;

import java.util.*;

/**
 * Program to compile data about specific salesman in a company.
 *
 * @author Hayden Love
 */
public class P8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] money = new double[4][5];
        String salesman, week, answer;
        do {
            do {
                System.out.println("Enter the salesman ID as A, B, C, or D: ");
                salesman = input.next().toUpperCase();
            } while (!salesman.equals("A") && !salesman.equals("B") && !salesman.equals("C") && !salesman.equals("D"));

            do {
                System.out.println("Enter the day as M, T, W, H, or F: ");
                week = input.next().toUpperCase();
            } while (!week.equals("M") && !week.equals("T") && !week.equals("W") && !week.equals("H") && !week.equals("F"));

            System.out.println("Enter the amount of the sale: ");
            double dollars = input.nextDouble();

            do {

                System.out.println("More data? Enter Y for yes or N no: ");
                answer = input.next().toUpperCase();
            } while (!answer.equals("Y") && !answer.equals("N"));
        } while (!answer.equals("N"));
    }
}
