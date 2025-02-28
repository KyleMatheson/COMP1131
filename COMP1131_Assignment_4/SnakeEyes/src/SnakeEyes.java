/*********************************************************************************************************************
 SnakeEyess.java

 Kyle Matheson T00153296
 COMP1131 Assignment 4 Question 2

  For your design, create a UML Class diagram similar to Figure 5.5 on page 180 of the textbook.
 Note that you need to include the constructors in the methods section.

 Write a test driver that exercises this class as follows:

 Instantiates a 6-sided die using the default constructor, then outputs the results of 12 rolls.

 Create one of each of the five regular dice using the second constructor.
 For each, output the results from a number of rolls that is double the number of faces created
 (i.e., 8 rolls for 4 faces, 12 rolls for 6 faces, etc.)

 Attempt to create a die with an illegal number of faces then output the results of 10 rolls.
 *********************************************************************************************************************/
import java.util.Scanner;

public class SnakeEyes
{
    public static void main (String[] args)
    {
        Die die1 = new Die();
        Die die2 = new Die();

        rollDice(die1, die2); // roll default dice

        Die die3 = new Die(4);
        Die die4 = new Die(4);

        rollDice(die3, die4);  //roll four sided dice

        Die die5 = new Die(8);
        Die die6 = new Die(8);

        rollDice(die5, die6);  //roll eight sided dice

        Die die7 = new Die(12);
        Die die8 = new Die(12);

        rollDice(die7, die8);  //roll twelve sided dice

        Die die9 = new Die(20);
        Die die10 = new Die(20);

        rollDice(die9, die10);  //roll twelve sided dice

        Die die11 = new Die(15);
        Die die12 = new Die(15);

        rollDice(die11, die12);  //roll invalid sided dice



    }
    private static void rollDice(Die die1, Die die2)
    {
        int count= 0;
        int rolls = die1.getDiceFaces() * 2;
        for (int roll=1; roll <= rolls; roll++)  //  always roll the dice twice as often as
        {
            int num1 = die1.roll();
            int num2 = die2.roll();


            if (num1 == 1 && num2 == 1)
            {
                count++;
            }
        }
        System.out.println(rolls + " Rolls for " + die1.getFacesStringValue() + " faces");
        System.out.println("Number of Snake eyes: " + count);
        System.out.println("Ratio: " + (float)count/rolls);
        System.out.println();

    }
}
