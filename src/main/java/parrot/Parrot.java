package parrot;

public abstract class Parrot {
    private static final double BASE_SPEED = 12.0;

    public double getSpeed() {
        return getBaseSpeed();
    }

    public double getBaseSpeed() {
        return BASE_SPEED;
    }

}
