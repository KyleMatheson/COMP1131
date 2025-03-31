import java.util.Random;

public class ArrayOps
{
    private final int SIZE;
    private final int[] ARRAY;

    public ArrayOps(int size)   //creates and populates an array the size of the constructor value
    {
        SIZE = size;
        ARRAY = new int[SIZE];

        if (SIZE != 0)
        {
            for (int i = 0; i <= SIZE - 1; i++) //populate the array with random integers from -size to size
            {
                Random generator = new Random();
                ARRAY[i] = generator.nextInt(SIZE * -1, SIZE + 1);
            }
        }
    }
    public int GetMin() //return the smallest int in the array[]
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

    public int GetMax() //return the largest int in the array[]
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

    public float GetAverage()   //return the average of all the integers in the array[]
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


    public String toString()    //return all the values of the array[]
    {
        String valueList = "";
        if (SIZE != 0)
        {
            for (int value : ARRAY)
            {
                valueList = valueList + value + " ";
            }
            return valueList;
        }
        else
        {
            return "Array size cannot be zero";
        }

    }

}
