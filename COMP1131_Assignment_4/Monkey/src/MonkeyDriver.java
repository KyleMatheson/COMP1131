/*********************************************************************************************************************
 MonkeyDriver.java

 Kyle Matheson T00153296
 COMP1131 Assignment 3 Question 1

 An interactive test driver that instantiates a Monkey, then allows the user to manipulate it with simple commands
 like Output (to see the position and direction), Climb, Reverse, Exit ... single letters work just fine.
 *********************************************************************************************************************/
import java.util.Scanner;

public class MonkeyDriver
{
    public static void main(String[] args)
    {
        boolean restart = true;  // loop handler

        // create a new monkey named George and have him jump onto a vine.
        Monkey george = new Monkey("George");
        System.out.println(george.jumpNewVine());

        // wait for user input
        while (restart)
        {
            String status;
            String response;
            System.out.print("Press 'u' to climb or 'd' to descend.('e' to exit):");
            Scanner scan = new Scanner(System.in);
            response = scan.nextLine();

            // evaluates for a \n and responses with the status if true.
            if (!response.isEmpty())

            {
                response = response.substring(0, 1);  //prevent multi char inputs
            }
            else
            {
                response = " "; // triggers default case
            }


            // evaluate user input
            switch (response)
            {
                case "u":
                {
                    status = george.climb();
                    System.out.println(status);
                    break;
                }
                case "d":
                {
                    status = george.descend();
                    System.out.println(status);
                    break;
                }
                case "e":
                {
                    restart = false;
                    break;
                }
                default:  //return status for any non-valid response case
                {
                    System.out.println(george);
                }
            }
        }
    }
}