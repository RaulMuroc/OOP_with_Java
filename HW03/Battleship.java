package HW03;

import java.util.Scanner; // only this package is allowed

public class Battleship {
    public static void main(String[] args) {
        char[][] p1Board = new char[5][5];   
        char[][] p2Board = new char[5][5];
        char[][] p1BoardTrack = new char[5][5];   
        char[][] p2BoardTrack = new char[5][5];
        p1Board = InitializeGameBoard(p1Board);
        p2Board = InitializeGameBoard(p2Board);
        p1BoardTrack = InitializeGameBoard(p1BoardTrack);
        p2BoardTrack = InitializeGameBoard(p2BoardTrack);

        System.out.println("Welcome to Battleship!");
        Scanner Scanner = new Scanner(System.in);
      
        // player 1
        System.out.println("PLAYER 1, ENTER YOUR SHIPS COORDINATES.");
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter ship " + (i + 1) + " location");
            //StandByIfNoInt(Scanner);
            int row = Scanner.nextInt();
            int col = Scanner.nextInt();
            if (!checkCoordinates(row, col)) {
                System.out.println("Invalid Cordinates. choose different Coordinates.");
                i--;
            } else {
                if (p1Board[row][col] != '-') {
                    System.out.println("You already have a ship there. Choose different Coordinates.");
                    i--;
                } else {
                    p1Board[row][col] = '@';
                }
            }
        }
        printBattleShip(p1Board);

        // player 2
        System.out.println("PLAYER 2, ENTER YOUR SHIPS COORDINATES.");
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter ship " + (i + 1) + " location");
            StandByIfNoInt(Scanner);
            int row = Scanner.nextInt();
            int col = Scanner.nextInt();
            if (!checkCoordinates(row, col)) {
                System.out.println("Invalid Cordinates. choose different Coordinates.");
                i--;
            } else {
                if (p2Board[row][col] != '-') {
                    System.out.println("You already have a ship there. Choose different Coordinates.");
                    i--;
                } else {
                    p2Board[row][col] = '@';
                }
            }
        }
        printBattleShip(p2Board);
            
        // // prints
        // printBattleShip(playerOneShotsBoard);
        // printBattleShip(playerTwoShotsBoard);
    }

    public static void StandByIfNoInt(Scanner scanner) {
        //Scanner Scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) { 
            System.out.println("Invalid coordinates. Choose different coordinates.");
            scanner.nextLine();
        }
        //Scanner.close();
        System.out.println("End StandByIfNotINt");
    }
    
    

    // public static int[] CalculateRowAndCol(int currShip) { 
    //     System.out.println("Called -> CalculateRowAndCol");
    //     int i = 0;
    //     int[] rowCol = new int[2];
    //     Scanner Scanner = new Scanner(System.in);
    //     System.out.println("Enter ship " + currShip + " location:");
    //     //StandByIfNoInt();
    //    // System.out.println("Out StandByIFNOtint");
        
    //     //System.out.println("Out_2 StandByIFNOtint");
    //     if (Scanner.hasNextLine()) {
    //         String line = Scanner.nextLine();
    //         Scanner scan = new Scanner(line);
    //         while(scan.hasNextInt()) {
    //             System.out.println("In HasNextInt while");
    //             int nextInt = scan.nextInt();
    //             if (nextInt > 4) {
    //                 System.out.println("Check00");
    //                 System.out.println("Invalid coordinates BIG. Choose diferent coordinates.");
    //                 System.out.println("Check00_2");
    //                 // if (!Scanner.hasNextInt()) {
    //                 //     StandByIfNoInt();
    //                 // }
    //                 //rowCol[0] = Scanner.nextInt();
    //             }
    //             if (nextInt < 0) {
    //                 System.out.println("Check01");
    //                 System.out.println("Invalid coordinates SAMLL. Choose diferent coordinates.");
    //                 System.out.println("Check01_2");
    //                 //rowCol[1] = Scanner.nextInt();
    //                 //Scanner.next();
    //             }
    //             rowCol[i] = nextInt;
    //             i++;
    //             System.out.println("next");
    //         }
    //         scan.close();
    //     }
    //     System.out.println("Out loop");
    //     Scanner.close();
        

        // System.out.println("what is rowCol[0] " + rowCol[0]); 
        // System.out.println("what is rowCol[1] " + rowCol[1]);
        // System.out.println("Check OK");
        // while (!Scanner.hasNextInt() || Scanner.nextInt() > 4 || Scanner.nextInt() < 0) {  
        //     System.out.println("Invalid coordinates. Choose different coordinates.");
        //     //Scanner.nextInt();
        // } 
        // System.out.println("Check 03");
        // rowCol[1] = Scanner.nextInt();
    //      System.out.println("Check 04");
    //     return rowCol;
    // }

    public static boolean checkCoordinates(int row, int col) {
        return (row > 4 || row < 0 || col > 4 || col < 0) ? false : true;
    }

    private static char[][] InitializeGameBoard(char[][] Board) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                Board[i][j] = '-';
            }
        }
        return Board;
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
