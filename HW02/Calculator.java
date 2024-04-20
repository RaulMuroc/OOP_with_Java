package HW02;

import java.util.Scanner;  // Import the Scanner class

public class Calculator {
    public static void main(String[] args) {
        /*
         * add - takes two integers, adds them together and prints out the result
subtract - takes two integers, subtracts the second entered integer from the first and prints out the result
multiply - takes two doubles, multiplies them together and prints out the result to two decimal places
divide - takes two doubles, divides the first entered double by the second and prints out the result to two decimal places
alphabetize - takes two words (without spaces) and tells which word comes before the other lexicographically
         */
        // print out the list of operations for the user
        System.out.println("List of operations: add subtract multiply divide alphabetize");
        // prompt the user to enter an operation case insensitive, the program should print this error if invalid op -> "Invalid input entered. Terminating..."
        Scanner Scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter an operation:");
        String userOperation = Scanner.nextLine();  // Read user input
        if (!(userOperation.equalsIgnoreCase("add") || userOperation.equalsIgnoreCase("subtract") || userOperation.equalsIgnoreCase("multiply") || userOperation.equalsIgnoreCase("divide") || userOperation.equalsIgnoreCase("alphabetize"))) {
            System.out.println("Invalid input entered. Terminating...");
        }
        switch (userOperation.toLowerCase()) {
            case "add":
                System.out.println("Enter two integers:");
                if (Scanner.hasNextInt()) {
                    int number1 = Scanner.nextInt();  // Read user input
                    if (Scanner.hasNextInt()) {
                        int number2 = Scanner.nextInt();  // Read user input
                        int Result = number1 + number2;
                        System.out.println("Answer: " + Result);
                    } else {
                        System.out.println("Invalid input entered. Terminating...");
                    }
                } else {
                    System.out.println("Invalid input entered. Terminating...");
                }
                //System.out.println("enter second number");
                break;
             case "subtract":
                System.out.println("Enter two integers:");
                if (Scanner.hasNextInt()) {
                    int number3 = Scanner.nextInt();  // Read user input
                    if (Scanner.hasNextInt()) {
                        int number4 = Scanner.nextInt();  // Read user input
                        int Result2 = number3 - number4;
                        System.out.println("Answer: " + Result2);
                    } else {
                        System.out.println("Invalid input entered. Terminating...");
                    } 
                } else {
                    System.out.println("Invalid input entered. Terminating...");
                }
                 break;
             case "multiply":
                System.out.println("Enter two doubles:");
                if (Scanner.hasNextDouble()) {
                    double number5 = Scanner.nextDouble();  // Read user input
                    if (Scanner.hasNextDouble()) {
                        double number6 = Scanner.nextDouble();  // Read user input
                        double Result3 = number5 * number6;
                        System.out.println("Answer: " + String.format("%.2f", Result3) );
                    } else {
                        System.out.println("Invalid input entered. Terminating...");
                    }
                } else {
                    System.out.println("Invalid input entered. Terminating...");
                }
                 break;
             case "divide":
                System.out.println("Enter two doubles:");
                if (Scanner.hasNextDouble()) {
                    double number7 = Scanner.nextDouble();  // Read user input
                    if (Scanner.hasNextDouble()) {
                        double number8 = Scanner.nextDouble();  // Read user input
                        if (number8 == 0) {
                            System.out.println("Invalid input entered. Terminating..."); 
                            break;
                        }
                        double Result4 = number7 / number8;
                        System.out.println("Answer: " + String.format("%.2f", Result4) );
                    } else {
                        System.out.println("Invalid input entered. Terminating...");
                    }
                } else {
                    System.out.println("Invalid input entered. Terminating...");
                }
                 break;
            case "alphabetize":
                System.out.println("Enter two words:");
                if (Scanner.hasNext()) {
                    String firstWord = Scanner.next();  // Read user input
                    if (Scanner.hasNext()) {
                        String secondWord = Scanner.next();  // Read user input
                        int Result5 = firstWord.compareToIgnoreCase(secondWord);
                        if (Result5 > 0){
                            System.out.println("Answer: " + secondWord +" comes before " + firstWord + " alphabetically.");
                        } else if (Result5 < 0) {
                            System.out.println("Answer: " + firstWord + " comes before " + secondWord + " alphabetically.");
                        }else {
                            System.out.println("Answer: Chicken or Egg.");
                        }
                    } else {
                        System.out.println("Invalid input entered. Terminating...");
                    }
                } else {
                    System.out.println("Invalid input entered. Terminating...");
                }                
                break; 
            default:
                break;
        }
        Scanner.close();
    }
}
