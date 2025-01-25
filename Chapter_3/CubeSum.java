package Chapter_3;

import java.util.Scanner;
import java.lang.Math;

public class CubeSum {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Value 1 to cube:");
        double num1 = Math.pow(scan.nextInt(),3);  //cube the entered value

        System.out.print("Value 2 to cube:");
        double num2 = Math.pow(scan.nextInt(),3);  //cube the entered value

        System.out.println("Sum of two values cubed is: " + (num1 + num2));  //sum and return the cubed values
    }
}
