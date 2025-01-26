package Assignment1;

import java.util.Scanner;

public class ConvertFraction
{
   public static void main (String[] args)
   {
       Scanner scan = new Scanner(System.in);

       System.out.print("Enter the numerator:");
       int numerator = scan.nextInt();

       System.out.print("Enter the denominator:");
       int denominator = scan.nextInt();

       double result = (double) numerator / denominator;

       System.out.println(numerator + "/" + denominator + " is " + result );

   }
}
