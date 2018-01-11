package Chapter4;

import java.util.Scanner;

/**
 * Program to find out the amount of money an employee would make and how much
 * is deducted based off user input
 *
 * @author Hayden Love
 */

public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an employee's name: ");
        String name = input.nextLine();
        System.out.println("Enter the number of hours he/she worked in a week: ");
        double hours = input.nextDouble();
        System.out.println("Enter hourly pay rate: ");
        double pay = input.nextDouble();
        System.out.println("Enter federal tax witholding rate: ");
        double tax1 = input.nextDouble();
        System.out.println("Enter state tax witholding rate: ");
        double tax2 = input.nextDouble();
        double grossPay = pay * hours;
        double fDeduction = grossPay * tax1;
        double sDeduction = grossPay * tax2;
        double tDeduction = fDeduction + sDeduction;
        double netPay = grossPay - tDeduction;
        System.out.println("Employee name: " + name + "");
        System.out.println("Hours worked: " + hours + "");
        System.out.printf("Pay rate: $%4.2f %n", pay);
        System.out.printf("Gross pay: $%4.2f %n", grossPay);
        System.out.println("Deductions: ");
        System.out.printf("  Federal Witholding: $%4.2f %n", fDeduction);
        System.out.printf("  State Witholding: $%4.2f %n", sDeduction);
        System.out.printf("  Total Deduction: $%4.2f %n", tDeduction);
        System.out.printf("Net pay: $%4.2f", netPay);
    }
}
