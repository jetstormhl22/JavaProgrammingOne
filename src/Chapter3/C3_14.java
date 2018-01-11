package Chapter3;

import java.util.Scanner;

/**
 * Program to play a game of heads or tails
 *
 * @author Hayden Love
 */

public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Heads (1) or tails (0): ");
        int guess = input.nextInt();
        int number1 = (int) (Math.random() * 2);
        if (guess == number1) {
            System.out.println("You guessed correctly " + guess + " is correct");
        } else {
            System.out.println("You guessed incorrectly " + guess + " is incorrect");
        }

    }
}
