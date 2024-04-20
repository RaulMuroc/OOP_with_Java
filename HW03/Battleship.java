package HW03;

import java.util.Scanner; // only this package is allowed

public class Battleship {
    public static void main(String[] args) {
        char[][] p1HistoryBoard = new char[5][5];   
        char[][] p2HistoryBoard = new char[5][5];
        char[][] p1TrackingBoard = new char[5][5];   
        char[][] p2TrackingBoard = new char[5][5];
        p1HistoryBoard = InitializeGameBoard(p1HistoryBoard);
        p2HistoryBoard = InitializeGameBoard(p2HistoryBoard);
        p1TrackingBoard = InitializeGameBoard(p1TrackingBoard);
        p2TrackingBoard = InitializeGameBoard(p2TrackingBoard);

        System.out.println("Welcome to Battleship!\n");
        Scanner Scanner = new Scanner(System.in);
      
        // player 1
        System.out.println("PLAYER 1, ENTER YOUR SHIPS' COORDINATES.");
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter ship " + (i + 1) + " location:");
            StandByIfNoInt(Scanner);          
            int row = Scanner.nextInt();
            int col = Scanner.nextInt();
            if (!checkCoordinates(row, col)) {
                System.out.println("Invalid coordinates. Choose different coordinates.");
                i--;
            } else if (CheckIsUsed(row, col, p1HistoryBoard)) {
                System.out.println("You already have a ship there. Choose different coordinates.");
                i--;
            } else {
                p1HistoryBoard[row][col] = '@';
            }
        }
        printBattleShip(p1HistoryBoard);
        Add100Newlines();

        // player 2
        System.out.println("PLAYER 2, ENTER YOUR SHIPS' COORDINATES.");
        int i = 0;
        do {
            System.out.println("Enter ship " + (i + 1) + " location:");
            StandByIfNoInt(Scanner);
            int row = Scanner.nextInt();
            int col = Scanner.nextInt();
            if (!checkCoordinates(row, col)) {
                System.out.println("Invalid coordinates. Choose different coordinates.");
                i--;
            } else if (CheckIsUsed(row, col, p2HistoryBoard)) {
                System.out.println("You already have a ship there. Choose different coordinates.");
                i--;
            } else {
                p2HistoryBoard[row][col] = '@';
            }
            i++;
        } while(i < 5);
        printBattleShip(p2HistoryBoard);
        Add100Newlines();
        boolean firstAccess= true;
        boolean isNoResult = false;

        // loop between players until a winner is reached
        boolean winner = false;
        while(!winner){
            boolean turnPlayer1 = true;
            boolean turnPlayer2 = false;
            while (turnPlayer1) {
                // player 1 - attack
                if (firstAccess || isNoResult) {
                    System.out.println("Player 1, enter hit row/column:");
                    firstAccess = false;
                } else {
                    System.out.println();
                    System.out.println("Player 1, enter hit row/column:");
                }
                int row = Scanner.nextInt();
                int col = Scanner.nextInt();
                if (!checkCoordinates(row, col)) {
                    System.out.println("Invalid coordinates. Choose different coordinates.");
                    firstAccess = true; 
                    continue;
                } 
                boolean result = checkPassedCoordinates(row, col, p1TrackingBoard, p2HistoryBoard, 1, 2);
                if (!result) {
                    isNoResult = true;
                    continue;
                }
                else {
                   isNoResult = false;
                   p1TrackingBoard = attackWithPassedCoordinatesTrack(row, col, p1TrackingBoard, p2HistoryBoard);
                   p2HistoryBoard = attackWithPassedCoordinatesHistory(row, col, p2HistoryBoard);
                   printBattleShip(p1TrackingBoard);
                   if (!checkBoard(p2HistoryBoard)) {
                        winningPlayer(1, p1HistoryBoard, p2HistoryBoard);
                        winner = true;
                        turnPlayer2 = false;
                    }
                    if (winner) {
                        turnPlayer2 = false;
                        turnPlayer1 = false;
                       } else {
                        turnPlayer2 = true;
                        turnPlayer1 = false;
                       }
                }
            }

            boolean isContinue = false;
            boolean isNoResultP2 = false;

            while (turnPlayer2) {
                // player 2 - attack
                if (isContinue || isNoResultP2) {
                    System.out.println("Player 2, enter hit row/column:");
                }
                else 
                {
                    System.out.println("\nPlayer 2, enter hit row/column:");
                }
                int row = Scanner.nextInt();
                int col = Scanner.nextInt();
                if (!checkCoordinates(row, col)) {
                    System.out.println("Invalid coordinates. Choose different coordinates.");
                    //irstAccess = true; 
                    isContinue = true;
                    continue;
                }
                isContinue = false;
                boolean result = checkPassedCoordinates(row, col, p2TrackingBoard, p1HistoryBoard, 2, 1);
                if (!result) {
                    isNoResultP2 = true;
                    continue;
                }
                else {
                    isNoResultP2 = false;
                   p2TrackingBoard = attackWithPassedCoordinatesTrack(row, col, p2TrackingBoard, p1HistoryBoard);
                   p1HistoryBoard = attackWithPassedCoordinatesHistory(row, col, p1HistoryBoard);
                   printBattleShip(p2TrackingBoard);
                   if (!checkBoard(p1HistoryBoard)) {
                        winningPlayer(2, p1HistoryBoard, p2HistoryBoard);
                        winner = true;
                        turnPlayer1 = false;
                   }
                   if (winner) {
                    turnPlayer2 = false;
                    turnPlayer1 = false;
                   } else {
                    turnPlayer2 = false;
                    turnPlayer1 = true;
                   }
                }
            }
        }
    }

    public static void StandByIfNoInt(Scanner scanner) {
        //Scanner Scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) { 
            System.out.println("Invalid coordinates. Choose different coordinates.");
            scanner.nextLine();
        }
    }

    private static boolean checkCoordinates(int row, int col) {
        return (row > 4 || row < 0 || col > 4 || col < 0) ? false : true;
    }

    private static boolean CheckIsUsed(int row, int col, char[][] board) {
        return (board[row][col] != '-') ? true : false;
    }

    private static char[][] InitializeGameBoard(char[][] Board) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                Board[i][j] = '-';
            }
        }
        return Board;
    }

    private static void Add100Newlines() {
        int newlines = 100;
        while(newlines > 0) {
            System.out.println();
            newlines--;
        }
    }

    private static boolean checkPassedCoordinates(int row, int col, char[][] boardToTrack, char[][] historyBoard, int player, int receiver) {
        char currValueTrack   = boardToTrack[row][col];
        char currValueHistory = historyBoard[row][col];
        if (currValueTrack == '-') {
            if (currValueHistory == '@') {
                System.out.println("PLAYER " + player + " HIT PLAYER " + receiver + "'s SHIP!");
                return true;
            } else if (currValueHistory == '-') {
                System.out.println("PLAYER " + player + " MISSED!");
                return true;
            }
        } else if (currValueTrack == 'O' || currValueTrack =='X') {
                 System.out.println("You already fired on this spot. Choose different coordinates.");
                 return false;
        }
        return false;
    }

    private static char[][] attackWithPassedCoordinatesTrack(int row, int col, char[][] boardToUpdate, char[][] boardToRead) {
        char readValue = boardToRead[row][col];
        char currValue = boardToUpdate[row][col];
        if (readValue == '@') {
            boardToUpdate[row][col] = 'X';
        } else {
            boardToUpdate[row][col] = 'O';
        }
        return boardToUpdate;
    }

    private static char[][] attackWithPassedCoordinatesHistory(int row, int col, char[][] boardToUpdate) {
        char currValue = boardToUpdate[row][col];
        if (currValue == '@') {
            boardToUpdate[row][col] = 'X';
        } else {
            boardToUpdate[row][col] = 'O';
        }
        return boardToUpdate;
    }

    public static void winningPlayer(int winner, char[][] P1HistoryBoard, char[][] P2HistoryBoard) {
        System.out.println("PLAYER " + winner + " WINS! YOU SUNK ALL OF YOUR OPPONENT'S SHIPS!\n");
        System.out.println("Final boards:");
        System.out.println();
        printBattleShip(P1HistoryBoard);
        System.out.println();
        printBattleShip(P2HistoryBoard);
    }

    public static boolean checkBoard(char[][] board) {
        boolean result = false;
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (board[row][col] == '@') {
                    result = true;
                }
            }
        }
        return result;
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