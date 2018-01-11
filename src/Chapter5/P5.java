package Chapter5;

import java.util.Scanner;

/**
 * Program to vote and tally votes.
 *
 * @author Hayden Love
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    private static char v;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yCount = 0;
        int nCount = 0;
        do {
            System.out.println("Enter your vote, Y(yes) or N(no). Type Q to end voting: ");
            String vote = input.next().toUpperCase();
            char v = vote.charAt(0);
            if (v != 'Y' || v != 'N') {
                switch (v) {
                    case 'Y':
                        yCount++;
                        break;
                    case 'N':
                        nCount++;
                        break;
                    case 'Q':
                        System.out.printf("yes votes = %d, no votes = %d ", yCount, nCount);
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid input, please try again");
                }
            }
        } while (v != 'Q');
    }
}
