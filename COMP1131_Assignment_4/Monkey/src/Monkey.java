/*********************************************************************************************************************
 Monkey.java

 Kyle Matheson T00153296
 COMP1131 Assignment 4 Question 1

 Design and implement a class called Monkey, which represents a monkey climbing along a vertical vine in the jungle.
 The monkey can only climb for one unit of distance at a time. The direction in which it is climbing can be either up or down.
 The monkey can decide to change direction (i.e., if it was climbing up, then it will now be climbing down; and vice versa).
 Monkey requires a toString method to return both the current position and the direction climbing to the driver so it can be output.

 No set or get methods are required for this question.

 For your design, create a UML Class diagram similar to Figure 5.5 on page 180 of the textbook.
 Note that you need to include the constructor in the methods section if you code a constructor.
*********************************************************************************************************************/
import java.util.Random;

public class Monkey
{
    public final int BOTTOM = -10, TOP = 10; // Define the rope parameters

    private String direction;
    private int location = 0;  //Monkey defaults to the middle unless jumpNewVine is called
    private final String name;

    public Monkey (String name)
    {
        this.name = name;
    }

    // Service methods to control the monkey
    public String climb()
    {
        if (location < TOP) {
            location++;
            direction = "Climbed up";
            return (name + " the Monkey " + direction + " to " + location);
        }
        else
        {
            return (name + " the Monkey is at the top");
        }
    }

    public String descend()
    {
        if (location > BOTTOM)
        {
            location--;
            direction = "Climbed down";
            return(name + " the Monkey " + direction + " to " + location);
        }
        else
        {
            return (name + " the Monkey is at the bottom");
        }
    }
    // jumps the monkey to a new vine at a random location
    public String jumpNewVine()
    {
        Random generator = new Random();
        location = generator.nextInt(BOTTOM, BOTTOM + TOP);
        return(name + " the Monkey landed at " + location + " on the vine");
    }

    //provides a status update of the object state
    public String toString()
    {
        return(name + " the Monkey " + direction + " to " + location);
    }

}

