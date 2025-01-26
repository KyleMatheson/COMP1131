package Assignment1;

import java.util.Scanner;

public class ConvertGallonsToLitres
{
    public static void main (String[] args)
    {
        double CONVERSION_FACTOR = 4.54609;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter volume in gallons:");
        double gallons = scan.nextDouble();

        double litres = gallons * CONVERSION_FACTOR;

        System.out.println(gallons + " gallons is litres: " + litres);
    }
}
