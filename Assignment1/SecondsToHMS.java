package Assignment1;

import java.util.Scanner;

public class SecondsToHMS
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter duration in whole number of seconds:");
        int seconds = scan.nextInt();

        int hours = seconds / 3600 ;
        int minutes = (seconds % 3600) / 60;
        int secondsRemainder = seconds % 60;

        System.out.printf("Time is %d hours, %d minutes, %d seconds%n", hours, minutes, secondsRemainder);
    }
}

