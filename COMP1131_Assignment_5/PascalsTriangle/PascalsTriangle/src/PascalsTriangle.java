import java.util.Arrays;
import java.util.Scanner;

public class PascalsTriangle
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of rows for your Pascal's Triangle:");
        int rows = scan.nextInt();

        int row;
        int column;
        for (row = 0; row < rows; row++)
        {
            for (column = 0; column <= row; column++)
            {
                int value = calc(row, column);
                System.out.printf("(%d,%d) : %d)",row,column,value);
            }
        }


    }

    private static int calc(int r, int c)
    {
        return 1;
    }
}
