import java.util.Scanner;

public class FarenheitToCelsius 
{
    public static void main (String[] args)
    {//Scanner input = new Scanner(System.in);
        int saturdayFahrenheit;
        int sundayFahrenheit;
        saturdayFahrenheit = 78;
        sundayFahrenheit = 81;
        double saturdayCelsius = (5.0/9) * (saturdayFahrenheit - 32);
        double sundayCelsius = (5.0/9) * (sundayFahrenheit - 32);
        System.out.println("Weekend Averages");
        System.out.println("Saturday: " + saturdayCelsius);
        System.out.println("Syunday: " + sundayCelsius);
    }
}