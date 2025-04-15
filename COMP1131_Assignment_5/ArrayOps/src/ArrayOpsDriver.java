/*********************************************************************************************************************
 ArrayOpsDriver.java

 Kyle Matheson T00153296
 COMP1131 Assignment 5 Question 1

 Driver to test ArrayOps class and provide an output of the methods.

 *********************************************************************************************************************/
import java.util.Scanner;

public class ArrayOpsDriver
{
    public static void main(String[] args)
    {
        int response;
        //Gather user input.  Loop until an integer greater than 0 is entered.
        while (true)
        {
            System.out.print("Enter the array size:");
            Scanner scan = new Scanner(System.in);
            response = scan.nextInt();

            if (response > 0)
            {
                break;
            }
            else
            {
                System.out.println("Entry must be a positive number");
            }
        }
        //process the ArrayOps with the valid gathered data.
        ArrayOps driver = new ArrayOps(response);

        //output the results
        System.out.println("The Array Values are:" + driver.toString());
        System.out.println("The Maximum Value is:" + driver.GetMax());
        System.out.println("The Minimum Value is:" + driver.GetMin());
        System.out.println("The Array Average is:" + driver.GetAverage());
    }
}
