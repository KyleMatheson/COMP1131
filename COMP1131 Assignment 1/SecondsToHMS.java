/*********************************************************************************************************************
 SecondsToHMS.java

 Kyle Matheson T00153296
 COMP1131 Assignment 1 Question 2

 Prompts for and obtains a value representing a whole number of seconds,
 then displays the equivalent amount of time as a combination of hours, minutes, and seconds.
 *********************************************************************************************************************/
import java.util.Scanner;

public class SecondsToHMS
{
    public static void main(String[] args)
    {
        // prompt for user data and gather response
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter duration in whole number of seconds:");
        int seconds = scan.nextInt();

        // calculate H:M:S
        int hours = seconds / 3600 ;
        int minutes = (seconds % 3600) / 60;
        int secondsRemainder = seconds % 60;

        // output response
        System.out.printf("Time is %d hours, %d minutes, %d seconds%n", hours, minutes, secondsRemainder);
        /* I know the text book dismisses f strings, but I am used to using them in Python, why are they so bad? */
    }
}

