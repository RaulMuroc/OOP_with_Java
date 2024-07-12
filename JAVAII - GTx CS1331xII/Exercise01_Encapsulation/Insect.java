public class Insect {
    private double weight;
    private int x;
    private int y;

    // static consonants/variables
    public static final int DEFAULT_X = 0;
    public static final int DEFAULT_Y = 0;
    public final double DIST_WEIGHT_LOSS_FACTOR = .0001;
    private static int population = 0;
    private static final String[] FACTS = {
        "The two main groups of insects are winged and wingless",
        "There are more than 1 million insect species",
        "Insects are cold-blooded",
        "SPiders are not considered insects"
    };

    // constructor
    public Insect(double initWeight) {
        this(initWeight, DEFAULT_X, DEFAULT_Y);
        //weight = initWeight;
        //x = DEFAULT_X;
        //y = DEFAULT_Y;
        //population++;
    }

    public Insect(double initWeight, int initX, int initY) {
        this.weight = initWeight;
        this.x = initX;
        this.y = initY;
        population++;
    }

    /*
        methods
    */

    // accessors
    public double getWeight() {
        return weight;
    } 
    public int getX() {
        return x;
    } 
    public int getY() {
        return y;
    } 
    public static int getPopulation() {
        return population;
    } 

    // validators for mutators
    private static boolean isLegalWeight(double newWeight) {
        return newWeight >= 0;
    }
    private static boolean isLegalX(double newX) {
        return newX >= 0;
    }
    private static boolean isLegalY(double newY) {
        return newY >= 0;
    }

    //mutators
    public void setWeight(double newWeight) {
        if (isLegalWeight(newWeight)) {
            weight = newWeight;
        }
    } 
    public void setX(int newX) {
        if (isLegalX(newX)) {
            x = newX;
        }
    } 
    public void setY(int newY) {
        if (isLegalY(newY)) {
            y = newY;
        }
    } 

    // other methods
    public void eat(double amount) {
        System.out.println("Nibble Nibble");
        this.weight = this.weight + amount;
    }
    
    public void move(int newX, int newY) {
        double distance = calculateDistance(x, y, newX, newY);
        if (distance > 0) {
            this.x = newX;
            this.y = newY;
            this.weight = this.weight * DIST_WEIGHT_LOSS_FACTOR * distance;
            System.out.printf("Moved %.2f units\n", distance);
        }
        else
            System.out.println("Stayig put");
    }

    private static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((y2-y1) * (y2 - y1) + (x2-x1) * (x2-x1));
    }
    
    public static String produceRandomFact() {
        int index = (int)(Math.random() * ((FACTS.length -1)+1)); // <-- min is 0, max is length of array
        // other random expressions
            // random ints -->                         (int)(Math.random() * ((max - min) + 1)) + min
            // random int in the range [0,max-min] --> (int)(Math.random() * ((max - min) + 1))
        return FACTS[index];
    }

    // stringify--serialize an object's attributes
    public String toString() {
        return "weight: " + weight + ", x: " + x + ", y: " + y;
    }

    // test method
    public static void main(String[] args) {
        // Insect buzz1 = new Insect();
        // Insect buzz2 = new Insect();
        System.out.println("Insect population: " + population);
        Insect bug1 = new Insect(10, 100, 90);
        System.out.println("Insect population: " + population);
        Insect bug2 = new Insect(4, -300, 400);
        System.out.println("Insect population: " + population);
        bug1.move(1, 10);
        bug2.move(-300, 400);
        System.out.println(produceRandomFact());
    }
}