/*********************************************************************************************************************
 PascalsTriangle.java

 Kyle Matheson T00153296
 COMP1131 Assignment 5 Question 3

 Determine and print up to the Nth line of Pascal’s Triangle

 *********************************************************************************************************************/
import java.util.Scanner;

public class PascalsTriangle
{
    private static int rows;    //class variable to store user input data

    public static void main (String[] args) {
        //gather user input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows for your Pascal's Triangle:");
        rows = scan.nextInt();

        //2D array to store values.
        long[][] array = new long[rows + 1][rows + 1];    //the calcArray method requires empty [0] positions.
        array[0][0] = 1;    //seed the array with the initial fixed value

        //recursive method call to generate pascal's triangle from 1 to rows
        calcArray(1, array);

        //flag for stopping output if the values exceed 64bit
        boolean limits = false;

        //output data
        for (int row = 1; row <= rows; row++)
        {
            if(!limits)
            {
                for (int column = 1; column <= row; column++)
                {
                    //System.out.printf("(%d,%d) : %d)", row, column, array[row][column]);
                    if (array[row][column] == 0)
                    {
                        System.out.print(" Larger than 64bit ");
                        System.out.printf("\n\n64 bits exceeded at row %d\n", row);
                        limits = true;
                        break;
                    }
                    else {
                            System.out.printf(" %d ", array[row][column]);
                        }
                    }
                }
            System.out.print("\n");  //linefeed for each row
        }
    }

    //generate Pascal's Triangle upto the row the user specified, or until the data exceeds 64bit
    private static void calcArray(int row, long[][] _array)
    {
        if (row <= rows)  //base statement.  Do not exceed the max number of user defined rows
        {
            boolean limits = false;  //flag for exceeding 64bits

            for (int column = 1; column <= row; column++)  //number of array columns is the same size as the current row
            {
                long value = _array[row - 1][column - 1] + _array[row - 1][column];  //T(r, c) = T(r - 1, c - 1) + T(r - 1, c)
                //initial values that exceed 64bit will be negative.
                if (value >= 0)
                {
                    _array[row][column] = value;
                }
                else
                {
                    limits = true;
                    break;
                }
            }
            if (!limits)  //only proceed to next row if data is valid
            {
                calcArray(row + 1, _array); //increment the row and send recursively.
            }
        }
    }
}

