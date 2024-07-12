package Exercise01;

public class Dice {
    int number;

    public int Roll (){
        return (int) ((Math.random() * (6 - 1)) + 1);
    }
    
}
