/*********************************************************************************************************************
OverUnderGame.java

Kyle Matheson T00153296
COMP1131 Assignment 3 Question 1

 An application that plays the Over-Under guessing game with numbers.

 The program should pick a random number between 1 and 100 (inclusive), then repeatedly prompt the user to guess the number.
 On each guess, report to the user that they are correct or that the guess is over or under the target random number.
 Continue accepting guesses until the user guesses correctly or chooses to quit.
 Count the number of guesses and report that value when the user guesses correctly.
 If a guess is out of the range 1 to 100, an appropriate message should be displayed to the user and the guess not be counted.
 At the end of each game (by quitting or a correct guess), prompt to determine whether the user wants to play again.
 Continue playing another game until the user chooses to stop.
 *********************************************************************************************************************/
import java.util.*;

public class OverUnderGame
{
    public static void main (String[] args)
    {
        //  Generate an initial random number between 1 and 100
        Random generator = new Random();
        int target = generator.nextInt(100) + 1;

        int guess = 0;
        int count = 0;
        boolean restart = false;

        Scanner scan = new Scanner(System.in);

        // prompt for user input until correct or exits
        while (guess != target)
        {
            System.out.print("Enter your guess between 1 and 100(0 to Quit):");
            // check data type and only accept integers to avoid runtime error
            if (scan.hasNextInt())
            {
                guess = scan.nextInt();
            }
            else
            {
                System.out.println("no valid integer found. Exiting Game");
            }

            if (guess == 0 && !restart)  //count check allows restarts
            {
                break;
            }
            // constrain guesses between 1 and 100
            else if (guess > 0 && guess <= 100 )
            {
                restart = false;
                count++;
                if (guess > target) {
                    System.out.println("Your Guess is High!");
                }
                if (guess < target) {
                    System.out.println("Your Guess is Low!");
                }
                if (guess == target)
                {
                    System.out.print("Congrats, YOU WON IN " + count + "!\n");
                    scan.nextLine();  //advance the scanner to clear the buffer
                    System.out.print("Do you wish to play again(y/n)?");
                    String response = scan.nextLine();

                    if (response.equalsIgnoreCase("y"))
                    {
                        //reset game counters and regenerate a random number
                        restart = true;
                        count = 0;
                        guess = 0;
                        target = generator.nextInt(100) + 1;
                    }
                    else break;  //lazy code exit on 'n' or any entry other than 'y'
                }
            }
            else
            {
                System.out.println("Your Guess is invalid, enter a number between 1 and 100");
            }
        }
    }
}