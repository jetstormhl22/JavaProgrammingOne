package Chapter7;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Program to sort student's grades based on scores that the user inputs.
 *
 * @author Hayden Love
 */
public class C7_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] grade;
        int newest, best = 0;
        System.out.print("Enter the number of students: ");
        int students = input.nextInt();
        grade = new int[students];
        System.out.println("Enter " + students + " scores");
        for (int i = 0; i < grade.length; i++) {
            grade[i] = input.nextInt();
            newest = grade[i];
            if (newest > best) {
                best = newest;
            }
            if (i == grade.length) {
                break;
            }
        }
        for (int x = 0; x < grade.length; x++) {
            if (grade[x] >= best - 10) {
                System.out.println("Student " + x + " score is " + grade[x] + " grade is A");
            } else if (grade[x] >= best - 20) {
                System.out.println("Student " + x + " score is " + grade[x] + " grade is B");
            } else if (grade[x] >= best - 30) {
                System.out.println("Student " + x + " score is " + grade[x] + " grade is C");
            } else if (grade[x] >= best - 40) {
                System.out.println("Student " + x + " score is " + grade[x] + " grade is D");
            } else {
                System.out.println("Student " + x + " score is " + grade[x] + " grade is F");
            }
            if (x == grade.length) {
                break;
            }
        }
    }
}
