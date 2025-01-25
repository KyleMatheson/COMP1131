package Chapter_3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class TriangleArea
{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        DecimalFormat fmt1 = new DecimalFormat("0.###");

        System.out.print("Enter 3 Sides:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();


        double s = (double) (a + b + c) / 2;

        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println("Triangle area is " + fmt1.format(area));

    }
}
