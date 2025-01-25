package Chapter_3;

import java.util.Random;

public class RandomPhoneNumber
{
    public static void main(String[] args)
    {
        Random gen = new Random();

        int areaCode1 = gen.nextInt(1, 8);     //generate 3 digits with first digit restriction of 8 and 9
        int areaCode2 = gen.nextInt(0, 8);
        int areaCode3 = gen.nextInt(0, 8);
        int prefix =  gen.nextInt(100, 743);    //generate second three digits no higher than 742
        int lineNumber = gen.nextInt(1000,10000);    //generate third set of digits with no restrictions.



        System.out.println(areaCode1 + "" + areaCode2 + ""  + areaCode3  + "-" + prefix + "-" + lineNumber);
        }
}
