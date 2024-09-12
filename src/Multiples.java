import java.util.Arrays;

public class Multiples
{
    public static void main(String[] args)
    {
        int sum = 0;
        for (int i = 0; i < 1000; i++)
        {
            if (i % 3 == 0)
            {
                sum += 1;
            }
            else if (i % 5 == 0)
            {
                sum += 1;
            }
        }
        System.out.println(sum);
    }

}