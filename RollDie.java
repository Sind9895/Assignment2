package assignment;

public class RollDie
{
    public static void main(String[] args)
    {
        int sides=6;
        int roll;
        roll = (int) (Math.random() * sides) + 1;
        System.out.println(roll);

    }
}
