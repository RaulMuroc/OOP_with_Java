package HW03;

import java.util.Scanner; // only this package is allowed

public class Battleship {
    public static void main(String[] args) {
        System.out.println("Welcome to Battleship!");

        int currPlayer = 1;
        int numPlayers = 2;
        int numShips = 5;
        int currShip = 1;
        char[][] positionShipsPlayer1;
        char[][] positionShipsPlayer2;

        Scanner Scanner = new Scanner(System.in);

        // promot each user to enter coordinates for five ships of lentgh one.
        while (numPlayers > 0) {
            boolean loopForShipsFailed = false;
            System.out.println("PLAYER " + currPlayer + ", ENTER YOUR SHIPS' COORDINATES.");
            // int row = 0;
            // int col = 0;
            while (numShips > 0) { 

                System.out.println("Enter ship " + currShip + " location:");
                //boolean stillInt = true;
                boolean stillInt = true;
                while(stillInt) {
                    for(int col = 0; col++; col < 3) {
                        for(int row = 0; row++; row < 3) {
                    if (!Scanner.hasNextInt()) {
                        stillInt = false;
                        loopForShipsFailed = true;
                    } else {
                        row = Scanner.nextInt();
                    }
                    if (!Scanner.hasNextInt()) {
                        stillInt = false;
                        loopForShipsFailed = true;
                    } else {
                        col = Scanner.nextInt();
                    }
                    positionShipsPlayer1 = 
                }
                if (!stillInt) { 
                    System.out.println("Invalid coordinates. Choose different coordinates.");
                    break;
                }
                // while (!Scanner.hasNextInt()) {
                //     System.out.println("Invalid coordinates. Choose different coordinates.");
                // }
                // int col = Scanner.nextInt();

            }
            
            if (loopForShipsFailed) {
                break;
            }
            System.out.print("Enter a day of the week: ");
            String day = Scanner.next();
            numShips--;
            currShip++;
            
            // if (loopForShipsFailed) { 
            //     return false;
            // }
            // numPlayers--;
            // currPlayer++;
        }
        
    }
}