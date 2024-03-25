package HW03;

import java.util.Scanner; // only this package is allowed

public class Battleship {
    public static void main(String[] args) {
        System.out.println("Welcome to Battleship!");

        Scanner Scanner = new Scanner(System.in);

        int numShips = 5;
        int currShip = 1;
        char[][] positionShipsPlayer1 = new char[5][5];
        
        // promot each user to enter coordinates for five ships of lentgh one.
        System.out.println("PLAYER 1 ENTER YOUR SHIPS' COORDINATES.");
        while (numShips > 0) { 
                int row = 0;
                int col = 0;

            System.out.println("Enter ship " + currShip + " location:");  
                while (!Scanner.hasNextInt()) {
                    System.out.println("Invalid coordinates. Choose different coordinates.");
                    Scanner.next();
                } 
                row = Scanner.nextInt();
                while (!Scanner.hasNextInt()) {
                    System.out.println("Invalid coordinates. Choose different coordinates.");
                    Scanner.next();
                } 
                col = Scanner.nextInt();
                positionShipsPlayer1[row][col] = '@';
            numShips--;
            currShip++;
        }
        int numShips2 = 5;
        int currShip2 = 1;
        char[][] positionShipsPlayer2 = new char[5][5];
        System.out.println("PLAYER 2 ENTER YOUR SHIPS' COORDINATES.");
        while (numShips2 > 0) { 
                int row = 0;
                int col = 0;

            System.out.println("Enter ship " + currShip2 + " location:");  
                while (!Scanner.hasNextInt() || row > 4 || col || > 4 || row < 0 || col < 0) {
                    System.out.println("Invalid coordinates. Choose different coordinates.");
                    Scanner.next();
                } 
                    row = Scanner.nextInt();
                
                while (!Scanner.hasNextInt()) {
                    System.out.println("Invalid coordinates. Choose different coordinates.");
                    Scanner.next();
                } 
                    col = Scanner.nextInt();
                positionShipsPlayer2[row][col] = '@';
            numShips2--;
            currShip2++;
        }

    }
            // if (loopForShipsFailed) {
            //     break;
            // }
            // System.out.print("Enter a day of the week: ");
            // String day = Scanner.next();
            
            // if (loopForShipsFailed) { 
            //     return false;
            // }
            // numPlayers--;
            // currPlayer++;
        
}