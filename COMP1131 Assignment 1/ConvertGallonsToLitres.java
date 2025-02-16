/*********************************************************************************************************************
 ConvertGallonsToLitres.java

 Kyle Matheson T00153296
 COMP1131 Assignment 1 Question 1

Prompt for and obtain the gallons amount from the user as a decimal value and report the equivalent amount in litres.
 *********************************************************************************************************************/

import java.util.Scanner;

public class ConvertGallonsToLitres
{
    public static void main (String[] args)
    {
        double CONVERSION_FACTOR = 4.54609;

        // prompt for user data and gather response
        Scanner scan = new Scanner(System.in);  //create new scanner object
        System.out.print("Enter volume in gallons:");  //prompt for user input
        double gallons = scan.nextDouble(); //gather valid data

        // convert data
        double litres = gallons * CONVERSION_FACTOR;  //apply conversion factor to user input

        // output result
        System.out.println(gallons + " gallons is litres: " + litres);  //output converted data
    }
}
