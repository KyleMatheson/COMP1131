package Assignment1;

import java.util.Scanner;

public class ConvertFraction
{
   public static void main (String[] args)
   {
       Scanner scan = new Scanner(System.in);  //create scanner object

       System.out.print("Enter the numerator:"); //prompt for user input
       int numerator = scan.nextInt(); //gather valid data

       System.out.print("Enter the denominator:"); //prompt for user input
       int denominator = scan.nextInt(); //gather valid data

       double result = (double) numerator / denominator;  //cast int's to double and divide to get decimal equivelent of the fraction

       System.out.println(numerator + "/" + denominator + " is " + result );  //print output to console

   }
}
