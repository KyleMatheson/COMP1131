/*********************************************************************************************************************
 ConvertFraction.java

 Kyle Matheson T00153296
 COMP1131 Assignment 1 Question 3

 Prompts for and obtains the numerator of a fraction as an integer,
 then prompts for and obtains the denominator of a fraction as an integer.
 Calculate and display the decimal equivalent of the fraction.
 *********************************************************************************************************************/
import java.util.Scanner;

public class ConvertFraction
{
   public static void main (String[] args)
   {
       // prompt for user data and gather responses
       Scanner scan = new Scanner(System.in);
       System.out.print("Enter the numerator:");
       int numerator = scan.nextInt();
       System.out.print("Enter the denominator:");
       int denominator = scan.nextInt();

       // calculate the decimal value of the fraction from the user entered data
       double result = (double) numerator / denominator;

       //display the results
       System.out.println(numerator + "/" + denominator + " is " + result );
   }
}
