package HW04;

public class Frog {
    private String name;
    private int age;
    private double tongueSpeed;
    private boolean isFroglet;
    public final String species = "Rare Pepe";
    public static final int DEFAULT_AGE = 5;
    public static final int DEFAULT_TONGUESPEED = 5;


public Frog (int age, String name, double tongueSpeed) {
    this.age = age;
    this.name = name;
    this.tongueSpeed = tongueSpeed;
}
public Frog (String name, double ageInYears, double tongueSpeed) {
    this.age = (int) (ageInYears * 12);
    this.name = name;
    this.tongueSpeed = tongueSpeed;
}

public Frog (String name) {
    this.name = name;
    this.age = DEFAULT_AGE;
    this.tongueSpeed = DEFAULT_TONGUESPEED;
}

public void grow(int months) {
    this.age += months;
    if (this.age < 12) {
        this.tongueSpeed += 1;
    } else if (this.age >= 30) {
        if (this.tongueSpeed > 5) {
            this.tongueSpeed -= 1;
        }
    }
    if (this.age > 1 && this.age < 7) {
        this.isFroglet = true;
    } else {
        this.isFroglet = false;
    }
}

}

