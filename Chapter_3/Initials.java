package Chapter_3;

import java.util.Scanner;
import java.util.Random;

public class Initials
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        System.out.print("Enter First Name:");
        String firstName = scan.nextLine();
        System.out.print("Enter Last Name:");
        String lastName = scan.nextLine();

        System.out.println(firstName.substring(0,1) + lastName.substring(0,5) + (generator.nextInt(10, 100 )) );
    }
}
