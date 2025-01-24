package Chapter_2;

public class TimeConverterFromSeconds
{
    public static void main(String[] args)
    {
        int seconds = 9999;

        int hours = seconds / 3600 ;
        int minutes = (seconds % 3600) / 60;
        int secondsRemainder = seconds % 60;

        System.out.printf("Time is %d hours, %d minutes, %d seconds%n", hours, minutes, secondsRemainder);
    }
}
