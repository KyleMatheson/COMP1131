package Chapter_3;

public class CoordinateDistance
{
    public static void main(String[] args){

        double p1x = -5;
        double p1y = -2;
        double p2x = 8;
        double p2y = -3;

        double distance = Math.sqrt( (Math.pow((p1x - p2x),2)) + (Math.pow((p1y - p2y),2)));


        System.out.println("Distance = " + distance);
    }
}
