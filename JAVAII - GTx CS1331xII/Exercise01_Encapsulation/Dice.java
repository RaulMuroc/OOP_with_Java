package Exercise01_Encapsulation;

public class Dice {
    int number;

    public static int Roll (){
        return (int) ((Math.random() * (6 - 1)) + 1);
    }
    
}
