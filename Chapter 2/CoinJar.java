public class CoinJar
{
    public static void main(String[] args)
    {
        float quarters = 1;
        float dimes = 2;
        float nickels = 3;
        float pennies = 4;

        float dollars = ((quarters * 25) + (dimes * 10) + (nickels * 5) + pennies)/100;

        System.out.println("Total Value in the coin jar: $" + dollars);
    }
}
