/*********************************************************************************************************************
 NameGenerator.java

 Kyle Matheson T00153296
 COMP1131 Assignment 2 Question 1

 prompts for and obtains a person’s first and last name (separately),
 then composes and displays a new codename for a computer game system.

 The codename is to be a string composed of the first m characters of the person’s first name,
 followed by the first n letters of the person’s last name.
 The values of m and n are to be a random number from 1 to the number of characters in the respective name.
 *********************************************************************************************************************/
import java.util.*;

public class NameGenerator
{
    public static void main (String[] args)
    {
        // gather the required information from the user.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First Name:");
        String firstName = scan.nextLine();
        System.out.print("Enter Last Name:");
        String lastName = scan.nextLine();

        // codename generation
        Random generator = new Random();
        String generatedFirstName = firstName.substring(0,generator.nextInt(1, firstName.length()));
        String generatedLastName = lastName.substring(0,generator.nextInt(1, lastName.length()));
        String codename = generatedFirstName + generatedLastName;

        // output results
        System.out.println("Codename is: " + codename);
    }
}