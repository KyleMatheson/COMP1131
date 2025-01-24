package Chapter_2;

import java.util.Scanner;

public class DistanceConverter
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter distance in miles:");
        double miles = scan.nextDouble();
        double kilometers = miles * 1.60935;
        System.out.println("Distance in kilometers: " + kilometers);
    }
}
