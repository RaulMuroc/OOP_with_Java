package Lesson01;

import java.util.Scanner;

public class FarenheitToCelsiusWithScanner 
{
    public static void main (String[] args)
    {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Farenheit value: ");
        int Farenheit = input.nextInt();
        System.out.print("Enter a day of the week: ");
        String day = input.next();
        double celsius = (5.0/9) * (Farenheit -32);
        System.out.println(day + " Farenheit: " + Farenheit);
        System.out.println(day + " Celsius: " + celsius);
    }
}