/*********************************************************************************************************************
 VowelCounter.java

 Kyle Matheson T00153296
 COMP1131 Assignment 3 Question 2

 An application that plays the Over-Under guessing game with numbers.

 an application that repeatedly reads some text from the user,
 then determines and displays how many of each of the five vowels (i.e., a, e, i, o, and u) appear in the entire text.

 Have a separate counter for each vowel. Also count and print the number of non-vowel characters.
 The app should handle both lowercase and uppercase vowels.

 The logic must include a switch-case structure to determine which counter to increment.
 After the results for an input are displayed, prompt the user if they want to do another input.
 *********************************************************************************************************************/
import java.util.Scanner;

public class VowelCounter
{
    public static void main(String[] args)
    {
        // flag for the while loop.
        boolean run = true;

        Scanner scan = new Scanner(System.in);

        // Evaluation loop
        do
        {
            run = false;  // default state is to break the loop.  Requires positive response to rerun

            // counters for the chars
            int countA = 0;
            int countE = 0;
            int countI = 0;
            int countO = 0;
            int countU = 0;
            int countChar = 0;

            System.out.print("Enter vowel rich content:");
            String userData = scan.nextLine();

            // iterate the entire entry and increment the appropriate counter
            for (int i = 0; i < userData.length(); i++)
            {
                switch (userData.toLowerCase().charAt(i))
                {
                    case 'a':
                    {
                        countA++;
                        break;
                    }
                    case 'e':
                    {
                        countE++;
                        break;
                    }
                    case 'i':
                    {
                        countI++;
                        break;
                    }
                    case 'o':
                    {
                        countO++;
                        break;
                    }
                    case 'u':
                    {
                        countU++;
                        break;
                    }
                    case ' ': //dont count spaces
                    {
                        break;
                    }
                    default:
                    {
                        countChar++;
                    }
                }
            }
            // Output the data
            System.out.printf("There are %d A's\n", countA);
            System.out.printf("There are %d E's\n", countE);
            System.out.printf("There are %d I's\n", countI);
            System.out.printf("There are %d O's\n", countO);
            System.out.printf("There are %d U's\n", countU);
            System.out.printf("There are %d Charactors\n", countChar);

            // Rerun?
            System.out.print("Do you wish to do another(y/n)?");
            String response = scan.nextLine();

            if (response.equalsIgnoreCase("y"))
            {
                run = true;
            }
        }
        while (run);
    }
}



