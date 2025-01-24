package Chapter_2;
import java.util.Scanner;

public class ConvertFraction
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Numerator: ");
        int num = scan.nextInt();
        System.out.print("Enter Denominator: ");
        int dom = scan.nextInt();

        double decimal = (double) num / dom;

        System.out.println("Decimal value of fraction is: " + decimal);
    }
}
