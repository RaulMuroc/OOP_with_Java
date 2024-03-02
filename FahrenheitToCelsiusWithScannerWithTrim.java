import java.util.Scanner;
public class FahrenheitToCelsiusWithScannerWithTrim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Fahrenheit value and the day of the week: ");
        int fahrenheit = input.nextInt();
        String day = input.next().trim();
        double celsius = (5.0/9) * (fahrenheit - 32);
        //System.out.println(day + " Fahrenheit: " + fahrenheit);
        //System.out.println(day + " Celsius: " + celsius);
        System.out.printf("%s Fahrenheit: %d\n", day, fahrenheit);
        System.out.printf("%s Celsius:    %.1f\n", day, celsius);
    }
}