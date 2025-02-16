package Assignment1;

import java.util.Scanner;

public class SecondsToHMS
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); //create new scanner object

        System.out.print("Enter duration in whole number of seconds:");  //prompt for user data
        int seconds = scan.nextInt();  //gather valid data

        int hours = seconds / 3600 ;  //divide user data by sec in hour, discard remainder
        int minutes = (seconds % 3600) / 60; //expand above to use remainder for minutes, discard remainder
        int secondsRemainder = seconds % 60;  //expand above and use remainder for sec.

        System.out.printf("Time is %d hours, %d minutes, %d seconds%n", hours, minutes, secondsRemainder); //print output to console
        /* I know the text book dismisses f strings, but I am used to using them in Python, why are they so bad? */
    }
}

