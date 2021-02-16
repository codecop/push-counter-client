package parrot;

public class Parrot {
    private static final double BASE_SPEED = 12.0;

    public double getSpeed() {
        return getBaseSpeed();
    }

    protected double getBaseSpeed() {
        return BASE_SPEED;
    }

}
