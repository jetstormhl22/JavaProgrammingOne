package Chapter8;

/**
 * Program to display information about employees.
 *
 * @author Hayden Love
 */
public class C8_4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        int x = 0;
        int[][] a = {
            {2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 4, 1},
            {3, 5, 4, 3, 6, 3, 8},
            {3, 4, 4, 6, 3, 4, 4},
            {3, 7, 4, 8, 3, 8, 4},
            {6, 3, 5, 9, 2, 7, 9},};
        System.out.println("                Su      M       T       W       Th      F       S       Total");
        for (int r = 0; r < a.length; r++) {
            System.out.print("Employee " + r);
            for (int c = 0; c < a[r].length; c++) {
                System.out.print("\t" + a[r][c]);
            }
            System.out.println("       " + (a[x][0] + a[x][1] + a[x][2] + a[x][3] + a[x][4] + a[x][5] + a[x][6]));
            x++;
        }
    }
}
