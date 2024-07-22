package Exercise03_Interfaces;

public class GroomEverything {
    public static void main(String[] args) {
        Object[] groomer = {
            new Wolf(17.01, 3),
            new Poodle("richie", 9, "Lux Brand", "Rich Brand"),
            new Wolf(16, 5),
            new Poodle("pixy", 4, "Top shelf", "only the best")
        };

         for (Object c : groomer) { // groom everything
             c.groom(); // undefined for type Object --> need of an interface
         }
    }

}
