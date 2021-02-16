package parrot;

public class Parrot {

    public static final double BASE_SPEED = 12.0;

    public Parrot() {
    }

    public double getSpeed() {
        return getBaseSpeed();
    }

    protected double getBaseSpeed() {
        return BASE_SPEED;
    }

}
