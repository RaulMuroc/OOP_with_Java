package Lesson01;

import java.util.Scanner;
import java.text.NumberFormat;

public class Java_Text_NumberFormat {
    public static void main(String[] args) {
        int items;
        double itemCost, total;
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        items = input.nextInt();
        System.out.print ("Enter the cost per item: ");
        itemCost = input.nextDouble();
        total = items * itemCost;
        System.out.println();
        System.out.println ("Unformatted Total: " + total);
        NumberFormat currencyFmt = NumberFormat.getCurrencyInstance();
        System.out.println ("Formatted Total: " + currencyFmt.format(total));
    }
}