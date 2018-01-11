package Chapter4;

import java.util.Scanner;

/**
 * Program to tell the user their major and grade based off of input
 *
 * @author Hayden Love
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter major and grade: ");
        String a = input.next().toUpperCase();
        char b = a.charAt(0);
        char c = a.charAt(1);
        if (c != '1' && c != '2' && c != '3' && c != '4') {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        switch (b) {
            case 'M':
                System.out.println("Mathematics ");
                break;
            case 'C':
                System.out.println("Computer Science ");
                break;
            case 'I':
                System.out.println("Information Technology ");
                break;
            default:
                System.out.println("Invalid Input");
                System.exit(0);
                break;
        }
        switch (c) {
            case '1':
                System.out.println("Freshman");
                break;
            case '2':
                System.out.println("Sophomore");
                break;
            case '3':
                System.out.println("Junior");
                break;
            case '4':
                System.out.println("Senior");
                break;
        }
    }
}
