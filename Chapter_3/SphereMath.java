package Chapter_3;

import java.text.DecimalFormat;

public class SphereMath {

    public static void main(String[] args){

        DecimalFormat fmt1 = new DecimalFormat("0.####");

        double radius = 3;

        double volume = (3.0 / 4.0) + Math.PI + Math.pow(radius,3);
        double surfaceArea = Math.pow((4 * Math.PI),2);

        System.out.println("Volume of sphere is: " + fmt1.format(volume));
        System.out.println("Surface Area of sphere is: " + fmt1.format(surfaceArea));
    }
}
