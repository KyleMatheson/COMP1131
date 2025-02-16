package Assignment1;

import java.util.Scanner;

public class ConvertGallonsToLitres
{
    public static void main (String[] args)
    {
        double CONVERSION_FACTOR = 4.54609;  //constant conversion factor

        Scanner scan = new Scanner(System.in);  //create new scanner object

        System.out.print("Enter volume in gallons:");  //prompt for user input
        double gallons = scan.nextDouble(); //gather valid data

        double litres = gallons * CONVERSION_FACTOR;  //apply conversion factor to user input

        System.out.println(gallons + " gallons is litres: " + litres);  //output converted data
    }
}
