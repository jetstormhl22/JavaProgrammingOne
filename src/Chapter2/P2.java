package Chapter2;

/**
 * Program to assign a number to variable z and display it if y is less than 3
 * or display x
 *
 * @author Hayden Love
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        if (x > 2) {
            System.out.println("");
        }
        if (y > 3) {
            int z = x + y;

            System.out.println("z is " + z);
        } else {
            System.out.println("x is " + x);
        }
    }
}
