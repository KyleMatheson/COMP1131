import java.util.Arrays;
import java.util.Scanner;

public class PascalsTriangle
{
    public static int[][] array;
    private static int rows;

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of rows for your Pascal's Triangle:");
        rows = scan.nextInt();

        int[][] array = new int[rows + 2][rows + 2];

        array[0][0] = 0;

        int row = 0;
        int column = 0;

        for (row = 1; row <= rows; row++) {
            for (column = 1; column <= row; column++) {
                System.out.printf("(%d,%d) : %d)", row, column, array[row][column]);
            }
        }
    }
}

