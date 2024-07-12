package Exercise01;

import java.util.Arrays;

public class Game {
    int diceNum1;
    int diceNum2;
    int sumNums;
    public static final int winnerNums[] = {7, 11}; 
    public static final int loserNums[] = {2, 3, 12}; 

    public static void main(String[] args) {
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();
        int diceNum1 = dice1.Roll();
        int diceNum2 = dice2.Roll();
        int sumNums = diceNum1 + diceNum2;
        int res;
        boolean finished = false;

        res = Arrays.binarySearch(winnerNums, sumNums);
        System.out.println(" sumNums: " + sumNums);
        System.out.println(" found in 2,3,12 or 7,11: " + res);
        if (res >= 0) {
            System.out.println(" you win!");
            finished = true;

        }
        res = Arrays.binarySearch(loserNums, sumNums);
        if (res >= 0) {
            System.out.println(" you lose!");
            finished = true;
        }

        if (!finished) {
            int result = -1;
            while (result != sumNums && result != 7) {
                result = dice1.Roll() + dice2.Roll();
                System.out.println(" new result: " + result);
                System.out.println(" sumNums: " + sumNums);
            }
            if (result == sumNums) {
                System.out.println(" you win!");
                finished = true;
            }
            if (result == 7) {
                System.out.println(" you lose!");
                finished = true;
            }
        }
    }
}
