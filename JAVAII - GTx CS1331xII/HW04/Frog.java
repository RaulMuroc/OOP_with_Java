package HW04;

public class Frog {
    private String name;
    private int age;
    private double tongueSpeed;
    private boolean isFroglet;
    private static String species = "Rare Pepe";
    public static final int DEFAULT_AGE = 5;
    public static final double DEFAULT_TONGUESPEED = 5;

    public Frog (String name) {
        this(name, DEFAULT_AGE, DEFAULT_TONGUESPEED);
    }

    public Frog (String name, double ageInYears) {
        this(name, (int) (ageInYears * 12) , DEFAULT_TONGUESPEED);
    }

    public Frog (String name, int age, double tongueSpeed) {
        this.age = age;
        this.name = name;
        this.tongueSpeed = tongueSpeed;
        if (age > 1 && age < 7) {
            this.isFroglet = true;
        } else {
            this.isFroglet = false;
        }
    }

    public void grow(int months) {
        this.age += months;
        while (months - 1 > 0) {
            if (this.age < 12) {
                this.tongueSpeed += 1;
            } else if (this.age >= 30) {
                if (this.tongueSpeed >= 5) {
                    this.tongueSpeed -= 1;
                } else {
                    this.tongueSpeed = 5;
                }
            }
        }
        if (this.age > 1 && this.age < 7) {
            this.isFroglet = true;
        } else {
            this.isFroglet = false;
        }
    }

    public void grow() {
        grow(1);
    }

    public void eat(Fly fly) {
        if (!fly.isDead()) {
            if (this.tongueSpeed > fly.getSpeed()) {
                if (fly.getMass() >= (age * 0.5)) {
                    grow();
                }
                fly.setMass(0);
            } else {
                fly.grow(1);
            }
        }
    }

    // TOstring
    public String toString() {
        if (isFroglet) {
            return String.format("My name is %s and I'm a rare froglet! I'm %d months old and my tongue has a speed of %.2f.", this.name, this.age, this.tongueSpeed);
        } else {
            return String.format("My name is %s and I'm a rare frog. I'm %d months old and my tongue has a speed of %.2f.", this.name, this.age, this.tongueSpeed);
        }
    }

    // getters & setters
    // public String getName() {
    //     return this.name;
    // }
    // public void setName(String name) {
    //     this.name = name;
    // }
    // public int getAge() {
    //     return this.age;
    // }
    // public void setAge(int age) {
    //     this.age = age;
    // }
    // public double getTongueSpeed() {
    //     return this.tongueSpeed;
    // }
    // public void setTongueSpeed(double tongueSpeed) {
    //     this.tongueSpeed = tongueSpeed;
    // }
    // public boolean getIsFroglet() {
    //     return this.isFroglet;
    // }
    // public void setIsFroglet(boolean isFroglet) {
    //     this.isFroglet = isFroglet;
    // }
    public static String getSpecies() {
        return species;
    }
    public static void setSpecies(String newSpecies) {
        species = newSpecies;
    }
}

