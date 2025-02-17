/*********************************************************************************************************************
 CylinderMath.java

 Kyle Matheson T00153296
 COMP1131 Assignment 2 Question 3

 Read the radius and height of a cylinder then calculates and displays the volume and surface area.
 *********************************************************************************************************************/
import java.util.*;
import java.text.DecimalFormat;

public class CylinderMath
{
    public static void main(String[] args)
    {
        // gather user input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Radius of the cylinder:");
        double radius = scan.nextDouble();
        System.out.print("Enter the Height of the cylinder:");
        double height = scan.nextDouble();

        // maths
        if (radius > 0 && height > 0)
        {
            DecimalFormat fmtD4 = new DecimalFormat("0.####");
            double volume = Math.PI * Math.pow(radius, 2) * height;
            double surface = 2 * Math.PI * radius * (height + radius);

            // conditional return of data
            System.out.printf("The volume is %s and the surface area is %s\n", fmtD4.format(volume), fmtD4.format(surface));
        }
        else
            System.out.println("A cylinder must have non-zero positive values");
    }
}
