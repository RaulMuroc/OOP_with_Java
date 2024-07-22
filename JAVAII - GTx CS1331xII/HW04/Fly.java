package HW04;

public class Fly {
    private double mass;
    private double speed; 
    public static final int DEFAULT_MASS = 5;
    public static final int DEFAULT_SPEED = 10;

    // constructors
    public Fly() {
        this((double)DEFAULT_MASS);
    }

    public Fly(double mass) {
        this(mass, (double) DEFAULT_SPEED);
    }

    public Fly(double mass, double speed) {
        this.mass = mass;
        this.speed = speed;
    }

    // getters & setters
    public double getMass() {
        return this.mass;
    }

    public void setMass(double mass) {
        if (mass >= 0) {
            this.mass = mass;
        }
    }

    public double getSpeed() {
        return this.speed;
    }

    public void setSpeed(double speed) {
        if (speed > 0) {
            this.speed = speed;
        }
    }

    // TOstring
    public String toString() {
        if (mass == 0) {
            return String.format("I'm dead, but I used to be a fly with a speed of %.2f.", speed);
        } else {
            return String.format("I'm a speedy fly with %.2f speed and %.2f mass.", speed, mass);
        }
    }

    public void grow(int addedMass) {
        this.mass += addedMass;
        while (addedMass-1 > 0) {
            if (this.mass < 20) {
                this.speed += 1;
            } else {
                this.speed -= 0.5;
            }
        }
    }

    public boolean isDead() {
        return (this.mass == 0);
     }
}
