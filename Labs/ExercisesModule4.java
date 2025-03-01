package Labs;

public class ExercisesModule4
{
    public static void main (String[] args)
    {
        String name = "Kylez Mathesonz";
        int count = 0;

        while(name.indexOf('z')>0)
        {
            count++;
            name = name.substring(name.indexOf('z')+1);
        }
        System.out.println(count);
    }
}
