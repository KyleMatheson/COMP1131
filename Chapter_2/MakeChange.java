package Chapter_2;

import java.util.Scanner;

public class MakeChange
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Dollars and Cents: ");
        double DollarsAndCents = scan.nextDouble();
        int cents = (int) Math.round(DollarsAndCents * 100);    //round to even penny

        int tenner =   (cents / 1000);
        int fives =    (cents % 1000) / 500;
        int ones =     (cents % 1000 % 500) / 100;
        int quarters = (cents % 1000 % 500 % 100) / 25;
        int dimes =    (cents % 1000 % 500 % 100 % 25) / 10;
        int nickels =  (cents % 1000 % 500 % 100 % 25 % 10) / 5;
        int pennies =  (cents % 1000 % 500 % 100 % 25 % 10 % 5);

        System.out.printf("Tens: %d\nFives: %d\nOnes: %d\n", tenner, fives, ones);
        System.out.printf("Quarters: %d\nDimes: %d\nNickels: %d\nPennies: %d",quarters, dimes, nickels, pennies);

    }

}
