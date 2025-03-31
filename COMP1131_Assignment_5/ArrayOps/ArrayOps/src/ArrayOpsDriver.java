import java.util.Scanner;

public class ArrayOpsDriver
{
    public static void main(String[] args)
    {
        int response;
        System.out.print("Enter the array size:");
        Scanner scan = new Scanner(System.in);
        response = scan.nextInt();

        ArrayOps test = new ArrayOps(response);

        System.out.println("The Array Values are:" + test.toString());
        System.out.println("The Maximum Value is:" + test.GetMax());
        System.out.println("The Minimum Value is:" + test.GetMin());
        System.out.println("The Array Average is:" + test.GetAverage());


    }
}
