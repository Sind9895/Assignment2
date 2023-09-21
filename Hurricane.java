package assignment;

public class Hurricane
{
    public static void main(String[] args)
    {
        int windSpeed = Integer.parseInt(args[0]);
        if(windSpeed <  65)
            System.out.println("Not a hurricane");
        else if (windSpeed <= 95)
            System.out.println("Class 1 hurricane");
        else if (windSpeed <= 110)
            System.out.println("Class 2 hurricane");
        else if (windSpeed <= 129)
            System.out.println("Class 3 hurricane");
        else if (windSpeed <= 156)
            System.out.println("Class 4 hurricane");
        else
            System.out.println("Class 5 hurricane");

    }
}
