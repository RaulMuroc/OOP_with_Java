package Exercise01_Encapsulation;

public class InsectClient {
    public static void main(String[] args) {
        System.out.println(Insect.produceRandomFact());
        Insect bug1 = new Insect(13, 31, 0);
        bug1.setWeight(15);
        bug1.setX(10);
        bug1.setY(-2);
        System.out.println(bug1.getWeight());
        System.out.println(bug1.getX());
        System.out.println(bug1.getY());
        System.out.println(Insect.getPopulation());

        // stringify--serialize an object attributes
        Insect bug2 = new Insect(31, 4, 5);
        System.out.println(bug2); // automatically calls ToString()
    }
}
