/*********************************************************************************************************************
 VectorDistance.java

 Kyle Matheson T00153296
 COMP1131 Assignment 2 Question 2

 read the (x,y) coordinates for two points. This should prompt for and read each of the four values individually.
 Compute the Cartesian distance between the two points
 *********************************************************************************************************************/
import java.util.*;

public class VectorDistance
{
    public static void main (String[] args)
    {
        // gather user input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter X for P1:");
        int x1 = scan.nextInt();
        System.out.print("Enter Y  for P1:");
        int y1 = scan.nextInt();
        System.out.print("Enter X for P2:");
        int x2 = scan.nextInt();
        System.out.print("Enter Y for P2:");
        int y2 = scan.nextInt();

        // maths
        double distance = (double) Math.sqrt( (Math.pow(x2-x1,2)) + (Math.pow(y2-y1,2)));

        // output result
        System.out.println("Cartesian Distance between P1 and P1 is:" + distance);

    }
}