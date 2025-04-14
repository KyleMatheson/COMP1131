import java.util.Arrays;
import java.util.Scanner;

public class PascalsTriangle
{
    public static void main (String[] args)
    {
        int[] value = new int[2];



        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of rows for your Pascal's Triangle:");
        int r = scan.nextInt();
        System.out.print("c:");
        int c = scan.nextInt();

        for (int i = 0; i<r; i++) //row iterator
        {

            int array = calc(i,c) + calc(i,c);
            System.out.println();
        }


        //value = calc(r-1, c-1) + calc(r-1, 1);
        System.out.println();

    }

    private static int calc(int r, int c)
    {

        int[] calcValue = {((r - 1) + (r - 1)),((c-1)+ c)};
        return calcValue[0];
    }
}
