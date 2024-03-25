package HW03;

import java.util.Scanner; // only this package is allowed

public class Battleship {
    public static void main(String[] args) {
        System.out.println("Welcome to Battleship!");
        int[] RowCol = new int[2];
        
        // player 1
        System.out.println("PLAYER 1, ENTER YOUR SHIPS' COORDINATES.");   
        char[][] playerOneShotsBoard = new char[5][5];   
        int numShips = 5;
        int currShip = 1;
        while (numShips > 0) { 
            RowCol = CalculateRowAndCol(currShip);   
            playerOneShotsBoard[RowCol[0]][RowCol[1]] = '@';
            numShips--;
            currShip++;
        }

        // player 2
        System.out.println("PLAYER 2, ENTER YOUR SHIPS' COORDINATES.");
        char[][] playerTwoShotsBoard = new char[5][5];
        numShips = 5;
        currShip = 1;
        while (numShips > 0) { 
            RowCol = CalculateRowAndCol(currShip);   
            playerTwoShotsBoard[RowCol[0]][RowCol[1]] = '@';
            numShips--;
            currShip++;
        }
            
        // prints
        printBattleShip(playerOneShotsBoard);
        printBattleShip(playerTwoShotsBoard);
    }

    public static int[] CalculateRowAndCol(int currShip) {
        int[] rowCol = new int[2];
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter ship " + currShip + " location:");
        while (!Scanner.hasNextInt() || Scanner.nextInt() > 4 || Scanner.nextInt() < 0) { 
            System.out.println("Invalid coordinates. Choose different coordinates.");
            Scanner.nextLine();
        } 
        System.out.println("Check 01");
        rowCol[0] = Scanner.nextInt();
        System.out.println("what is rowCol[0] " + rowCol[0]); 
        System.out.println("Check 02");
        while (!Scanner.hasNextInt() || Scanner.nextInt() > 4 || Scanner.nextInt() < 0) {  
            System.out.println("Invalid coordinates. Choose different coordinates.");
            Scanner.next();
        } 
        System.out.println("Check 03");
        rowCol[1] = Scanner.nextInt();
        System.out.println("Check 04");
        return rowCol;
    }

    private static void printBattleShip(char[][] player) {
		System.out.print("  ");
		for (int row = -1; row < 5; row++) {
			if (row > -1) {
				System.out.print(row + " ");
			}
			for (int column = 0; column < 5; column++) {
				if (row == -1) {
					System.out.print(column + " ");
				} else {
					System.out.print(player[row][column] + " ");
				}
			}
			System.out.println("");
		}
	}
        
}

/*
 * 
 * import java.util.Scanner;
public class Battleship {
	public static void main(String[] args) {

	}

	// Use this method to print game boards to the console.
	private static void printBattleShip(char[][] player) {
		System.out.print("  ");
		for (int row = -1; row < 5; row++) {
			if (row > -1) {
				System.out.print(row + " ");
			}
			for (int column = 0; column < 5; column++) {
				if (row == -1) {
					System.out.print(column + " ");
				} else {
					System.out.print(player[row][column] + " ");
				}
			}
			System.out.println("");
		}
	}
}
 * 
*/
