package Chapter_2;

import java.util.Scanner;

public class CalcPerimeterAndArea
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Squares Side Length:");

        int length = scan.nextInt();

        System.out.println("Perimeter " + length * 4 + " Area " + length * 2 + "^2");
    }
}
