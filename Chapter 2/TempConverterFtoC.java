import java.util.Scanner;

public class TempConverterFtoC
{
    public static void main(String[] args)
    {
        final int BASE = 32;
        final double CONVERSION_FACTOR = 5.0/9.0;

//        double fahrenheitTemp;
//        int celsiusTemp = 24;

//        fahrenheitTemp = (celsiusTemp * CONVERSION_FACTOR) + BASE;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit:");
        double fahrenheitTemp = scan.nextDouble();
        double celsiusTemp = ((fahrenheitTemp - BASE) * CONVERSION_FACTOR);

        System.out.println("Celsius Temperature: " + celsiusTemp);
        System.out.println("Fahrenheit Temperature: " + fahrenheitTemp);
    }
}
