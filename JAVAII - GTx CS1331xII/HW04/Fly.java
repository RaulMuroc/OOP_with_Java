package HW04;

public class Fly {
    private float mass;
    private double speed; 
    public static final int DEFAULT_MASS = 5;
    public static final int DEFAULT_SPEED = 10;

    public Fly() {
        this(DEFAULT_MASS, DEFAULT_SPEED);
    }

    public Fly(float mass) {
        this(mass, DEFAULT_SPEED);
    }

    public Fly(float mass, double speed) {
        this.mass = mass;
        this.speed = speed;
    }

    // getters & setters
    public float getMass() {
        return this.mass;
    }

    public void setMass(float mass) {
        this.mass = mass;
    }

    public double getSpeed() {
        return this.speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    // TOstring
    public String toString() {
        if (mass == 0) {
            return "I'm dead, but I used to be a fly with a speed of " + speed + ".";
        } else {
            return "I’m a speedy fly with " + speed + "speed and " + mass + "mass.";
        }
    }

    public void grow(int addedMass) {
        this.mass += addedMass;
        if (mass < 20) {
            this.speed += 1;
        } else {
            this.speed -= 0.5;
        }
    }

    public void isDead() {
        if (this.mass == 0) {
            return true;
        } else {
            return false;
        }
    }

}
