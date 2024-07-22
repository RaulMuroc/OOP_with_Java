package HW04;

public class Pond {

    public static void main(String[] args) {
        Frog peepo = new Frog("Peepo");
        Frog pepe = new Frog( "Pepe",10, 15);
        Frog peepaw = new Frog("Peepaw", 4.6);
        Frog raul = new Frog("Raul", 38, 10);
        Fly firstFly = new Fly(1, 3);
        Fly secondFly = new Fly(6);
        Fly thirdFly = new Fly(8, 8);
        
        Frog.setSpecies("1331 Frogs");
        System.out.println(peepo);
        peepo.eat(secondFly);
        System.out.println(secondFly);
        peepo.grow(8);
        peepo.eat(secondFly);
        System.out.println(secondFly);
        System.out.println(peepo);
        System.out.println(raul);
        peepaw.grow(4);
        System.out.println(peepaw);
        System.out.println(pepe);
    }
}
