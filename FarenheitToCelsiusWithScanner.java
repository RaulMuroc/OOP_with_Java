import java.util.Scanner;

public class FarenheitToCelsiusWithScanner 
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Farenheit value: ");
        int Farenheit = input.nextInt();
        double celsius = (5.0/9) * (Farenheit -32);
        System.out.println("Celsius: " + celsius);
    }
}