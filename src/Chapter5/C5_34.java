package Chapter5;

import java.util.Scanner;

/**
 * Program to play a game of rock, paper, scissors.
 *
 * @author Hayden Love
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cGuess;
        int pGuess;
        int cCount = 0;
        int pCount = 0;
        do {
            System.out.print("Enter 0(Rock), 1(Paper), or 2(Scissors)");
            pGuess = input.nextInt();
            cGuess = (int) (Math.random() * 3);
            //0-Rock
            //1-Paper
            //2-Scissors            
            switch (pGuess) {
                case 0:
                    if (cGuess == 0) {//tie
                        System.out.println("You and the computer tied");
                    }
                    if (cGuess == 1) {//lose
                        System.out.println("You lost to the computer");
                        cCount++;
                    }
                    if (cGuess == 2) {//win
                        System.out.println("You won against the computer");
                        pCount++;
                    }
                    break;
                case 1:
                    if (cGuess == 1) {//tie
                        System.out.println("You and the computer tied");
                    }
                    if (cGuess == 2) {//lose
                        System.out.println("You lost to the computer");
                        cCount++;
                    }
                    if (cGuess == 0) {//win
                        System.out.println("You won against the computer");
                        pCount++;
                    }
                    break;
                case 2:
                    if (cGuess == 2)//tie
                    {
                        System.out.println("You and the computer tied");
                    }
                    if (cGuess == 0) {//lose
                        System.out.println("You lost to the computer");
                        cCount++;
                    }
                    if (cGuess == 1) {//win
                        System.out.println("You won against the computer");
                        pCount++;
                    }
                    break;
            }
        } while (pCount <= 2 && cCount <= 2);

        if (pCount == 3) {
            System.out.printf("Player wins with a score of %d", pCount);
        } else if (pCount < cCount) {
            System.out.printf("The computer wins with a score of %d", cCount);
        }
    }
}
