/*********************************************************************************************************************
 Snake Eyes.java

 Kyle Matheson T00153296
 COMP1131 Assignment 4 Question 2

 Test Driver that tests for:
    1. Instantiates a 6-sided die using the default constructor, then outputs the results of 12 rolls.

    2. Create one of each of the five regular dice using the second constructor.

    3. For each, output the results from a number of rolls that is double the number of faces created
    (i.e., 8 rolls for 4 faces, 12 rolls for 6 faces, etc.)

    4. Attempt to create a die with an illegal number of faces then output the results of 10 rolls.

    5. Test the .toString method
 *********************************************************************************************************************/

public class SnakeEyes
{
    public static void main (String[] args)
    {
        // Test Case to test default constructor
        Die die1 = new Die();
        Die die2 = new Die();
        System.out.println("Default Constructor TEst Case:");
        rollDice(die1, die2); // roll default dice

        // Test cases to test all valid dice sides in overflow constructor
        Die die3 = new Die(4);
        Die die4 = new Die(4);
        System.out.println("Overload Constructor D4  Case:");
        rollDice(die3, die4);  //roll four sided dice

        Die die5 = new Die(8);
        Die die6 = new Die(8);
        System.out.println("Overload Constructor D8  Case:");
        rollDice(die5, die6);  //roll eight sided dice

        Die die7 = new Die(12);
        Die die8 = new Die(12);
        System.out.println("Overload Constructor D12  Case:");
        rollDice(die7, die8);  //roll twelve sided dice

        Die die9 = new Die(20);
        Die die10 = new Die(20);
        System.out.println("Overload Constructor D20  Case:");
        rollDice(die9, die10);  //roll twelve sided dice

        // Test invalid entry during instantiation
        Die die11 = new Die(15);
        Die die12 = new Die(15);
        System.out.println("Overload Constructor invalid Case:");
        rollDice(die11, die12);  //roll invalid sided dice

        //Test setter and getters
        die1.setFaceValue(3);
        System.out.println("The set value of the dice is (3): " + die1.getFaceValue());
        System.out.println("This die hase " + die1 + " faces");
    }

    // support class for rolling dice.
    private static void rollDice(Die die1, Die die2)
    {
        int count= 0;
        int rolls = die1.getDieFaces() * 2;        //  always roll the dice twice as often as

        for (int roll=1; roll <= rolls; roll++)
        {
            int num1 = die1.roll();
            int num2 = die2.roll();


            if (num1 == 1 && num2 == 1)
            {
                count++;
            }
        }

        // Output results
        System.out.println(rolls + " Rolls for " + die1.getDieFacesStr() + " faces");
        System.out.println("Number of Snake eyes: " + count);
        System.out.println("Ratio: " + (float)count/rolls);
        System.out.println();

    }
}
