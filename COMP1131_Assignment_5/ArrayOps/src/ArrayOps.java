/*********************************************************************************************************************
 ArrayOps.java

 Kyle Matheson T00153296
 COMP1131 Assignment 5 Question 1

 Create a class that returns values for Min, Max and Average from an array of ints that's size  is defined in
 the instantiation of the object.  The values shall be from -size to +size with size being the defined size of the array.

 *********************************************************************************************************************/
import java.util.Random;

public class ArrayOps
{
    private final int SIZE;
    private final int[] ARRAY;

    public ArrayOps(int size)   //creates and populates an array the size of the constructor value
    {
        SIZE = size;
        ARRAY = new int[SIZE];


        if (SIZE > 0)  //check for valid input data
        {
            for (int i = 0; i <= SIZE - 1; i++) //populate the array with random integers from -size to size
            {
                Random generator = new Random();
                ARRAY[i] = generator.nextInt(SIZE * -1, SIZE + 1);
            }
        }
    }

    //return the smallest int in the array[]
    public int GetMin()
    {
        int currentMin = SIZE;  //initialize the highest value possible

        for (int value: ARRAY)
        {
            if (value == SIZE * -1){return value;}  //break the loop if the value matches the highest possible value
            else
            {
                if (value < currentMin){currentMin = value;}
            }

        }
        return currentMin;
    }

    //return the largest int in the array[]
    public int GetMax()
    {
        int currentMax = SIZE * -1;  //initialize the lowest value possible

        for (int value: ARRAY)
        {
            if (value == SIZE){return value;}   //break the loop if the value matches the lowest possible value
            else
            {
                if (value > currentMax){currentMax = value;}
            }

        }
        return currentMax;
    }

    //return the average of all the integers in the array[]
    public float GetAverage()
    {
        float total = 0;
        float average = 0;

        for (int value : ARRAY)
        {
            total += value;
        }
        if (SIZE != 0){average = total/SIZE;}      //check the to make sure the denominator is not zero

        return average;
    }

    //return all the values of the array[]
    public String toString()
    {
        String valueList = "";
        if (SIZE != 0)  //if the user input was zero, the array was not defined.
        {
            for (int value : ARRAY)
            {
                valueList = valueList + value + " ";
            }
            return valueList;
        }
        else
        {
            return " Array size must be greater than zero";
        }
    }
}
